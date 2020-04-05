import java.util.Scanner;

public class PhoneSearch {
    private Scanner reader;
    private PhoneBook phoneBook;

    public PhoneSearch(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        this.phoneBook = new PhoneBook();
        System.out.println("phone search");
        printMenu();
        commands();
    }

    public void printMenu() {
        System.out.println("available operations:");
        System.out.println("  1 add a number");
        System.out.println("  2 search for a number");
        System.out.println("  3 search for a person by phone number");
        System.out.println("  4 add an address");
        System.out.println("  5 search for personal information");
        System.out.println("  6 delete personal information");
        System.out.println("  7 filtered listing");
        System.out.println("  x quit");
    }

    public void commands() throws IllegalArgumentException{
        String input = null;
        while (input != "x") {
            System.out.println("command:");
            input = this.reader.nextLine();
            int command = 0;
            if (input.equals("x")) {
                break;
            }
            try {
                command = Integer.parseInt(input);
                if (command < 1 || command > 7) {
                    throw new IllegalArgumentException("Enter a number between 1 and 7 or x to quit");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Enter a number between 1 and 7 or x to quit");
            }
            switch (command) {
                case 1:
                    //adds phone number and person
                    System.out.println("whose number:");
                    String name = reader.nextLine();
                    System.out.println("number:");
                    String number = reader.nextLine();

                    phoneBook.add(name, number);
                    break;
                case 2:
                    //searches phone number using name
                    System.out.println("whose number:");
                    String searchName = reader.nextLine();

                    phoneBook.searchByName(searchName);
                    break;
                case 3:
                    //searches name using phone number
                    System.out.println("number:");
                    String searchNumber = reader.nextLine();

                    phoneBook.searchByNumber(searchNumber);
                    break;
                case 4:
                    //adds address and person
                    System.out.println("whose address:");
                    String addressName = reader.nextLine();
                    System.out.println("street:");
                    String streetSetter = reader.nextLine();
                    System.out.println("city:");
                    String citySetter = reader.nextLine();

                    phoneBook.addAddress(addressName, streetSetter, citySetter);
                    break;
                case 5:
                    //searches personal info using name
                    System.out.println("whose information:");
                    String searchNameInformation = reader.nextLine();

                    phoneBook.searchPersonalInformation(searchNameInformation);
                    break;
                case 6:
                    //removes entry from phonebook
                    System.out.println("whose information:");
                    String toDelete = reader.nextLine();

                    phoneBook.remove(toDelete);
                    break;
                case 7:
                    //filteredsearch
                    System.out.println("keyword (if empty, all listed):");
                    String keyword = reader.nextLine();

                    phoneBook.filteredSearch(keyword);
                    break;
            }
        }
    }


}


import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();


        //while loop until student name is empty
        while (true) {
            System.out.println("name:");
            String inputName = reader.nextLine();
            if (inputName.isEmpty()) {
                break;
            }
            System.out.println("student number:");
            String inputStudentNumber = reader.nextLine();
            Student student = new Student(inputName, inputStudentNumber);
            list.add(student);
        }
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("Give search term:");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}

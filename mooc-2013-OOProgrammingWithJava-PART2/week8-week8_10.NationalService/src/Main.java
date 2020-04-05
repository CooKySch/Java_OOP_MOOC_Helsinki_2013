public class Main {
    public static void main(String[] args) {
        // Test your code here!;
        MilitaryService accountant = new MilitaryService(800);
        System.out.println(accountant.getDaysLeft());
        accountant.work();
        System.out.println(accountant.getDaysLeft());
        accountant.work();
        accountant.work();
        System.out.println(accountant.getDaysLeft());
    }
}

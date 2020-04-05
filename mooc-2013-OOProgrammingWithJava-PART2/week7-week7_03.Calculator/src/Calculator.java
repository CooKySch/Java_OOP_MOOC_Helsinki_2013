public class Calculator {
    //import reader
    private Reader reader = new Reader();
    private int numberOfOperations = 0;

    public void start() {
        while (true) {
            //ask command and set this
            System.out.println("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                this.numberOfOperations++;
            } else if (command.equals("difference")) {
                difference();
                this.numberOfOperations++;
            } else if (command.equals("product")) {
                product();
                this.numberOfOperations++;
            }
        }

        statistics();
    }

    private void sum() {
        System.out.println("value 1: ");
        int number1 = reader.readInteger();
        System.out.println("value 2: ");
        int number2 = reader.readInteger();
        System.out.println("sum of the values" + (number1 + number2));
    }

    private void difference() {
        System.out.println("value 1: ");
        int number1 = reader.readInteger();
        System.out.println("value 2: ");
        int number2 = reader.readInteger();
        System.out.println("difference of the values" + (number1 - number2));
    }

    private void product() {
        System.out.println("value 1: ");
        int number1 = reader.readInteger();
        System.out.println("value 2: ");
        int number2 = reader.readInteger();
        System.out.println("product of the values" + (number1 * number2));
    }

    private void statistics() {
        System.out.println("Calculations done " + this.numberOfOperations);
    }
}

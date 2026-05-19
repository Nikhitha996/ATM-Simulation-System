import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000;
        int enteredPin;

        System.out.println("===== ATM SIMULATION SYSTEM =====");
        System.out.print("Enter PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            int choice;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        System.out.println("Deposit Successful");
                        System.out.println("Updated Balance: ₹" + balance);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();

                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal Successful");
                            System.out.println("Remaining Balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 4:
                        System.out.println("Thank You for Using ATM");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
    }
}
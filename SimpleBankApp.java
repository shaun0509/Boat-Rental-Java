import java.util.Scanner;

public class SimpleBankApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Welcome " + name + " to Simple Bank");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double deposit = input.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Deposit successful.");
                } else {
                    System.out.println("Invalid amount.");
                }

            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdraw = input.nextDouble();

                if (withdraw > 0 && withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }

            } else if (choice == 3) {
                System.out.println("Your balance is: R" + balance);

            } else if (choice == 4) {
                System.out.println("Thank you for using Simple Bank.");
                break;

            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }
}

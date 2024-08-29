
import java.util.Scanner;

public class Atm {
    private static int balance = 1000;  // Initial balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;  // User choice

        System.out.println("Hi, welcome to ATM");

        while (n != 4) {
            System.out.println("Enter your option: ");
            System.out.println("1. WITHDRAW MONEY");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT.. Thank You");

            // Read user choice
            n = sc.nextInt();

            switch (n) {
                case 1:
                    withdrawMoney(sc);
                    break;
                case 2:
                    depositMoney(sc);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("EXIT.. Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
                    break;
            }
        }

        sc.close();  // Close the scanner to free resources
    }

    private static void withdrawMoney(Scanner sc) {
        System.out.println("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= withdrawAmount;
            System.out.println("please collect your cash\n");
        }
    }

    private static void depositMoney(Scanner sc) {
        System.out.println("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        if (depositAmount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            balance += depositAmount;
            System.out.println("Deposit successful \n");
        }
    }

    private static void checkBalance() {
        System.out.println("CHECK BALANCE");
        System.out.println("Your balance is: $ " + balance);
    }
}
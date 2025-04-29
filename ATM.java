import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user_input;
        int amount = 0;

        System.out.println("Enter Your PIN: ");
        String PIN = sc.nextLine();
        System.out.println("************* HDFC Bank ***************");

        // Menu
        do {
            System.out.println("\nPress 1: Deposit Cash ");
            System.out.println("Press 2: Withdrawal Cash ");
            System.out.println("Press 3: Balance Enquiry");
            System.out.println("Press 4: Exit ");
            user_input = sc.nextInt();

            if (user_input == 1) {
                System.out.println("Enter Amount to Deposit");
                int depositcash = sc.nextInt();
                amount += depositcash;
                System.out.println("*****************************************");
                System.out.println("Amount Deposited Successfully...");
                System.out.println("*****************************************");
            } else if (user_input == 2) {
                System.out.println("Enter Amount to withdrawal");
                int withdrawcash = sc.nextInt();
                if (withdrawcash <= amount) {
                    amount -= withdrawcash;
                    System.out.println("******************************************");
                    System.out.println("Amount Withdrawal Successfully .....");
                    System.out.println("******************************************");
                } else {
                    System.out.println("******************************************");
                    System.out.println("Insufficient Balance ");
                    System.out.println("******************************************");
                }
            } else if (user_input == 3) {
                System.out.println("******************************************");
                System.out.println("Your Account Balance is : " + amount);
                System.out.println("******************************************");
            } else if (user_input == 4) {
                System.out.println("******************************************");
                System.out.println("Thank You visit again!!");
                System.out.println("******************************************");
            } else {
                System.out.println("Enter valid opton!!!");
            }

        } while (user_input != 4);

        //sc.close(); // Close the scanner
    }
}


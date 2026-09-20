import  java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // My ATM Pin
        int Pin1 = 1234;

        // Initial balance
        int balance = 10000;
        
        System.out.println("\n==================Welcome to our ATM System=================================");

        // Take user input for ATM pin
        System.out.print("\nEnter your 4 digit ATM pin: ");
        int Pin = scanner.nextInt();

        // Check the pin
        if(Pin == Pin1){

            // if pin is correct than access confirmed
            System.out.println("\nPin is correct! ");
            System.out.println("Access Confirmed...");

            // It run until user choice the exit
            while(true){

            /*Here we take the user input to check
            their balance, deposit amount, withdraw amount... */
            System.out.print("\n=====================================================");
            System.out.println("\nEnter your choice (1/2/3/4): ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit amount");
            System.out.println("3. withdraw amount");
            System.out.println("4. Exit");
            
            // store the user input in choice variable
            int choice = scanner.nextInt();

            // apply a switch case to check the condition
            switch(choice){
                case 1:
                    System.out.println("\nYour balance is: ₹" + balance);
                    break;
                case 2:
                    System.out.println("\nEnter a amount for deposit: " + "₹" );
                    int deposit = scanner.nextInt();
                    System.out.println("Your amount " + deposit + " has been deposited successfully!");
                    balance += deposit;
                    System.out.println("Your new balance is: ₹" + balance);
                    break;
                case 3:
                    System.out.println("\nEnter a amount for withdraw: " + "₹" );
                    int withdraw = scanner.nextInt();
                    if(withdraw > balance){
                        System.out.println("Insufficient balance!...");
                    }else{
                        System.out.println("Withdrawn successfully! ");
                        balance -= withdraw;
                        System.out.println("Your current balance is: ₹" + balance);
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for use our ATM machine...");
                    scanner.close();
                    return ;

                // if user choices is another number then it shows the message
                default:
                    System.out.println("Invalid choice! Please enter a valid choice (1/2/3/4): ");
                    break;
            }
            }
        } else {

            // If pin is incorrect then this message pop up
            System.out.println("Pin is incorrect! ");
            System.out.println("Enter a valid ATM pin number");
            scanner.close();
        }
    }
}
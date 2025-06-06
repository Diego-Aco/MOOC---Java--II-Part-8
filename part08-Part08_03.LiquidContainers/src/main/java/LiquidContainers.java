
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer=0;
        int secondContainer=0;

        System.out.println();

        while (true) {
            //print contents of both containers after each command
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second : " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }

            System.out.println();
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                firstContainer+=amount;
                if (firstContainer>100) {
                    firstContainer=100;
                }
            }

            if (command.equals("move")) {
                if (amount > firstContainer) {      //if requested amount is greater than what 1st container actually has
                    secondContainer+=firstContainer;
                    firstContainer=0;
                } else {
                    firstContainer-=amount;
                    secondContainer+=amount;
                }

                if (secondContainer >100) {     //set secondContainer to 100 if amount makes it go over 100
                    secondContainer=100;
                }
            }
            
            if (command.equals("remove")) {
                secondContainer-=amount;
                if (secondContainer<0) {
                    secondContainer=0;
                }
            }
            
        }

    }

}

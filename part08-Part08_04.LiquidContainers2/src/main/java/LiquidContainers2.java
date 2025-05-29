
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer=new Container();
        Container secondContainer=new Container();

        System.out.println();

        while (true) {
            //print contents of both containers after each command
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
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
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                int actualAmount=amount;    //assume actualAmount is user-provided amount
                if (amount>firstContainer.contains()) {     //unless requested amount > what's actually in firstContainer
                    actualAmount=firstContainer.contains();
                }
                firstContainer.remove(actualAmount);
                secondContainer.add(actualAmount);
            }
            
            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
            
        }

    }

}

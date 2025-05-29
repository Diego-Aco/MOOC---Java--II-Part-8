import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan){
        this.todoList=todoList;
        this.scan=scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scan.nextLine();
                todoList.add(task);
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scan.nextLine());
                todoList.remove(number);
            }
        
        }
    }

}
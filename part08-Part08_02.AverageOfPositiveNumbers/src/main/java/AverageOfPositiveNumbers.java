
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int sum=0;
        int count=0;
        double avg=0.0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input==0) {
                break;
            }
            if (input>0) {
                count++;
                sum+=input;
            }
        }
        if (count>0) {
            avg=1.0*sum/count;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}

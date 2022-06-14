import java.util.Scanner;

public class WeeksConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weeks;

        System.out.print("Please enter number of weeks: ");
        weeks =input.nextInt();
        System.out.println(7*weeks + " Days.");
        System.out.println(168*weeks + " Hours.");
        System.out.println(10080*weeks + " Minutes.");
        System.out.println(604800*weeks + " Seconds.");


    }
}

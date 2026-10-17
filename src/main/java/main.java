import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please select a sandwich option:");
        System.out.println("1:regularsandwich");
        System.out.println("2:largesandwich");
        System.out.println("Enter choice (1 or 2):");

        int size = scanner.nextInt();

        double price = 0.0;
        if (size == 1) {
            price =5.45;
        }
        else if (size == 2) {
            price = 8.95;
        }







        }
}

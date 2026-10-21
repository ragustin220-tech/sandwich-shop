import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner myScanner =new Scanner(System.in);
// show sandwich menu options and identify variables
        double regular = (5.45);
        double large = (8.95);
        double total = (0.0);

        System.out.println("Please select a sandwich option:");
        System.out.println("1: Regular ( $5.45 ) ");
        System.out.println("2: Large ( $8.95 ) ");
        System.out.println("Enter choice (1 or 2):");

        int S1 = myScanner.nextInt();

        if (S1 == 1) {
            total = regular;
        }else if (S1 == 2) {
            total = large;
        }else { System.out.println("Choose a sandwich an option either 1 or 2");
        }

        System.out.println("your total is : " + total);
 // prompt for the users age
        System.out.println("enter your age: ");
        int age = myScanner.nextInt();
// if age is 17 or younger then they receive a student discount.
        if (age <= 17) {
            System.out.println(" You qualify for a Student discount of %10 off!" + "Your new total is " + (total * .90));
        }else if (age >= 65){
            System.out.println(" You qualify for a Senior discount of %20 off!" +
                    " Your new total is " + (total * .80));

        }
          else {
              System.out.println("total is: " + total);
        }
}
}

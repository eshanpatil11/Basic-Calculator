import java.util.Scanner;
public class Calculator {
    public static void main(String [] argu){
        //Creating variables
        double add= 0, sub = 0, multi = 0, div = 0;
        double val1,val2,val3, val4;
        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("   Calculator");
        System.out.println(" !! Welcome !! ");

        System.out.println("Enter the first value: ");
        val1 = input.nextDouble();
        System.out.println("Enter number to perform the following: 1 to add, 2 to subtract, 3 to multiply and 4 to divide: ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter the second value: ");
            val2 = input.nextDouble();
            add = val1 +val2;
            System.out.println("The result of the addition is: "+add);
        } else if (choice == 2) {
            System.out.println("Enter the second value: ");
            val2 = input.nextDouble();
            sub = val1 - val2;
            System.out.println("The result of the subtraction is: "+sub);
        } else if (choice == 3){
            System.out.println("Enter the second value: ");
            val2 = input.nextDouble();
            multi = val1*val2;
            System.out.println("The result of the multiplication is: "+multi);
        } else if (choice == 4) {
            System.out.println("Enter the second value: ");
            val2 = input.nextDouble();
            div = val1 / val2;
            System.out.println("The result of the division is: "+div);
        }else {
            System.out.println("Error");
            }
        }
    }


import java.util.Scanner;
public class Calculator {
    public static void main(String [] argu){
        //Creating variables
        double add= 0, sub = 0, multi = 0;
        double val1,val2,val3, val4;
        String choice;

        Scanner input = new Scanner(System.in);
        System.out.println("   Calculator");
        System.out.println(" !! Welcome !! ");

        System.out.println("Enter the first value: ");
        val1 = input.nextDouble();
        System.out.println("Enter the operation to perform: ");
        choice = input.nextLine();
        System.out.println("Enter the second value: ");
        val2 = input.nextDouble();

        if (choice == "add") {
            add = val1 +val2;
        } else if (choice == "sub") {
            sub = val1 - val2;
        } else if (choice == "multiply"){
            multi = val1*val2;
        } else {
            System.out.println("Error");
        }

        }



    }


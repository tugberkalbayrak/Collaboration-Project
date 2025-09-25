import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scn = new Scanner(System.in);
        int arraySize;
        int option = 0;
        String oddOrEven;


        System.out.print("Enter the size of the array: ");
        arraySize = scn.nextInt();

        int[] arr1 = GenerateArray.generateArray(arraySize);

        while(option != 5){
            System.out.println(Arrays.toString(arr1));
            System.out.printf("\nWith this random generated array with the size of %d, you want to: ", arraySize);
            System.out.println(
            "\n1) Calculate (element - average) " + 
            "\n2) Find the maximum value in the array "+
            "\n3) Find the minimum value in the array " +
            "\n4) Calculate the sum of odd or even elements in the array" + 
            "\n5) Or you may exit");
            option = scn.nextInt();

            if(option == 1) {
                Average.findAverage(arr1);
            }
            else if(option == 2) {
                System.out.println("\nThe maximum value in the array is: "+ Operations.max(arr1));
            }
            else if(option == 3) {
                System.out.println("\nThe minimum value in the array is: "+ Operations.min(arr1));
            }
            else if(option == 4) {
                System.out.print("\nWhether (odd) or (even) elements' sum you want to calculate? ");
                oddOrEven = scn.next();
                int sum = SumOfElements.sumOfElements(arr1, oddOrEven);
                System.out.printf("\nSum of %s elements in the array is %d\n", oddOrEven, sum);
            }
        }





    }
}

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray= readIntegers(count);



    }

    public static int[] readIntegers(int count){
        int [] array = new int[count];

        for (int i=0; i<array.length; i++){
            System.out.println("insert number");
            int number = scanner.nextInt();
            scanner.nextInt();
            array[i]=number;
        }
        return array;
    }

    public static void findMin(int[] array){
        int i;
        int firstInt=0;
        int minInt=0;
        int nextInt=0;
        for (i=0; i< array.length){
            if(firstInt<nextInt){
                firstInt = minInt;

            }
            if (minInt<nextInt){

            }

            i++;
        }
    }

}

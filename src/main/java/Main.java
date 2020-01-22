import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min =" + returnedMin);


    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("insert number");
            int number = scanner.nextInt();
            scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {

        int minInt = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < minInt) {
                minInt = value;

            }

        }
        return minInt;

    }

}



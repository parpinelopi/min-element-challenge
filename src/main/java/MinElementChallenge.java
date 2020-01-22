import java.util.Scanner;

public class MinElementChallenge {



    public static int[] readIntegers(int count){
        int [] array = new int[count];
        System.out.println("insert the" + count + "in the array");
        while (scanner.hasNextInt()){
           array  = scanner.nextInt();
        }
        count++;


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

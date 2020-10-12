import java.util.ArrayList;
import java.util.Arrays;

public class Arryametod {

   static int[] myArr = new int[]{1, 8, 3, 1, 5, 6, 7};

    public static int[] afterLasFour(int[] arr) {


            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 4) {
                   return Arrays.copyOfRange(arr, i + 1, arr.length);
                }
                }
            throw new RuntimeException("Отсутствует 4 в входном массиве");
            }







    static int[] myArrInt = new int[]{4, 4, 4, 4, 4, 4};

    public static boolean arrayСomposition(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == 4 && arr[j] == 1) {
                        return true;
                    }
                }
            }
        return false;
        }


    public static void main(String[] args) {
    //    System.out.println(arrayСomposition(myArrInt));
        System.out.println(Arrays.toString(afterLasFour(myArr)));
    }




}

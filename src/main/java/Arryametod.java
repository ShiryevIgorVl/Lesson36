import java.util.ArrayList;
import java.util.Arrays;

public class Arryametod {

   static Integer[] myArr = new Integer[]{1, 8, 3, 1, 5, 6, 7};

    public static Integer[] afterLasFour(Integer[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                k++;
            }
        }
         if (k == 0) {
           try {
               throw new RuntimeException("Array test");
           } catch (RuntimeException e) {
              System.out.println("Отсутствует 4 в входном массиве");
           }
       }

            ArrayList intermediate = new ArrayList();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 4) {
                    intermediate.add(0, arr[i]);
                } else {
                    break;
                }
            }
            Integer[] afterLasFour = new Integer[intermediate.size()];
            intermediate.toArray(afterLasFour);
            return afterLasFour;

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

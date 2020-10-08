import java.util.ArrayList;
import java.util.Arrays;

public class Arryametod {

    static int[] myArr = new int[]{1, 4, 3, 4, 5, 6, 7};

    public static Integer[] afterLasFour(int[] arr){

        ArrayList intermediate = new ArrayList();
        for (int i = arr.length - 1; i >= 0 ; i--) {
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


    public static void main(String[] args)
     {
        System.out.println(Arrays.toString(afterLasFour(myArr)));
    }

}

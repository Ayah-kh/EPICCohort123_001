package Assignment03;

import java.util.Arrays;

public class MathClass {
    public static int max(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max)
                max=array[i];
        }
        return max;
    }
    public static int min(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min)
                min=array[i];
        }
        return min;
    }
    public static double avgArray(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double avg=(double) sum/(double) array.length;
        return avg;
    }

    public static int[] sortArray(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j=i;j>0;j--){
                if (array[j]<array[j-1]) {
                    int a = array[j];
                    array[j]=array[j-1];
                    array[j-1]=a;
                }
                else break;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array= {5,9,2,12,3,20,6,14,17};
        int max = max(array);
        System.out.println("max = " + max);

        int min = min(array);
        System.out.println("min = " + min);

        double avg = avgArray(array);
        System.out.println("avg = " + avg);

        int[] sortedArray = sortArray(array);
        System.out.println("sortedArray " + Arrays.toString(sortedArray));

    }

}

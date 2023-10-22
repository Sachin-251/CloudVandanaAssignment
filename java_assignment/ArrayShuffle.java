package java_assignment;

import java.util.Arrays;

public class ArrayShuffle {

    public static void shuffleArray(int[] arr){
        for(int i=0;i<arr.length; i++){
            int randomIndex = 0 + (int)(Math.random() * ((arr.length-1)+1));
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        shuffleArray(arr);
    }
}

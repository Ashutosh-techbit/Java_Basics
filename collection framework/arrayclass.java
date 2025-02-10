import java.util.*;
public class arrayclass {
    public static void main(String[] args) {
        
        // int[] num = {1,2,3,4,5,6};
        // int index = Arrays.binarySearch(num, 4);
        
        int[] num = {11,32,345,12,43,2,35};
         Arrays.sort(num);

        for(int i : num){
            System.out.println(i+ " ");
        }
    }
}

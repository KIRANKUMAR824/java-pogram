package day5;

import java.util.Arrays;

public class presumrecursion {
     public static void SumPre(int[] og, int[] dest, int index){
        if(index==0)
        {dest[index] = og[index];return;}
        SumPre(og, dest, index-1);
        dest[index] = dest[index-1] + og[index];

        
    
    }
    public static void main(String[] args) {
        int[] number = {12,5,21,6,43};
        int[] postfix = new int[number.length];
        SumPre(number, postfix, index:0);
        System.out.println(Arrays.toString(postfix));

        
    }


    

    
    

    
}

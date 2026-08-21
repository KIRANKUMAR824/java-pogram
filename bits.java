package day3;

import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data1 = 0, data2 = 0;
        System.out.println("Enter the data1 and data2");
        data1 = scan.nextInt();
        data2 = scan.nextInt();
       int diff = data1-data2;
       int buffer = (diff>>31)&1;
     System.out.println("MAX"+(data1-diff*buffer));
     System.out.println("MIN"+(data2+diff*buffer));
     scan.close();
       
    }
}
    


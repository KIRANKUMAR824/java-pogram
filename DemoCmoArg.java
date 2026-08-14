//package day3;
//java DemoCmoArg input1 input2 input3 input4
public class DemoCmoArg {
       public static void main(String[] kinnu){
       if(kinnu.length==0) return;
       float amount = Float.parseFloat(kinnu[0]);
    if(amount>1000&&amount<=5000)
      System.out.println(amount+"transferred with 5rs");
    else if(amount>5000&&amount<=10000)
      System.out.println(amount+"transferred with 10rs");
    else if(amount>10000&&amount<50000)
      System.out.println(amount+"transferred with 30rs");
    else if(amount>=50000)
      System.out.println(amount+"transferred with 100rs");
    else
        System.out.println(amount+"transferred no charges");


        
    }
    
}

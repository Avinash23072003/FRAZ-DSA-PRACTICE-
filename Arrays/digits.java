package Arrays;
import java.util.Scanner;
public class digits {
public static void main(String[] args){
    //program for counting number of digits;
     int digit=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
   
    for(int i=num;num>0;num/=10){
         System.out.println("Number is"+digit+"now");
        digit++;
       
      
    }
    System.out.println(digit);
}
}
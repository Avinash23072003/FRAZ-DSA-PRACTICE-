package Arrays;
import java.util.Scanner;
public class digitsK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int k=sc.nextInt();
        
        for(int i=1;i<=N;i++){
         int sum=0;
            for(int j=i;j>0;j/=10){
             int lastdigit=j%10;
             sum=sum+lastdigit;
             }    
             if(sum==k){
                System.out.println(i + " : "+k);
             }
            }
            }


        }
    

import java.util.Scanner;

public class sumofdigits {
  public static void main(String[] args) {
    int counter = 0;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = N; N > 0; N /= 10) {
      counter++;
      int Eachdigit = N % 10;
      sum = sum + Eachdigit;
    }
    System.out.println(counter);
    System.out.println(sum);

  }
}
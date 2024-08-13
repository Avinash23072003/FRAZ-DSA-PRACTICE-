import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean isprime = true;
    for (int i = 1; i < N; i++) {
      for (int num = 2; num <= N; num++) {
        if (num % i == 0) {
          isprime = false;
        }

      }

    }
    System.out.println(isprime);

  }
}

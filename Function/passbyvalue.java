package Function;

public class passbyvalue {

    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println(x); // 10
    }

    public static void change(int x) {
        x = 20;
    }
}

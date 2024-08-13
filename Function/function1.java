package Function;
public class function1 {
    /*
     * static int add(int a, int b) {
     * int ans = a + b;
     * return ans;
     * }
     * /*
     */
    /*
     * static void nameFunction(String name) {
     * System.out.println("Hii " + name);
     * }
     */
    static int passByVal(int n) {
        n++;
        return n;

    }

    public static void main(String[] args) {
        // nameFunction("Abhi");
        // nameFunction("Rahulbhai");
        // System.out.println(add(3, 4));
        // System.out.println(add(9, 4));
        int x = 6;
        System.out.println(passByVal(x));

    }
}

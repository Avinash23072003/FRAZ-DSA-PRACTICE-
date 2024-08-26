public class FrogNo {
    public static int Frog(int arr[], int N, int idx) {

        if (idx == N - 1)
            return 0;

        int op1 = Math.abs(arr[idx] - arr[idx + 1]) + Frog(arr, N, idx + 1);
        if (idx == arr.length - 2) {
            return op1;
        }
        int op2 = Math.abs(arr[idx] - arr[idx + 2]) + Frog(arr, N, idx + 2);
        return Math.min(op1, op2);

    }

    public static void main(String[] args) {
        int arr[] = { 20, 10, 30, 40 };
        int N = arr.length;
        System.out.println(Frog(arr, N, 0));
    }
}

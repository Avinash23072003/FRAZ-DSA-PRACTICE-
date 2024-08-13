import java.util.ArrayList;

class max_subarray {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here
        long finalans = 0, curnum = 0;
        // sum of first subArray
        for (int i = 0; i < K; i++) {
            curnum = curnum + Arr.get(i);
        }
        finalans = curnum;
        // sum of next subArray
        for (int st = 1, en = K; en < N; st++, en++) {
            curnum = curnum - Arr.get(st - 1);
            curnum = curnum + Arr.get(en);
            finalans = Math.max(finalans, curnum);
        }

        return finalans;

    }

    public static void main(String[] args) {

        int arr[] = { 23, 43, 12, 32, 12, 11, 12, 32 };
        int K = 3;
        int N = 8;
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int value : arr) {
            Arr.add(value);
        }
        System.out.println(maximumSumSubarray(K, Arr, N));

    }
}
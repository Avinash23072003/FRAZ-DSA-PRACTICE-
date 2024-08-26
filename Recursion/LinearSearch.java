import java.util.ArrayList;

public class LinearSearch {
    // public static boolean LSearch(int arr[], int n, int target, int idx) {
    // if (idx >= n)
    // return false;

    // if (arr[idx] == target)
    // return true;vvv

    // return LSearch(arr, n, target, idx + 1);

    // }

    public static ArrayList<Integer> linearsearch(int arr[], int n, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ans.add(i);
            }

        }
        return ans;
    }

    public static void main(String[] ars) {

        int arr[] = { 23, 1, 1, 2, 1, 34, 23, 12, 4 };
        int n = arr.length;
        int target = 1;
        ArrayList<Integer> ans = linearsearch(arr, n, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        // if (LSearch(arr, n, target, 0)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }
    }
}

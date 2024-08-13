import java.util.ArrayList;

public class runningarray {
    public static ArrayList<Integer> running(ArrayList<Integer> arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int currentSum = i > 0 ? ans.get(i - 1) + arr.get(i) : arr.get(i);
            ans.add(currentSum);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr[] = { 2, 3, 1, 0, -3, 4, 2 };
        //
        System.out.println(running(arr));
    }
}

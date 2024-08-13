package Arrays;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println(arr1 + "->" + arr1.size());
        arr1.add(90);
        arr1.add(23);
        arr1.add(90);
        arr1.add(29);
        System.out.println(arr1 + "->" + arr1.size());
        arr1.remove(2);
        System.out.println(arr1 + "->" + arr1.size());
        arr1.set(2, 24);
        System.out.println(arr1 + "->" + arr1.size());
    }
}

import java.util.HashSet;

public class DuplicateElement {

    public static boolean containDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 1 };
        System.out.println(containDuplicate(number));
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8};
        int target = 11;

        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                return;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
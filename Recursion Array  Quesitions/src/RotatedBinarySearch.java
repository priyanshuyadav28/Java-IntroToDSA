public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 10, 13, 1, 2, 3, 4};
        int target = 16;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, start, mid - 1);

    }
}

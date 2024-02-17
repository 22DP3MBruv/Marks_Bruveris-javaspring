package rvt;
public class Sorter {
    int smallest;
    int index;
    public int smallestElement(int[] arr) {
        smallest = arr[0];
        for (int i : arr) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public int smallestElementIndex(int[] arr) {
        smallest = arr[0];
        for (int i : arr) {
            if (arr[i] <= smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }
    public int smallestIndexFrom(int[] arr, int point) {
        smallest = arr[point - 1];
        for (int i = point - 1; i < arr.length - 1; i++) {
            if (arr[i] <= smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] arr, int point1, int point2) {
        int mem = arr[point1];
        arr[point1] = arr[point2];
        arr[point2] = mem;
    }
    public static void sort(int[] arr) {
        int mem;
        int count;
        do {
            count = 0;
            for (int i = arr.length - 1;i > 0;i--) {
                if (arr[i] < arr[i-1]) {
                    mem = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = mem;
                    count++;
                }
            }
        } while (count != 0);
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (end + start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}

package itransform;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 12, 14, 6, 78, 47, 9, 23, 54, 70, 34, 2};

        System.out.println("Original array:");
        printArray(nums);

        bubbleSort(nums);

        System.out.println("\nSorted array:");
        printArray(nums);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


import java.util.*;

public class BubbleSortExampleClientApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No Of Elements you want to add into the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + "Element");
            arr[i] = scanner.nextInt();
        }
        int isSwaped = 0;
        int n = arr.length;
        int[] res = sortingGivenArray(n, arr, isSwaped);
        System.out.println("After sorting the elements are --");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    private static int[] sortingGivenArray(int n, int[] arr, int isSwaped) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swapping the Elements");
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwaped = 1;
                }
            }
            if (isSwaped != 1) {
                System.out.println("No Elements are swapped in " + (i + 1) + "pass");
                System.out.println("Hence considering the given array is sorted Array");
                break;
            }
        }
        return arr;
    }
}

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        perm(arr, 0, arr.length);
    }

    private static void perm(int[] arr, int k, int m) {
        if (k == m) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = k; i < m; i++) {
                //System.out.println("Performing Swap : " + k + ", " + m);
                swap(arr, i, k);

                perm(arr, k+1, m);

                //System.out.println("Performing Swap : " + k + ", " + m);
                swap(arr, k, i);
            }
        }
    }

    private static void swap(int[] arr, int k, int m) {

        int temp = arr[k];
        arr[k] = arr[m];
        arr[m] = temp;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}

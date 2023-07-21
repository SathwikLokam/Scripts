public class Permutations {
    public static void permutations(int start, int len, int[] arr) {
        if (start == len) {
            for (int a : arr)
                System.out.print(a);
            System.out.println();
        }

        for (int i = start; i < len; i++) {
            arr[i] = arr[i] ^ arr[start];
            arr[i] = arr[i] ^ arr[start];
            arr[i] = arr[i] ^ arr[start];
            permutations(start + 1, len, arr);
            arr[i] = arr[i] ^ arr[start];
            arr[i] = arr[i] ^ arr[start];
            arr[i] = arr[i] ^ arr[start];

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        permutations(0, arr.length, arr);
    }
}

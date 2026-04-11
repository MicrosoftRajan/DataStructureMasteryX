package ARRAYS;

class Sort0s1s2s {

    public static void SortColors(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // SWAP low -> mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // SWAP mid -> high high--
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        SortColors(arr);

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
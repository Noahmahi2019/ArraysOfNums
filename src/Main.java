public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int nums = arr.length;
        MoveZeroesElement(arr, nums);
    }

    public static void  MoveZeroesElement(int arr[], int nums) {
        int current = 0;

        for (int i = 0; i < nums; i++)
            if (arr[i] != 0)
                arr[current++] = arr[i];

        while (current < nums)
            arr[current++] = 0;
        for (int i = 0; i < nums; i++)
            System.out.print(arr[i] + " ");
    }
}


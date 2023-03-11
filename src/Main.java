public class Main{
    public static void main(String[] args) {

        int[] arr = new int[]{10, 40, 30, 20};
        int Store = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]  > arr[j]) {
                    Store = arr[i];
                    arr[i] = arr[j];
                    arr[j] = Store;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

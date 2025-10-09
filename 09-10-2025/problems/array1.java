public class array1 {
    public static void main(String[] args) {
        int[] arr = new int[791];
        for (int i = 0; i < 791; i++) {
            arr[i] = i + 10;
        }
        for (int i = 0; i < 791; i++) {
            System.out.println("The array elements are: " + arr[i]);;
        }
    }
}

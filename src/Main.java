public class Main {
    public static int Two7sNextToEachOther(int[] arr) {
        int out = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 7 && arr[i] == 7) {
                out += 1;
            }
        }

        return out;
    }
    public static void main(String[] args) {
        System.out.println(Two7sNextToEachOther(new int[] {8, 2, 5, 7, 9, 0, 7, 7, 3, 1}));
        System.out.println(Two7sNextToEachOther(new int[] {9, 4, 5, 3, 7, 7, 7, 3, 2, 5, 7, 7}));
    }
}
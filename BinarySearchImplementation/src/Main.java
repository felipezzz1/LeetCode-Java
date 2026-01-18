//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Implementation implementation = new Implementation();

        int[] a = new int[]{1, 2, 3, 4, 5};

        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] c = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        };

        int[] d = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40
        };

        System.out.println(implementation.binarySearch(a, 3));
        System.out.println(implementation.binarySearch(b, 3));
        System.out.println(implementation.binarySearch(c, 3));
        System.out.println(implementation.binarySearch(d, 3));

    }
}
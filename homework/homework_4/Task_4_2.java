package homework.homework_4;
import java.util.Arrays;

public class Task_4_2 {
    public static void main(String[] args) {
        int[] ints = new int[args.length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(args[i]);
        }

        System.out.print("Base: ");
        System.out.println(Arrays.toString(ints));

        System.out.print("Asc: ");
        System.out.println(Arrays.toString(ascSortedArray(ints)));

        System.out.print("Desc: ");
        System.out.println(Arrays.toString(descSortedArray(ints)));

        System.out.print("Inner: ");
        System.out.println(Arrays.toString(innerSortedArray(ints)));

    }

    public static int[] ascSortedArray(int[] ints) {
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int t = ints[i];
                    ints[i] = ints[j];
                    ints[j] = t;
                }
            }
        }
        return ints;
    }
    public static int[] descSortedArray(int[] ints) {
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int t = ints[i];
                    ints[i] = ints[j];
                    ints[j] = t;
                }
            }
        }
        return ints;
    }
    public static int[] innerSortedArray(int[] ints) {
        int[] ints1 = descSortedArray(ints);
        int[] ints2 = new int[ints1.length];

        for (int i = 0; i < ints1.length; i=i+2) {
            ints2[i/2] = ints1[i];
        }
        for (int i = 1; i < ints1.length; i=i+2) {
            ints2[(ints2.length - 1) - (i / 2)] = ints1[i];
        }
        return ints2;
    }

}

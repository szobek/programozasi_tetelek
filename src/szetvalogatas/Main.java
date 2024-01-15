package szetvalogatas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tomb = {2, 6, 8, 3, 5, 4, 9}, tomb2 = new int[tomb.length], tomb3 = new int[tomb.length];
        int j = 0, k = 0;

        for (int elem : tomb)
            if (elem % 2 == 0)
                tomb2[j++] = elem;
            else
                tomb3[k++] = elem;

        System.out.println(Arrays.toString(tomb));
        System.out.println(Arrays.toString(tomb2));
        System.out.println(Arrays.toString(tomb3));

    }

}

package kivalogatas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tomb = {2,6,8,3,5,4,9},tomb2 = new int[tomb.length];
        int j=0;
        for (int k : tomb)
            if (k > 6)
                tomb2[j++] = k;
        System.out.println(Arrays.toString(tomb2));
    }
}

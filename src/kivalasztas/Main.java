package kivalasztas;

public class Main {
    public static void main(String[] args) {
        int[] tomb = {2,6,8,3,5,4,9};
        int keresett = 7;
        int i = 0;
        while (i< tomb.length&&tomb[i]!=keresett) i++;
        System.out.println( (i< tomb.length)?"Van találat("+(i+1)+")":"Nincs találat");
    }
}

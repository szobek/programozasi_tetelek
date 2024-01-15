package kereses;

public class Main {
    public static void main(String[] args) {
        int[] tomb = {2,6,8,3,5,4,9};
        int keresendo = 33;
        int i = 0;
        while (i< tomb.length&&tomb[i]!=keresendo) i++;
        System.out.println( (i< tomb.length)?"Van találat":"Nincs találat");
    }
}

package megszamlalas;

public class Main {
    public static void main(String[] args) {
     int[] tomb = {2,6,8,3,5,4,9};
     int szamlalo = 0;
     for(int elem:tomb){
         if(elem>2)
             szamlalo++;
     }
        System.out.println(szamlalo + " elem felel meg");
    }
}
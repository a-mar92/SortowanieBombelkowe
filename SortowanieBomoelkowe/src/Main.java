import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tablica = {24, 4, 1, 7, 8};
        int min;
        int n = tablica.length;
        for (int i = 0; i < tablica.length; i++) {
            min = tablica[i];
            for (int j = 0; j < tablica.length; j++) {
                if (min < tablica[j]) {
                    min = tablica[j];
                    tablica[j] = tablica[i];
                    tablica[i] = min;
                }
            }
            System.out.println(Arrays.toString(tablica));
        }
    }
}



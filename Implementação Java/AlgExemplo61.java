public class AlgExemplo61 {

    public static void main(String[] args) {

        int i, aux = 10;

        int[] x = { 10, 20, 13, 4, 5, 40, 55, 2, 35, 8 };
        int[] y = { 4, 14, 23, 1, 55, 43, 14, 18, 16, 3 };
        int[] z = new int[20];

        for (i = 0; i < 10; i++) {

            z[i] = x[i];
            z[aux] = y[i];
            aux++;
        }
        for (i = 0; i < 10; i++) {
            System.out.print(z[i] + " ");
        }
        for (i = 10; i < 20; i++) {
            System.out.print(z[i] + " ");
        }

    }
}

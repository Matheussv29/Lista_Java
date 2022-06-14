public class AlgExemplo58 {
    public static void main(String[] args) {
        int i;
        int[] vetNum1 = { 10, 32, 54, 6, 8, 89, 64, 64, 6, 10 };
        int[] vetNum2 = { 5, 27, 15, 20, 88, 6, 4, 30, 18, 20 };
        int[] vetSoma = new int[10];

        for (i = 0; i <= 9; i++) {
            vetSoma[i] = vetNum1[i] + vetNum2[i];
        }
        for (i = 0; i < vetSoma.length; i++) {
            System.out.print(vetSoma[i] + " ");
        }
    }
}

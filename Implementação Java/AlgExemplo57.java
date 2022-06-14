public class AlgExemplo57 {
    public static void main(String[] args) {
        int i;
        int[] vetNum = new int[10];

        System.out.println(" ");
        System.out.println("Imprimindo array");

        for (i = 0; i <= 9; ++i) {
            vetNum[i] = i + 1;
        }
        for (i = 0; i <= 9; ++i) {
            System.out.print(vetNum[i] + " ");
        }
    }
}
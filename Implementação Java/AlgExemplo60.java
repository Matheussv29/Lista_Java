public class AlgExemplo60 {
    public static void main(String[] args) {

        String[] vetNome1 = { "Luiz", "Matheus", "Rafaela", "Cleuber", "Wilson", "Rafael", "Luana", "Dexter" };
        String[] vetNome2 = new String[8];

        int j = 0;

        for (int i = vetNome1.length - 1; i >= 0; i--) {
            vetNome2[j] = vetNome1[i];
            j++;
        }

        for (int i = 0; i < vetNome2.length; i++) {
            System.out.println(vetNome2[i]);
        }

    }
}

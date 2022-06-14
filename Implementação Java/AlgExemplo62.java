public class AlgExemplo62 {
    public static void main(String[] args) {

        float i;

        float[] vetPreco = new float{12.0,15.0,16.0,18.0,18.0,13.0,21.0,26.0};

        float[] vetPreco10 = new float{12.0,15.0,16.0,18.0,18.0,13.0,21.0,26.0};
        ;

        for (i = 0; i < 5; i++) {

            vetPreco10[i] = vetPreco[i] * 10 / 100;

            System.out.printf(vetPreco10[i] + " ");
        }
    }
}

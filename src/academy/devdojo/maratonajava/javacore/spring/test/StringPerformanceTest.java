package academy.devdojo.maratonajava.javacore.spring.test;



public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para stringBuilder " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para stringBuffer " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;

        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

}
public class exemploEstRepeticao {
    public static void main(String[] args) {

        int j = 0, x = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Teste do For");
        }

        while (j < 3) {
            System.out.println("Teste do While");
            j++;
        }

        do {
            System.out.println("Teste do Do while");
            x++;
        } while (x < 3);

    }

}

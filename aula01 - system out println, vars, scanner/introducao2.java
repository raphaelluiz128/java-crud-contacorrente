import java.util.Scanner;

public class introducao2 {
        public static void main(String[] args) {
            
            String nomeCliente = "Usuário";
            Scanner leitor = new Scanner (System.in);

            System.out.println("Digite seu nome: ");
            nomeCliente= leitor.nextLine();
            System.out.println("O seu nome é : " + nomeCliente);
        }
    
}

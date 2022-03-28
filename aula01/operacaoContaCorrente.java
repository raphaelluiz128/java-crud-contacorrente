import java.util.Scanner;

class operacaoContaCorrente
{  
    // System.lineSeparator() é para saltar linha, o mesmo que /n
    static int contaCorrente = 8965;
    static int agencia = 70;
    static double saldo = 100.80;
    static String nomeCliente = "Usuário";

    /*
    %d 	representa números inteiros
    %f 	representa números floats
    %2f 	representa números doubles
    %b 	representa valores booleanos
    %c 	representa valores char
    */

   public static void main(String args[]) {  
        Scanner menu = new Scanner (System.in);

        int opcao = 10;
  
    	do {
		System.out.println("\n\n### Menu conta corrente ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - sacar         |");
		System.out.println("                  |     2 - depositar      |");
		System.out.println("                  |     3 - imp-ver saldo|");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");


        System.out.print("\n");
        opcao = menu.nextShort();

		switch (opcao) {
		case 1:
            sacar();
			break;
		case 2:
			depositar();
			break;
		case 3:
			imprimir();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);
    menu.close();
}

   public static int sacar () {
    Scanner leitor = new Scanner (System.in);
    System.out.println("sacar"); 
    System.out.println("Quando deseja sacar ?");
    String value = leitor.nextLine();
    System.out.println("Você tinha %s" + saldo);
    saldo = saldo - Float.parseFloat(value);
    System.out.println("Agora você tem " +saldo); 
    return (int) saldo;
   }

   public static double depositar () {
    Scanner leitor = new Scanner (System.in);
    System.out.println("depositar");  
    System.out.println("Quando deseja depositar ?");
    String value = leitor.nextLine();
    System.out.println("Você tinha " + saldo);
    saldo = saldo + Float.parseFloat(value);
    System.out.println("Agora você tem " +saldo); 
    return (int) saldo;
   }

   public static double imprimir () {
    System.out.println(nomeCliente + System.lineSeparator());
    System.out.println(saldo + System.lineSeparator());
    System.out.println("saldo");
    System.out.println("%s saldo");

    System.out.println(contaCorrente + System.lineSeparator());
    System.out.println(agencia + System.lineSeparator());
    return saldo;  
   }
}

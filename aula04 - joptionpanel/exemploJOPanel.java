import java.util.Scanner;

import javax.swing.JOptionPane;

public class exemploJOPanel {
    public static void main(String args[]) {  
        // Scanner opcao = new Scanner (System.in);
        // float = (float) 1.3  ou 1F
        // double = 0.0
        Double media = 0.0;
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome ? ", "Dados", JOptionPane.QUESTION_MESSAGE);
        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme preferido ? ", "Dados", JOptionPane.QUESTION_MESSAGE);
        String notaP1 = JOptionPane.showInputDialog(null, "Qual a sua nota 1 ? ", "Dados", JOptionPane.QUESTION_MESSAGE);
        String notaP2 = JOptionPane.showInputDialog(null, "Qual a sua nota 2 ? ", "Dados", JOptionPane.QUESTION_MESSAGE);
        media = (Double.parseDouble(notaP1) + Double.parseDouble(notaP2)) / 2;
        JOptionPane.showMessageDialog(null, "Nome: " + nome+ "\n" + " Filme: " + filme + "\n"
        + "A média das notas é " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

import javax.swing.JOptionPane;

public class exemploJOPanelForIf {
    public static void main(String args[]) {  
        // float = (float) 1.3  ou 1F
        // double = 0.0
        // if é condicional, usa condições
        // && significa 'e' || significa 'ou'
        // JOptionPane.QUESTION_MESSAGE é o tipo de mensagem que vai aparecer, tal tipo é sempre preenchido no quarto parametro do componente de mensagem
        Double media = 0.0;
        String resultado = "";
        String[] notas = new String[2];

        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome ? ", "Dados", JOptionPane.QUESTION_MESSAGE);
        
        for (int i = 0; i < 2; i ++){
            notas[i] = JOptionPane.showInputDialog(null, "Qual a sua nota " + i +" ? ", "Dados", JOptionPane.QUESTION_MESSAGE);
        }
        

        media = (Double.parseDouble(notas[0]) + Double.parseDouble(notas[1])) / 2;
        
        if(media >= 6) {
            resultado = "Aprovado";
        } else if (media <= 5.99999 && media >= 4) {
            resultado = "Recuperação";
        } else { 
            resultado = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome+ "\n"
        + "A média das notas é " + media + "\n" + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

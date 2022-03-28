
public class introducao3 {
        public static void main(String[] args) {
            int n1 = 10;
            int n2 = 30;
            double n3 = 7.5;
            String nomeCliente = "Raphael ";
            
            // acima temos um tipo de variável string que é em caracteres, é muito útil porque aceita qualquer informação
            // temos o tipo de dado double que é utilizado geralmente quando existe número com cassas decimais
            // temos também o int que é onde o número não tem casa decimal, é o inteiro

            // para realizar operações entre tipos diferentes de números no java, temos que definir um tipo e converter os outros
            // vamos converter o double, quando ele é convertido ele perde a parte após o '.'
            int n3Alterado = (int) n3;
            // na linha acima o (int) faz o n3 virar 7, por isso o resultado1 será 47, pois 10+30+7.

            double n1Alterado = (double) n1;
            double n2Alterado = (double) n2;

            int resultado1 = n1+n2+n3Alterado;
            double resultado2 = n1Alterado+n2Alterado+n3;
            // nas linhas acima o (double) faz o n1 e o n2 terem casas decimais, por exemplo 10.0, 
            // dessa forma não se perde valor e o resultado2 é 47.5.


            System.out.println("O seu nome é : " + nomeCliente + "\n Resultado1 :"
            + resultado1+ "\n REsultado2: " + resultado2);
        }
                // na linha acima o (int) faz o n3 virar 7, por isso o resultado1 será 47, pois 10+30+7.
            // na linha acima o (int) faz o n3 virar 7, por isso o resultado1 será 47, pois 10+30+7.

}

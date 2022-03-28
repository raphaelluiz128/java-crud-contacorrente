public class exemploEstRepeticaoArray {
    public static void main(String[] args) {

        int j = 0, x = 0, y = 0;
        String[] notas = new String[2];
        // um array possui tamanho, isso defino a quantidade de dados que ele pode armazenar
        // no array acima o tamanho é 2, então ele possui 2 posições para armazenar dados, onde cada posição cabe 1 dado
        // todo array tem a posição 0, então se o tamanho dele é dois, ele tem posição 0 e 1, se o tamanho é 5 ele tem posições de 0 a 4.
        notas[0] = "10";
        notas[1] = "6";
        // nas linhas 9 e 10 preenchemos as posições 0 e 1 do array
        
        // conseguimos saber a quantidade total de dados dentro de notas usando '.length'
        for (int i = 0; i < notas.length; i++) {
            // como declaramos que notas tem tamanho 2 na linha 5, então '.length' é igual a 2
            System.out.println("Teste do For");
        }

        // podemos mostrar todo o conteúdo do array usando estruturas de repetição
        // basta colocarmos o array dentro da estrutura e substituir a posição pela variavel utilizada na repetição
        // por exemplo notas[j] e notas[x]
        System.out.println("while");

        while (j < 2) {
            System.out.println(notas[j]);
            j++;
            // o j será substituído pelo seu valor, ou seja por 0 e depois por 1
            // quando ele aumentar para 2 através do ++ a repetição irá parar, 
            // afinal a repetição só funciona quando o j for menor que 2

        }

        System.out.println("Do while");

        do {
            System.out.println(notas[x]);
            x++;
            // o x será substituído pelo seu valor, ou seja por 0 e depois por 1
            // quando ele aumentar para 2 através do ++ a repetição irá parar
            // afinal a repetição só funciona quando o x for menor que 2
        } while (x < 2);

        //podemos também utilizar o notas.length no lugar do número 2
        // abaixo usamos o notas.length dentro do do while

        System.out.println("Do while com notas.length");

        do {
            System.out.println(notas[y]);
            y++;
            // o y será substituído pelo seu valor, ou seja por 0 e depois por 1
            // quando ele aumentar para 2 através do ++ a repetição irá parar
            // afinal a repetição só funciona quando o y for menor que notas.length que é 2
        } while (y < notas.length);


    }

}

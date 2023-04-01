/*
 * Desafio
No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda,
escolheu todas as pessoas que estavam na posição impar da fila para 
entrarem no camarote. Ele fez isso em diversos shows e as pessoas 
foram a loucura para competirem por essas posições. Você resolveu 
criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.
Exemplo
Entrada	Saída
   100	"50 pessoas no camarote" 
    40	"20 pessoas no camarote"
    25	"13 pessoas no camarote"
 */

 import java.util.Scanner; 
    
public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        for(int i = 0; i <= tamanhoDaFila; i++ ){
            if(i % 2 != 0){
                pessoasNoCamarote++;//somar uma pessoa no camarote, pois a possicao e impar
            }
        }

        System.out.println(pessoasNoCamarote + " pessoas no camarote");
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.

    }
}
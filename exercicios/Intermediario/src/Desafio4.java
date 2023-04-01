/*
 * Desafio
Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e 
ficou maravilhado como aquele lanche era gostoso. Porém, ficou horrorizado 
como algumas coisas no aplicativo do cardápio estavam erradas. Então, 
você se ofereceu para ajudá-los com seus conhecimentos de programação. 
Ao conversar com o gerente, ele te explicou que a vontade da lanchonete 
era criar um menu com os nomes dos ingredientes formando o lanche, como 
no exemplo abaixo:
Pao
Presunto
Carne
Pao
Entrada
A entrada serão os ingredientes que compõem o lanche.
Saída
A saída deverá ser o lanche montado com as palavras que definem os ingredientes.

Exemplo
Entrada                                         	Saída
         Pao;Presunto;Carne;Pao     	         Pao
                                                 Presunto
                                                 Carne
                                                Pao 

        Pao;Picles;Tomate;Pao 	                Pao
                                                Picles
                                                Tomate       
                                                 Pao

          Pao;Tomate;Carne;Pao	                 Pao
                                                 Tomate
                                                 Carne
                                                 Pao
 */

 import java.util.Scanner; 
    
 public class Desafio4 {
     public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         String ingredientes = leitor.next();
         String listaIngredientes[] = new String[3];

        array = listaIngredientes.split(";");
                
        System.out.println(" " + array[0] + " " + array[1] + " " + array [2]);
         
         // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
 
     }
 }
/*
 * Desafio
A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um 
sistema de câmeras que iria verificar se os carros estão acima de 80km/h. Porém,
eles queriam também anotar a placa dos carros no banco de dados para que, a 
partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de
habilitação. Para isso, contrataram você para realizar esse programa, logo que você 
fez um trabalho tão bom para a cidade A.

Lembrando que toda vez que um carro é pego pela câmera e está acima da velocidade
 permitida automaticamente já é contabilizado uma multa para ele.
 Exemplo
Entrada	Saída
   80
    1	 "1 multas. Nao levou pontos na carteira" 

   85
    1	 "2 multas. Nao levou pontos na carteira"
    
   95
    2	 "3 multas. Levou pontos na carteira"

 */

 import java.util.Scanner; 
    
 public class Desafio2 {
     public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         int velocidade = leitor.nextInt();
         int multas = leitor.nextInt();
         
         if (velocidade > 80 ){
            multas++;
         }

         if (multas >= 3){
            System.out.println(multas + " multas. Levou pontos na carteira ");

         }else{
            System.out.println(multas + " multas. Nao levou pontos na carteira ");

         }
         // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
 
         // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
 
     }
 }
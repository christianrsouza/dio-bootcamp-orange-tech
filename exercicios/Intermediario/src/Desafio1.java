/*
 * Desafio
Sua irmã está com o computador muito lento e pediu para você formata-lo. 
Mas ela gostaria muito de que todas as músicas dela fossem salvas e não
deletadas com o resto dos arquivos durante a formatação. Todas as 
músicas estão no formato .mp3
Crie um programa que cada arquivo com esse formato não seja deletado.


Exemplo
Entrada	Saída
   "minhasamigas.png"  	      "Deletar"   
   "Californication.mp3"	      "Salvar"
   "Zeca Pagodinho - Algum Completo.rar" 	      "Deletar"
 */
import java.util.Scanner;

import javax.xml.transform.Source; 
    
public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String mp3 = ".mp3";
        if (arquivoDoPc.contains(mp3)){

            System.out.println("Salvar");
       
           }
       
           else{
       
            System.out.println("Deletar");
       
           }
}
}
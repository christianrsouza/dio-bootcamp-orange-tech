package edu.christian.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        //System.out.print (" Ola mundo");
        String primeiroNome = "Christian";// passando o primeiro parametro do metodo
        String segundoNome = "Souza";// segundo paramentro

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);// atribuindo uma variavel e chamando o metodo e passando os valores

        System.out.print(nomeCompleto);// imprimindo 

    }
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);//criaççao do metodo e concatenando 
    //return primeiroNome + " " + segundoNome; outra forma de fazer
}


}

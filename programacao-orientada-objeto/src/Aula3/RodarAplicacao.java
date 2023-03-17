package Aula3;


class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // cirando um objeto estanciando numa variavel

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();// bloco criando um upcast

        //Gerente gerente_ = new Funcionario(); // bloco criando um downcasts
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}

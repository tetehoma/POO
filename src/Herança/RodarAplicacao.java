package Herança;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
//Embora seja valido deve ser evitado
       // Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}

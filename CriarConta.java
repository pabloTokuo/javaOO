public class CriarConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // A informação recebida por NEW sera guardada dentro da REFERENCIA primeiraConta que tera como variavel CONTA.
        primeiraConta.saldo = 200; // Saldo da conta
        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);

    }

}

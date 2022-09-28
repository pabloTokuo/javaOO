public class ContaSemCliente {
    public static void main(String[] args) {
        Conta cliente56 = new Conta();

        cliente56.titular = new Cliente();
        cliente56.titular.nome = "Rob";

        System.out.println(cliente56.titular.nome);


    }
}

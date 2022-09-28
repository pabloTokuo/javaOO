public class TestaBanco {
    public static void main(String[] args) {
        Cliente pablo = new Cliente(); // Novo cliente com referencia "pablo"
        pablo.nome = "Pablo Tokuo";
        pablo.cpf = "111.222.333-44";
        pablo.profissao = "Programador";

        Conta contaNumero1 = new Conta(); // Nova conta com referencia contaNumero1
        contaNumero1.deposita(100);

        // associa o cliente pablo a conta contaNumero1.
        contaNumero1.titular = pablo; //contaNumero1 recebe como titular "pablo"
        System.out.println(contaNumero1.titular.nome); // Nome do titular da contaNumero1



    }


}

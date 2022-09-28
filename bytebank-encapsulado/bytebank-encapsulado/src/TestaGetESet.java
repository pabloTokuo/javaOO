public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1221, 3535);
        System.out.println(conta.getAgencia()); // Pegando o numero da agencia

        conta.setNumero(5378); // Setando numero da conta
        System.out.println(conta.getNumero());

        Cliente cliente1 = new Cliente();
        conta.setTitular(cliente1); // a conta chamada conta recebe como titular da conta o cliente cliente1.

        conta.getTitular().setNome("Pablo Tokuo"); // Chamando o titular da Conta e setando seu Nome;
        System.out.println(conta.getTitular().getNome());

    }

}

public class TestaContaSaldoNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(101);
        System.out.println(conta.getSaldo()); // Metodo mostrarSaldo()

        // Proibido acessar atributo diretamente, criar metodos para isso.
//         conta.saldo = conta.saldo - 101;
//         System.out.println(conta.saldo);

        conta.saca(101);
        System.out.println(conta.getSaldo()); // Metodo mostrarSaldo()
    }

}

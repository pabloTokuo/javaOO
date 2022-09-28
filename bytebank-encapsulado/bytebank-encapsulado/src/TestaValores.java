public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1377, 225435); // Os parenteses ao lado de conta esta invocando um Construtor
        System.out.println(conta);

        Conta novaConta = new Conta(1377, 2542355);
        System.out.println(conta);
    }

}

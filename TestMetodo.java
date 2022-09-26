public class TestMetodo {

    public static void main(String[] args) {

        Conta contaDoPablo = new Conta();

        contaDoPablo.saldo = 500;
        contaDoPablo.deposita(100); // Referencia Conta do Pablo vai receber o metodo deposita

        System.out.println(contaDoPablo.saldo);

        contaDoPablo.saca(700);
        System.out.println(contaDoPablo.saldo);

        Conta contaDoSklavoesd = new Conta();
        contaDoSklavoesd.saldo = 1000;

        contaDoSklavoesd.transfere(500, contaDoPablo);
        System.out.println(contaDoSklavoesd.saldo);
        System.out.println(contaDoPablo.saldo);


    }
}

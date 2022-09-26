public class Conta{
    double saldo;
    int agencia;
    int numero;
    String titular;

    //
    public void deposita(double valor){ // metodo recebe um parametro valor
        this.saldo += valor; // o saldo do objeto que esta chamando o metodo vai somar o valor
    }

    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            saca(valor);
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }

    }

}
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; // Titular da conta tem referencia o Cliente
    private static int total; // Valor estatico para que não fique criando um novo valor toda vez que for invocado

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("Conta numero: " +Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada com sucesso!, Agencia: " + agencia + " Numero: " + numero);

    }


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

    public double getSaldo(){ // Metodo que retorna saldo da conta
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static int getTotal(){
        System.out.println("Conta numero: " +Conta.total);
        return Conta.total;
    }

}
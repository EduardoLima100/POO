public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }
    public void sacar(float valor){
        this.saldo = this.saldo - valor * 1.005;
    }
    public double getSaldo(){
        return saldo;
    }
}

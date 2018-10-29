public class ContaEspecial extends ContaCorrente {
    public ContaEspecial(float saldo) {
        super(saldo);
    }

    @Override
    public void sacar(float valor) {
        this.saldo = this.saldo - valor * 1.001;
    }
}

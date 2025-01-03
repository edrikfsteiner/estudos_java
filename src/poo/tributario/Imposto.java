package poo.tributario;

public abstract class Imposto {
    private double valor;
    protected double aliquota;

    public Imposto(double valor, double aliquota) {
        this.valor = valor;
        this.aliquota = aliquota;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double calcularImposto() {
        return getValor() * getAliquota();
    }
}
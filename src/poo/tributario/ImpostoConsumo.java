package poo.tributario;

public class ImpostoConsumo extends Imposto {
    public ImpostoConsumo(double valor, double aliquota) {
        super(valor, aliquota);
    }

    public double calcularImposto(double desconto) {
        return calcularImposto() - desconto;
    }

    public double calcularImposto(double desconto, double adicional) {
        return calcularImposto() - desconto + adicional;
    }
}
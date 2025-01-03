package design_patterns.exemplo_builder.aviao;

import design_patterns.exemplo_builder.components.Motor;

public class AviaoBuilder {
    protected TipoAviao tipo;
    protected Motor motor;
    protected double asa;
    protected boolean armas;
    protected int assentos;

    public AviaoBuilder tipo(TipoAviao tipo) {
        this.tipo = tipo;
        return this;
    }

    public AviaoBuilder motor(Motor motor) {
        this.motor = motor;
        return this;
    }

    public AviaoBuilder asa(double asa) {
        this.asa = asa;
        return this;
    }

    public AviaoBuilder armas(boolean armas) {
        this.armas = armas;
        return this;
    }

    public AviaoBuilder assentos(int assentos) {
        this.assentos = assentos;
        return this;
    }

    public Aviao build(TipoAviao tipoAviao) {
        switch (tipoAviao) {
            case CARGA:
                tipo(tipoAviao);
                motor(new Motor(2000, 2000));
                asa(40);
                armas(false);
                assentos(20);
                return new Aviao(this);

            case CIVIL:
                tipo(tipoAviao);
                motor(new Motor(1000, 1000));
                asa(40);
                armas(false);
                assentos(20);
                return new Aviao(this);

            case JATO:
                tipo(tipoAviao);
                motor(new Motor(3000, 3000));
                asa(40);
                armas(false);
                assentos(20);
                return new Aviao(this);

            default:
                return new Aviao(this);
        }
    }
}
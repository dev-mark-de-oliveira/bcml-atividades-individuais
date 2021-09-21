public class Retangulo {

    public double calculaArea(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }

    public double calculaPerimetro(double ladoA, double ladoB) {
        return 2 * (ladoA + ladoB);
    }


    public int MétodoquantidadePiso(double areaLajota, double areaTotal) {
        return (int) Math.ceil(areaTotal / areaLajota);
    }

    public int quatidadeRodapé(double comprimentoLajota, double perimetro) {
        return (int) Math.ceil(comprimentoLajota / perimetro);
    }

}



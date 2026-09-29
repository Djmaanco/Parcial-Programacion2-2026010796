public class ComisionPersonalizada implements EstrategiaComision {
    private int nLetrasPrimerNombre;


    public ComisionPersonalizada(String primerNombre) {
        this.nLetrasPrimerNombre = primerNombre.trim().split("\\s+")[0].length();
    }


    public ComisionPersonalizada(int nLetras) {
        this.nLetrasPrimerNombre = nLetras;
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + nLetrasPrimerNombre) / 100.0; // (5 + N)%
        return montoVenta * porcentaje;
    }
}
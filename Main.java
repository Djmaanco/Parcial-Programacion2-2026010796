public class Main {
    public static void main(String[] args) {

        EstrategiaComision estandar = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Carlos Eduardo", 1500.0, estandar);

        vendedor.mostrarDetalle();
    }
}
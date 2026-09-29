public class Main {
    public static void main(String[] args) {
        // En la rama main usa por defecto ComisionEstandar
        EstrategiaComision estandar = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Carlos", 1000.0, estandar);

        vendedor.mostrarDetalle();
    }
}
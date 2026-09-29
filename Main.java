public class Main {
    public static void main(String[] args) {
        EstrategiaComision personalizada = new ComisionPersonalizada("Carlos");
        Vendedor vendedor = new Vendedor("Carlos", 1000.0, personalizada);

        vendedor.mostrarDetalle();
    }
}
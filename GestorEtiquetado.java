public class GestorEtiquetado {

    public void imprimirEtiqueta(ProductoGeek producto) {
        System.out.println("=== ETIQUETA DE VENTA ===");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio Final: $" + producto.calcularPrecioVenta());
        System.out.println("-------------------------\n");
    }

    public static void main(String[] args) {
        GestorEtiquetado gestor = new GestorEtiquetado();

        Comic comic = new Comic("COM-02", "Batman Year One", 15000.0, 1);
        FiguraColeccionable figura = new FiguraColeccionable("FIG-01", "Estatua Batman Limited", 90000.0, true);

        // Pasamos distintos objetos a través de un parámetro del tipo de la superclase
        gestor.imprimirEtiqueta(comic);
        gestor.imprimirEtiqueta(figura);
    }
}
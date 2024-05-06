// archivo Main.java
import dao.ProductoDAO;
import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();

        // Crear un nuevo producto
        productoDAO.createProducto("Lasaña", Date.valueOf("2022-02-25"), 100, 2.99, true);

        // Obtener todos los productos
        productoDAO.getAllProductos();

        // Actualizar un producto
        productoDAO.updateProducto(2, "Patatas con azúcar", Date.valueOf("2022-02-25"), 120, 3.99, true);

        // Eliminar un producto
        //productoDAO.deleteProducto(1);
    }
}

	// ProductoDAO.java
	package dao;
	
	import conectaBD.Conexion;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class ProductoDAO {
	
	    public void getAllProductos() {
	        try (Connection conn = Conexion.getConnection()) {
	            Statement statement = conn.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");
	
	            while (resultSet.next()) {
	                System.out.println(resultSet.getInt("idProducto") + ", " +
	                                   resultSet.getString("nombre") + ", " +
	                                   resultSet.getDate("fechaEnvasado") + ", " +
	                                   resultSet.getInt("unidades") + ", " +
	                                   resultSet.getDouble("precio") + ", " +
	                                   resultSet.getBoolean("disponible"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	    public void createProducto(String nombre, java.sql.Date fechaEnvasado, int unidades, double precio, boolean disponible) {
	        String sql = "INSERT INTO productos (nombre, fechaEnvasado, unidades, precio, disponible) VALUES (?, ?, ?, ?, ?)";
	
	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	
	            pstmt.setString(1, nombre);
	            pstmt.setDate(2, fechaEnvasado);
	            pstmt.setInt(3, unidades);
	            pstmt.setDouble(4, precio);
	            pstmt.setBoolean(5, disponible);
	            pstmt.executeUpdate();
	
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	    public void updateProducto(int idProducto, String nombre, java.sql.Date fechaEnvasado, int unidades, double precio, boolean disponible) {
	        String sql = "UPDATE productos SET nombre = ?, fechaEnvasado = ?, unidades = ?, precio = ?, disponible = ? WHERE idProducto = ?";
	        
	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	
	            pstmt.setString(1, nombre);
	            pstmt.setDate(2, fechaEnvasado);
	            pstmt.setInt(3, unidades);
	            pstmt.setDouble(4, precio);
	            pstmt.setBoolean(5, disponible);
	            pstmt.setInt(6, idProducto);
	            pstmt.executeUpdate();
	
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	    public void deleteProducto(int idProducto) {
	        String sql = "DELETE FROM productos WHERE idProducto = ?";
	
	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	
	            pstmt.setInt(1, idProducto);
	            pstmt.executeUpdate();
	
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private Connection con;

    public Connection conectar() {

        try {
            // 🔥 URL correcta (MySQL / MariaDB)
            String url = "jdbc:mysql://localhost:3306/granja?useSSL=false&serverTimezone=UTC";

            // 🔥 Usuario de tu base de datos
            String user = "root";

            // 🔥 CONTRASEÑA (CAMBIA ESTO SI TIENES OTRA)
            String pass = "diegoars123";

            con = DriverManager.getConnection(url, user, pass);

            System.out.println(" Conexión exitosa a la base de datos");

        } catch (Exception e) {
            System.out.println(" Error de conexión: " + e);
        }

        return con;
    }
}
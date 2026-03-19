package login;

import conexion.Conexion;
import menu.MenuPrincipal;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame {

    JTextField txtUsuario;
    JPasswordField txtPassword;
    JButton btnLogin, btnRegistrar;

    public Login() {
        setTitle("Login - Sistema Granja");
        setSize(320, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 80, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 30, 150, 25);
        add(txtUsuario);

        // Contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(30, 70, 80, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 70, 150, 25);
        add(txtPassword);

        // Botón ingresar
        btnLogin = new JButton("Ingresar");
        btnLogin.setBounds(50, 120, 100, 30);
        add(btnLogin);
        btnLogin.addActionListener(e -> validarLogin());

        // Botón registrar
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(160, 120, 100, 30);
        add(btnRegistrar);
        btnRegistrar.addActionListener(e -> {
            Registro registro = new Registro();
            registro.setVisible(true);
        });
    }

    // Método para validar login
    private void validarLogin() {
        String usuario = txtUsuario.getText();
        String password = new String(txtPassword.getPassword());

        try {
            Conexion cn = new Conexion();
            Connection con = cn.conectar();

            if (con == null) {
                JOptionPane.showMessageDialog(this, "Error: no se pudo conectar a la base de datos");
                return;
            }

            String sql = "SELECT * FROM usuarios WHERE usuario=? AND contraseña=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Bienvenido, " + usuario + "!");
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace(); // Para ver el error real en consola
            JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + e.getMessage());
        }
    }

    // Método main para probar solo esta ventana
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
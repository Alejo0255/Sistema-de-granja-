package login;

import conexion.Conexion;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Registro extends JFrame {

    JTextField txtUsuario;
    JPasswordField txtPassword;

    public Registro() {
        setTitle("Registro de Usuario");
        setSize(300,230);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setBounds(20, 20, 80, 25);
        add(lblUser);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(100, 20, 150, 25);
        add(txtUsuario);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(20, 60, 80, 25);
        add(lblPass);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 60, 150, 25);
        add(txtPassword);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(100, 110, 100, 30);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> registrarUsuario());
    }

    private void registrarUsuario() {

        if(txtUsuario.getText().isEmpty() || txtPassword.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        try {
            Conexion cn = new Conexion();
            Connection con = cn.conectar();

            String sql = "INSERT INTO usuarios (usuario, contraseña) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, txtUsuario.getText());
            ps.setString(2, new String(txtPassword.getPassword()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Usuario registrado");

            txtUsuario.setText("");
            txtPassword.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }
}
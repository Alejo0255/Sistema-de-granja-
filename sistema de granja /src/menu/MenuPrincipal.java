package menu;

import javax.swing.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Sistema Granja");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Bienvenido al sistema");
        add(label);
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConBoton {
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Ejemplo GUI");
        JButton boton = new JButton("Haz clic");

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botón presionado");
            }
        });

        ventana.setSize(300, 200);
        ventana.setLayout(null);
        boton.setBounds(100, 80, 100, 30);
        ventana.add(boton);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
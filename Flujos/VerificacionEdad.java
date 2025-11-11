import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerificacionEdad extends JFrame {
    private JTextField campoNombre;
    private JTextField campoApellidos;
    private JTextField campoEdad;
    private JButton botonVerificar;
    private JLabel etiquetaResultado;

    public VerificacionEdad() {
        setTitle("Verificación de Edad");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes
        add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        add(campoNombre);
        add(new JLabel("Apellidos:"));
        campoApellidos = new JTextField();
        add(campoApellidos);

        add(new JLabel("Edad:"));
        campoEdad = new JTextField();
        add(campoEdad);

        botonVerificar = new JButton("Verificar");
        add(botonVerificar);

        etiquetaResultado = new JLabel("");
        add(etiquetaResultado);
        // Evento del botón
        botonVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarEdad();
            }
        });
    }

    private void verificarEdad() {
        String nombre = campoNombre.getText().trim();
        String apellidos = campoApellidos.getText().trim();
        String edadTexto = campoEdad.getText().trim();

        if (nombre.isEmpty() || apellidos.isEmpty() || edadTexto.isEmpty()) {
            etiquetaResultado.setText("Por favor, complete todos los campos.");
            return;
        }
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad >= 18) {
                etiquetaResultado
                        .setText("Hola, " + nombre + " " + apellidos + ". Puedes usar la sección para adultos.");
            } else {
                etiquetaResultado
                        .setText("Hola, " + nombre + " " + apellidos + ". No puedes usar la sección para adultos.");
            }
        } catch (NumberFormatException ex) {
            etiquetaResultado.setText("La edad debe ser un número válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VerificacionEdad().setVisible(true));
    }
}
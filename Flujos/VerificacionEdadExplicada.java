import javax.swing.*; // Importa las clases necesarias para crear la interfaz gráfica
import java.awt.*; // Importa las clases necesarias para el diseño de la interfaz gráfica
import java.awt.event.ActionEvent; // Importa la clase ActionEvent para manejar eventos de acción
import java.awt.event.ActionListener; // Importa la interfaz ActionListener para recibir eventos de acción

public class VerificacionEdadExplicada extends JFrame { // Declara la clase principal VerificacionEdad que extiende JFrame
    private JTextField campoNombre; // Declara un campo de texto para el nombre
    private JTextField campoApellidos; // Declara un campo de texto para los apellidos
    private JTextField campoEdad; // Declara un campo de texto para la edad
    private JButton botonVerificar; // Declara un botón para verificar la edad
    private JLabel etiquetaResultado; // Declara una etiqueta para mostrar el resultado

    public VerificacionEdadExplicada() { // Constructor de la clase VerificacionEdad
        setTitle("Verificación de Edad"); // Establece el título de la ventana
        setSize(400, 250); // Establece el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece la operación de cierre de la ventana (salir de la aplicación)
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(new GridLayout(5, 2, 10, 10)); // Establece el diseño de la ventana con un GridLayout de 5 filas, 2 columnas y 10 píxeles de espacio

        // Componentes
        add(new JLabel("Nombre:")); // Añade una etiqueta para el campo de nombre
        campoNombre = new JTextField(); // Crea un campo de texto para el nombre
        add(campoNombre); // Añade el campo de texto para el nombre a la ventana
        add(new JLabel("Apellidos:")); // Añade una etiqueta para el campo de apellidos
        campoApellidos = new JTextField(); // Crea un campo de texto para los apellidos
        add(campoApellidos); // Añade el campo de texto para los apellidos a la ventana

        add(new JLabel("Edad:")); // Añade una etiqueta para el campo de edad
        campoEdad = new JTextField(); // Crea un campo de texto para la edad
        add(campoEdad); // Añade el campo de texto para la edad a la ventana

        botonVerificar = new JButton("Verificar"); // Crea un botón con el texto "Verificar"
        add(botonVerificar); // Añade el botón a la ventana

        etiquetaResultado = new JLabel(""); // Crea una etiqueta vacía para mostrar el resultado
        add(etiquetaResultado); // Añade la etiqueta de resultado a la ventana

        // Evento del botón
        botonVerificar.addActionListener(new ActionListener() { // Añade un ActionListener al botón para manejar los clics
            public void actionPerformed(ActionEvent e) { // Método que se ejecuta cuando se hace clic en el botón
                verificarEdad(); // Llama al método verificarEdad para verificar la edad
            }
        });
    }

    private void verificarEdad() { // Método para verificar la edad
        String nombre = campoNombre.getText().trim(); // Obtiene el texto del campo de nombre y elimina los espacios en blanco
        String apellidos = campoApellidos.getText().trim(); // Obtiene el texto del campo de apellidos y elimina los espacios en blanco
        String edadTexto = campoEdad.getText().trim(); // Obtiene el texto del campo de edad y elimina los espacios en blanco

        if (nombre.isEmpty() || apellidos.isEmpty() || edadTexto.isEmpty()) { // Verifica si alguno de los campos está vacío
            etiquetaResultado.setText("Por favor, complete todos los campos."); // Muestra un mensaje de error si algún campo está vacío
            return; // Sale del método
        }
        try {
            int edad = Integer.parseInt(edadTexto); // Intenta convertir el texto de la edad a un número entero
            if (edad >= 18) { // Verifica si la edad es mayor o igual a 18
                etiquetaResultado.setText("Hola, " + nombre + " " + apellidos + ". Puedes usar la sección para adultos."); // Muestra un mensaje indicando que puede usar la sección para adultos
            } else {
                etiquetaResultado.setText("Hola, " + nombre + " " + apellidos + ". No puedes usar la sección para adultos."); // Muestra un mensaje indicando que no puede usar la sección para adultos
            }
        } catch (NumberFormatException ex) { // Captura la excepción si la edad no es un número válido
            etiquetaResultado.setText("La edad debe ser un número válido."); // Muestra un mensaje de error indicando que la edad debe ser un número válido
        }
    }

    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        SwingUtilities.invokeLater(() -> new VerificacionEdad().setVisible(true)); // Crea una instancia de VerificacionEdad y la hace visible en el hilo de despacho de eventos
    }
}
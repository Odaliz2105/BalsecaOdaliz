import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroProductos extends JFrame {
    private JTextField textField1; // Código
    private JTextField textField2; // Nombre
    private JTextField textField3; // Detalle
    private JTextField textField4; // Precio Unitario
    private JTextField textField5; // Stock
    private JButton limpiarButton;
    private JButton guardarButton;
    private JButton volverButton;
    private JPanel panelregistro;

    public RegistroProductos() {
        setTitle("REGISTRO DE PRODUCTOS");
        setContentPane(panelregistro);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = textField1.getText();
                String nombre = textField2.getText();
                String detalle = textField3.getText();
                String precio = textField4.getText();
                String stock = textField5.getText();

                if (codigo.isEmpty() || nombre.isEmpty() || detalle.isEmpty() || precio.isEmpty() || stock.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                    return;
                }

                if (precio.length() > 4) {
                    JOptionPane.showMessageDialog(null, "El precio unitario debe tener máximo 4 cifras");
                    return;
                }

                if (stock.length() > 3) {
                    JOptionPane.showMessageDialog(null, "El stock debe tener máximo 3 cifras");
                    return;
                }

                JOptionPane.showMessageDialog(null, "Producto guardado exitosamente");
                limpiarCampos();
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuOpciones();
                dispose();
            }
        });
    }

    private void limpiarCampos() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
    }
}

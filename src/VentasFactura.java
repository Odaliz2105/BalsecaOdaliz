import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentasFactura extends JFrame {
    private JTextField textField1; // Código
    private JTextField textField2; // Nombre
    private JTextField textField3; // Precio
    private JTextField textField4; // Cantidad
    private JTextField textField5; // Subtotal
    private JTextField textField6; // Total
    private JButton calcularButton;
    private JButton REGRESARALMENUButton;
    private JPanel panelventas;

    public VentasFactura() {
        setTitle("VENTA - FACTURA");
        setContentPane(panelventas);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double precio = Double.parseDouble(textField3.getText());
                    int cantidad = Integer.parseInt(textField4.getText());

                    if (cantidad > 999) {
                        JOptionPane.showMessageDialog(null, "Cantidad supera el stock disponible");
                        return;
                    }

                    double subtotal = precio * cantidad;
                    double iva = subtotal * 0.12;
                    double total = subtotal + iva;

                    textField5.setText(String.format("%.2f", subtotal));
                    textField6.setText(String.format("%.2f", total));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error en campos numéricos");
                }
            }
        });

        REGRESARALMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuOpciones();
                dispose();
            }
        });
    }
}

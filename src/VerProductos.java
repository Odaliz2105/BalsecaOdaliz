import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerProductos extends JFrame {
    private JPanel panelVerProductos;
    private JButton REGRESARALMENUButton;
    private JTextField textField1; // Código
    private JTextField textField2; // Nombre
    private JTextField textField3; // Precio
    private JTextField textField4; // Stock

    public VerProductos() {
        setTitle("VER PRODUCTOS");
        setContentPane(panelVerProductos);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        REGRESARALMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuOpciones();
                dispose();
            }
        });
    }
}

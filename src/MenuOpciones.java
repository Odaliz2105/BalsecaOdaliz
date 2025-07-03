import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuOpciones extends JFrame {
    private JButton registroButton;
    private JButton ventasButton;
    private JButton vereProductosButton;
    private JPanel panelmenu;

    public MenuOpciones() {
        setTitle("MENÚ DE OPCIONES");
        setContentPane(panelmenu);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistroProductos();
                dispose();
            }
        });

        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentasFactura();
                dispose();
            }
        });

        vereProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerProductos();
                dispose();
            }
        });
    }
}

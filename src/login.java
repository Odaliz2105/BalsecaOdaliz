import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JPasswordField textpassword;
    private JTextField textusuario;
    private JButton accesoButton;
    private JButton limpiarButton;
    private JPanel panelLogin;
    private JLabel usuario;
    private JLabel password;

    public login() {
        setTitle("LOGIN");
        setContentPane(panelLogin);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textusuario.getText();
                String password = String.valueOf(textpassword.getPassword());

                if (usuario.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete los campos vacíos");
                    return;
                }

                if (usuario.equals("balseca") && password.equals("Esfot123")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                    new MenuOpciones(); // Llamar al menú
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textusuario.setText("");
                textpassword.setText("");
            }
        });
    }
}

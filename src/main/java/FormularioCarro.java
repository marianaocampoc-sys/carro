import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioCarro {
    private JPanel panelPrincipal;
    private JPanel panelCarro;
    private JButton encenderButton;
    private JButton apagarButton;
    private JButton acelerarButton;
    private JButton frenarButton;
    private JLabel lblMensaje;
    private JButton frenarBruscamenteButton;
    private CarroPanel lienzo;

    public FormularioCarro() {
        lienzo = new CarroPanel();
        panelCarro.setLayout(new BorderLayout());
        panelCarro.add(lienzo);

        encenderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText(lienzo.getCarro1().encender());
            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText(lienzo.getCarro1().apagar());
            }
        });
        acelerarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText(lienzo.getCarro1().acelerar());
            }
        });
        frenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText(lienzo.getCarro1().frenar());
            }
        });
        frenarBruscamenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText(lienzo.getCarro1().frenarBruscamente());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario Carro");
        frame.setContentPane(new FormularioCarro().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
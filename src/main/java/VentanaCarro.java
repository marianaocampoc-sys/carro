import javax.swing.*;
public class VentanaCarro extends JFrame {
    public VentanaCarro(){
        setTitle("Ventana Carro");
        add(new CarroPanel());
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaCarro();
    }
}

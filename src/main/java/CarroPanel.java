import javax.swing.*;
import java.awt.*;
public class CarroPanel extends JPanel{
    private Carro carro1 = new Carro(50,100);

    private Timer timer;

    public CarroPanel(){
        setPreferredSize(new Dimension(600,400));
        setBackground(Color.WHITE);
        timer = new Timer(30, e -> {
            carro1.mover(getWidth());
            repaint();
        });
        timer.start();

    }

    public Carro getCarro1() {
        return carro1;
    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        carro1.dibujar(g);

    }
}

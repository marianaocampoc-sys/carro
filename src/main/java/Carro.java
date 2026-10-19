import java.awt.*;
public class Carro {
    private static final int VELOCIDAD_MAXIMA = 20;
    private static final int PASO = 2;
    private static final int ANCHO = 140;
    private static final int LIMITE_VELOCIDAD= 10;
    private int x;
    private int y;
    private int velocidad;
    private boolean encendido;

    public Carro(int x, int y){
        this.x = x;
        this.y = y;
        this.velocidad = 0;
        this.encendido = false;
    }
    public String encender(){
        if (encendido) {
            return "El carro ya esta encendido";
        }
        encendido = true;
        return "Carro encendido";
        }
    public String acelerar() {
        if (!encendido) {
            return "El carro esta apagado: no se puede acelerar";

        }
        if (velocidad >= VELOCIDAD_MAXIMA) {
            return "Esta conduciendo por encima de los limites de velocidad";
        }
        velocidad += PASO;
        return "Acelerando: su velocidad es de " + velocidad;
    }
        public void mover(int anchoLienzo) {
            x += velocidad;
            if (anchoLienzo >0 &&x>anchoLienzo) {
                x = -ANCHO;
            }
        }
        public String frenar(){
            if(!encendido){
                return "El carro esta apagado, no puede frenar";
            }
            if (velocidad ==0){
                return "El carro esta detenido";
            }
            else{
                velocidad -= PASO;
                return "Frenando. Su nueva velocidad es: "+ velocidad;
            }

        }
        public String apagar(){
            if (!encendido){
                return "El carro ya esta apagado";

            }
            if(velocidad > 0){
                return "Tienes que frenar primero";

            }
            else{
                encendido = false;
                return "Carro apagado con éxito";
            }
        }
    public String frenarBruscamente(){
        if (!encendido){
            return "No se puede frenar bruscamente porque el carro esta apagado";

        }
        if (velocidad == 0) {
            return "No se puede, el carro esta detenido";
        }
        if(velocidad >= LIMITE_VELOCIDAD){
            velocidad = 0;
            return "Limite de velocidad excedido, el carro patinara";

        }
        velocidad =0;
        return "Frenado en seco";
    }
    public void dibujar(Graphics g){
        g.setColor(new Color(236, 21, 21));
        g.fillRect(x, y + 30, 140, 40);

        int[] techoX = {x+30, x +50, x +100, x +120};
        int[] techoY = {y+30, y , y, y+30};
        g.setColor((new Color(120, 103, 102)));
        g.fillPolygon(techoX, techoY, 4);

        dibujarLlanta(g, x + 20);
        dibujarLlanta(g, x + 90);

    }
    private void dibujarLlanta(Graphics g, int llantaX){
        g.setColor(Color.BLACK);
        g.fillOval(llantaX, y +55, 30, 30);
    }
}

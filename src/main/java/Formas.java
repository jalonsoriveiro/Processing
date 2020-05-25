// importamos la libreria proncipal
import processing.core.PApplet;
import processing.core.PImage;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 600; // ancho en pixels
    int viewport_h = 450; // alto en pixels
    PImage img;
    PImage bg;
    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
        //size(320,240);
        // Make a new instance of a PImage by loading an image file
       // img = loadImage("TheChild.png");
        //size(320,240);
        // Make a new instance of a PImage by loading an image file

        img = loadImage("2.png");
         bg = loadImage("3.png");

    }

    // método principal. Aqui estará el grueso de nuestro código
    // sería equivalente a un 'main'
    // la DIFERENCIA principal es que se ejecuta en bucle
    // es decir, se repite el código infinitamente
    @Override
    public void draw() {
        //Fondo
        background(0);
        //Mover imagen con el ratón
        image(img, mouseX, mouseY);
        
        if (mouseX >217 && mouseY<217) {
                        //atenuar imagen
                        tint(255, 127);
                        img = loadImage("1.jpg");
                    }else{
                        img = loadImage("2.png");
                        //atenuar imagen
                        tint(90,90);
                    }


    }
}
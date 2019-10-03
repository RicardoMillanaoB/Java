package practica1swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        this.setSize(300, 300);
        setTitle("Mi primera ventana");
        iniciarComponentes();//cierra de ventana 1
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // cierra  de ventana 2
        this.setResizable(false);//Para que no expandir ni minimizar la ventana
        this.setMinimumSize(new Dimension(200,200)); // Determina el tamaño minimo de la ventana
        this.setMaximumSize(new Dimension(400,400)); //Determina el tamaño maximo de la ventanta
        this.getContentPane().setBackground(Color.red);
    }

    private void iniciarComponentes() {
        addWindowListener(new java.awt.event.WindowAdapter() {
            
            @Override//Cierra la ventana 1
            public void windowClosing(java.awt.event.WindowEvent evento) {
                System.exit(0);
            }
            
        });
    }

    public static void main(String[] args) {

        Ventana x = new Ventana();
        x.setVisible(true);
    }

}

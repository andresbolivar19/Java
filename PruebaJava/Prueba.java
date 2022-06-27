//Libreria usada para trabajar con modo grafico
import javax.swing.JOptionPane;
//Libreria para usar al solicitar datos por teclado, 
import java.util.Scanner;

public class Prueba
{
    public static void main (String [] args)
    {
        int cantidad = 70;
        int a = 10;
        int b = 20;
        double potencia = Math.pow(a, b);
        boolean boleano = 5 > 4;
        //Se debe poner al menos un numero en formato decimal para que muestre el resultado en formato decimal 
        double division = 5.0 / 4.0;
        boolean comparacionand = 5>4 && 3>7;
        boolean comparacionor = 5>4 || 3>7;
        System.out.println("Hola grupo de " + cantidad + " estudiantes");
        JOptionPane.showMessageDialog(null, "Bienvenidos grupo H41");
        /*
         * Para comentar en bloque
         */
        
        // Para solicitar informacion al usuario 
        Scanner teclado = new Scanner(System.in);
        String datoTeclado = teclado.nextLine();
        System.out.println(datoTeclado);
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, nombre);
        
        //Convierte ingreso de texto en numero
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        int res = dato + 5;
        JOptionPane.showMessageDialog(null, "La respuesta es: "+res);
        /*
         * PARSE Para convertir Texto a Numero
         * Byte.parseByte
         * Short.parseShort
         * Integer.parseInt
         * Long.parseLong
         * Float.parseFloat
         * Double.parseBouble
         */
        
    }
}



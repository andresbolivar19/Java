import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Arranque
{
    public static void main(String [] args)
    {
        Terreno t = new Terreno();
        t.setLargo( Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese largo del terreno")) );
        t.setAncho( Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese ancho del terreno")) );
        t.setEstrato( Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese estrato del terreno")) );
                      
        DecimalFormat formato = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, "Las medidas del terreno son: "+t.getLargo()+" x "+t.getAncho());
        JOptionPane.showMessageDialog(null, "El area total es: "+t.calcularArea()+ "\nEl total del terreno es: $"+formato.format(t.calcularValorTotal()));
    }
}

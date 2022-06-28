import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Arranque
{
    public static void main(String [] args)
    {
        Terreno t = new Terreno();
        t.largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese largo del terreno"));
        t.ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese ancho del terreno"));
        t.estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese estrato del terreno"));
        
        t.calcularArea();
        t.calcularValorTotal();
        
        
        DecimalFormat formato = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, "El area total es: "+t.area+"\nEl total del terreno es: $"+formato.format(t.valorTotal));
    }
}

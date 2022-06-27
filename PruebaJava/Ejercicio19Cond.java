import java.util.Scanner;

public class Ejercicio19Cond
{
    public static void main(String [] args)
    {
        //Definir variables
        int numcuenta;
        double saldoinicial, creditos, pagos, limite, sfinal;
        
        //Preguntar datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de la cuenta: ");
        numcuenta = Integer.parseInt( teclado.nextLine() );
        System.out.println("Saldo mensual: ");
        saldoinicial = Double.parseDouble( teclado.nextLine() );
        System.out.println("Ingrese gatos: ");
        creditos = Double.parseDouble( teclado.nextLine() );
        System.out.println("Ingrese pagos: ");
        pagos = Double.parseDouble( teclado.nextLine() );
        System.out.println("Ingrese limite: ");
        limite = Double.parseDouble( teclado.nextLine() );
        
        sfinal = calcularSaldo(saldoinicial ,pagos , creditos);
        System.out.println("El saldo final es: "+sfinal);
    }
    static double calcularSaldo(double saldoinicial, double pagos, double creditos)
    {
        double saldofinal = saldoinicial + pagos - creditos;
        if (saldofinal >= 0)
        {
            System.out.println("Dentro del limite");
        }
        else
        {
            System.out.println("Se paso del limite");
        }
        return saldofinal;
    }
}
        
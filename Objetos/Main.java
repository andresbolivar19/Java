public class Main
{
    // void significa que no tiene retorno,
    // cuando tiene retorno va String, int, float...
    public static void main(String []args)
    {
        Morral m = new Morral();
        Morral j = new Morral();
        
        m.color = "amarillo";
        m.precio = 150000;
        System.out.println("El morral es de color "+m.color+" y cuenta "+m.precio);
        
        j.color = "azul";
        j.precio = m.precio;
        System.out.println("El morral es de color "+j.color+" y cuesta "+j.precio);
        
        j.cargarObjetos();
        m.desocuparMorral();
    }
}

public class Terreno
{
    // Atributos/Variables de clase/Propiedades
    private double largo;
    private double ancho;
    private int estrato;
    private double area;
    private double valorTotal;
    
    //Getters y Setters
    // Obtener el valor del largo
    double getLargo()
    {
        return this.largo;
    }
    
    // Obtener el valor del ancho
    double getAncho()
    {
        return this.largo;
    }
    
    // void cuando no se necesita que el metodo devuelva una variable
    void setLargo(double largo)
    {
        this.largo = largo;
    }
    
    // void cuando no se necesita que el metodo devuelva una variable
    void setEstrato(int estrato)
    {
        this.estrato = estrato;
    }
    
    // void cuando no se necesita que el metodo devuelva una variable
    void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    
    //Metodos
    double calcularArea()
    {
        this.area = this.largo * this.ancho;
        return this.area;
    }
    
    double calcularValorTotal()
    {
        if(this.estrato == 1 || this.estrato == 2)
        {
            this.valorTotal = this.area * 2500000;
        }
        else if (this.estrato == 3 || this.estrato == 4)
        {
            this.valorTotal = this.area * 3250000;
        }
        else
        {
            this.valorTotal = this.area * 4820000;
        }
        return this.valorTotal;
    }
}

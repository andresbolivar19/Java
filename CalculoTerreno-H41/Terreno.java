public class Terreno
{
    // Atributos/Variables de clase/Propiedades
    double largo;
    double ancho;
    int estrato;
    double area;
    double valorTotal;
    
    //Metodos
    void calcularArea()
    {
        this.area = this.largo * this.ancho;
    }
    
    void calcularValorTotal()
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
    }
}

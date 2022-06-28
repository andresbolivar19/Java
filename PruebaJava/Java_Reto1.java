/*
Planteamiento de la situación
Dentro de las actividades de desarrollo de software de la compañía donde trabajas se utiliza 
tecnología Java, en uno de los proyectos surge la situación de agregar productos a un lote. 
El scrum master de tu equipo de desarrollo te asigna la incidencia para implementar una función 
que permita calcular el costo de almacenamiento dentro del módulo de productos.

Planteamiento del reto
Generar una función llamada calcularCostoAlmacenamiento(boolean refigerado, float valorBase) 
que reciba dos parámetros, uno de tipo boolean que indica  si un medicamento es refrigerado 
o no refrigerado y otro de tipo float que indique el valorBaseDeAlmacenamiento del medicamento 
y retorne un valor float con el precio de almacenamiento teniendo en cuenta lo siguiente: 

Condiciones
Si un medicamento es refrigerado la variable booleana será true. 
Si un medicamento es refrigerado su costo de almacenamiento tendrá un 30% adicional al valor base, si no un costo adicional del 15%;
Tenga en cuenta el orden de los parámetros 

Acciones de aprendizaje
Analizar la situación problema
Seleccionar el tipo estructura/s de control que permitirán dar solución a la situación planteada
 */

public class Java_Reto1
{
    public static float calcularCostoAlmacenamiento(boolean refigerado, float valorBase)
        {
            float precio;
            if (refigerado == true)
            {
                precio = (float)(valorBase * 1.30);
            }
            else 
            {
                precio = (float)(valorBase * 1.15);
            }
            return precio;
        }
    public static float calcularCostoAlmacenamiento2(boolean refigerado, float valorBase)
        {
            float precio;
            // Operador Ternario
            // en 3 blooques
            // 1ra = Condición
            // 2da = Si es VERDADERA, formula a realizar
            // 3ra = Si es FALSA, formula a realizar
            
            // Variable = Condicion ? Si es verdadero hace : Si es falso hace ;
            precio = refigerado == true? (float)(valorBase*1.30):(float)(valorBase*1.15);
            return precio;
        }
    public static float calcularCostoAlmacenamiento3(boolean refigerado, float valorBase)
    {
        float precio;
        // Operador Ternario
        // en 3 blooques
        // 1ra = Condición
        // 2da = Si es VERDADERA, formula a realizar
        // 3ra = Si es FALSA, formula a realizar
        
        // Variable = Condicion ? Si es verdadero hace : Si es falso hace ;
        precio = refigerado? (float)(valorBase*1.30):(float)(valorBase*1.15);
        return precio;
    }
    /*
     * Para pasarlo en la plataforma como reto se pasa asi 
    float calcularCostoAlmacenamiento(boolean refigerado, float valorBase)
	{
		float precio;
		if (refigerado == true)
		{
			precio = (float)(valorBase * 1.30);
		}
		else 
		{
			precio = (float)(valorBase * 1.15);
		}
		return precio;
	}
     */
}

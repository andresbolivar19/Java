/*
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
●     Si trabaja 40 horas o menos se le paga el 0.015 del SMLV por hora laborada.
●     Si trabaja más de 40 horas se le paga a 0.02 del SMLV por hora laborada.

Realice una función que se llame salario que reciba como parámetro la cantidad de 
horas del obrero y retorne un valor double con el salario devengado para dar solución al problema.

El SMLV es 1000000

Por ejemplo:
Test	Resultado
System.out.println(salario(10));    150000.0
 */


public class CuestionarioTema1
{
    double salario(double horas)
    {
        double devengado;
        
        if (horas <= 40)
        {
            devengado = 0.015 * 1000000 * horas; 
        }
        else
        {
            devengado = 0.02 * 1000000 * horas; 
        }
        return devengado;   
    }
}

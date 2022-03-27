
package taller4.ejercicio4;


public class Habitacion {
    double largo;
    double ancho;
    double altura;
    
    double Valdoza;
    double tapiz;
    
    public void calcularValdoza(double largo, double ancho){
        Valdoza= largo*ancho;
    }
    
    public void caluclarTapiz(double altura,double ancho){
        tapiz=altura*ancho;
    }
    
    
    public void mostrarResultados(){
        System.out.println("  ****CALCULOS****\n");
        System.out.println("los metros cuadrados para valdozas el piso son: "+Valdoza);
        System.out.println("los metros cuadrados para tapizar las paredes son: "+tapiz+"\n");
    }
    
    
    
}

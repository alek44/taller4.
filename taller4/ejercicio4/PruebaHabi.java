
package taller4.ejercicio4;


public class PruebaHabi {
    public static void main(String [] args){
        Habitacion op= new Habitacion();
        double largo= 9.8;
        double ancho= 20.5;
        double altura=14.6;
        
        op.calcularValdoza(largo, ancho);
        op.caluclarTapiz(altura, ancho);
        op.mostrarResultados();
           
    }
}

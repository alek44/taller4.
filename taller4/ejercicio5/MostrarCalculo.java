
package taller4.ejercicio5;


public class MostrarCalculo {
    public static void main(String [] args){
        TrianguloIsoseles tri= new TrianguloIsoseles();
        
        System.out.println("  ***DATOS***\n");
        tri.setAltura(17);
        System.out.println("La altura del triangulo es: "+tri.getAltura());
        tri.setBase(10);
        System.out.println("La base del triangulo es: "+tri.getBase());
        
        System.out.println("\n***CALCULOS***\n");
        tri.calcularArea(10, 17);
        tri.calcularLongitud(10, 17);
        tri.calcularPerimetro(10, 17);
        tri.mostrarResultados();
           
    }
    
}


package taller4.ejercicio6;


public class Solucion {
    public static void main(String [] args){
        EcuacionCuadratica op= new EcuacionCuadratica();
        
        System.out.println("   ***DATOS***\n");
        op.setA(3);
        System.out.println("a = "+op.getA());
        op.setB(5);
        System.out.println("b = "+op.getB());
        op.setC(-12);
        System.out.println("c = "+op.getC());
        
        System.out.println("\n***RESULTADOS***\n");
        op.calcular(3, 5, -12);
        op.mostrarEcuacion();
        op.mostrarResultados();
        
        
        
        
        
    }

   
}

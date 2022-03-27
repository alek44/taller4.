
package taller4.ejercicio5;


public class TrianguloIsoseles {
    private double base;
    private double altura;
    double area,x,longitudL,Peri;
 
    
    public void setBase (double base){
        this.base=base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setAltura (double altura){
        this.altura=altura;
    }
    
    public double getAltura (){
        return altura;
    }
    
    public void calcularArea (double base, double altura){
        area= (base*altura)/2;
    }
    
    public void calcularLongitud(double base, double altura){
        x= Math.pow((base/2),2)+Math.pow(altura,2);
        longitudL= Math.sqrt(x);
              
    }
    
    public void calcularPerimetro (double base, double altura){
        Peri= 2*longitudL+ base;
    }
    
    public void mostrarResultados(){
        System.out.println("El area del triangulo isoseles es: "+area);
        System.out.println("La longitud de los lados del triangulo isoseles es: "+longitudL);
        System.out.println("El perimetro del triangulo isoseles es: "+Peri);
    }
    
}

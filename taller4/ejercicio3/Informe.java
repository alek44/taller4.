
package taller4.ejercicio3;

import java.util.Scanner;

public class Informe {
    Scanner in = new Scanner(System.in);
    int[] Ventas = new int[13];
    float Promedio;
    double Mayor;
    double Menor;
    double Total;

    public Informe(float Promedio, double Mayor, double Menor, double Total) {
        this.Promedio = Promedio;
        this.Mayor = Mayor;
        this.Menor = Menor;
        this.Total = Total;
    }


    public int[] getVentas() {
        return Ventas;
    }

    public void setVentas(int[] Ventas) {
        this.Ventas = Ventas;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    public double getMayor() {
        return Mayor;
    }

    public void setMayor(double Mayor) {
        this.Mayor = Mayor;
    }

    public double getMenor() {
        return Menor;
    }

    public void setMenor(double Menor) {
        this.Menor = Menor;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
    
    public int llenarInforme() {
        System.out.println("---INGRESO DE VENTAS---");
        for (int i=1; i<=12; i++){
            System.out.println("ingresa las ventas del mes "+i+":");
            Ventas[i] = in.nextInt();
        }
        return Ventas[12];
    }
    
    public double Promedio() {
        for (int j=1; j<=12; j++){
            Promedio += Ventas[j];
        }
        Promedio = Promedio / 12;
        return Promedio;
    }
    
    public double Mayor() {
        for (int k=1; k<=12; k++){
            Mayor = Ventas[1];
            for (int m=1; m<=12; m++){
                if (Ventas[k]>Ventas[m]){
                    Mayor = Ventas[k];
                }
            }
        }
        return Mayor;
    }
    
    public double Menor() {
        for (int k=1; k<=12; k++){
            Menor = Ventas[1];
            for (int m=1; m<=12; m++){
                if (Ventas[k]<Ventas[m]){
                    Menor = Ventas[k];
                }
            }
        }
        return Menor;
    }
    
    public double Total() {
        for (int j=1; j<=12; j++){
            Total += Ventas[j];
        }
        return Total;
    }
    
    public void mostrarVentas() {
        System.out.println("las ventas del año son: ");
        for (int i=1; i<=12; i++){
            System.out.println("mes "+i+": "+Ventas[i]);
        }
        System.out.println("el promedio de venats es: "+Promedio);
        System.out.println("la venta mayor es: "+Mayor);
        System.out.println("la venta menor fue: "+Menor);
        System.out.println("el total de ventas anual es: "+Total);
    }
}

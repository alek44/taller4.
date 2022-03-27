
package taller4;

import java.util.Scanner;

public class Cuenta {
    Scanner entrada = new Scanner(System.in);
    int monto;
    int noCuenta;
    String nombreCliente;
    double Saldo;

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }
    
    
    //metodos
    public int ingresoCuenta() {
        
        System.out.println("ingrese su numero de cuenta");
        noCuenta = entrada.nextInt();
        return noCuenta;
}
    
    public String NombreCliente() {
        System.out.println("ingrese su nombre como cliente. ");
        nombreCliente = entrada.next();
        return nombreCliente;
    }
    
    public double ingreseSaldo() {
        System.out.println("ingrese el saldo que tiene: ");
        Saldo = entrada.nextDouble();
        return Saldo;
    }
    
    public double Consignar() {
        System.out.println("digite la cantidad que desea ingresar: ");
        monto = (int) entrada.nextDouble();
        monto = (int) (Saldo + monto);
        return monto;
    }
    
    public double Retirar() {
        System.out.println("digite la cantidad que desea retirar: ");
        monto = (int) entrada.nextDouble();
        monto = (int) (Saldo - monto);
        return monto;
    }
    
    public void mostrarDatos() {
        System.out.println("cuenta: "+noCuenta);
        System.out.println("nombre del cliente: "+nombreCliente);
        System.out.println("de saldo: "+monto);
    }
}


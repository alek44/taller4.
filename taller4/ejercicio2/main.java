
package taller4.ejercicio2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opci;
        Cuenta CU1 = new Cuenta();
        CU1.ingresoCuenta();
        CU1.NombreCliente();
        CU1.ingreseSaldo();
        System.out.println("digite que desea C(consignar) R(retirar): ");
        opci = entrada.next();
        if (opci.equals("C")){
            CU1.Consignar();
        }
        else {
            CU1.Retirar();
        }
        System.out.println("");
        CU1.mostrarDatos();
}
}

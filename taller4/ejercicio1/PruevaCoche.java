
package taller4.ejercicio1;

public class PruevaCoche {
    public static void main(String[] args) {
       Coche C1 = new Coche("verde", "nissa", "t-800", 7, 4, "tgh-567");
       Coche C2 = new Coche("rojo", "toyota", "t-500", 5, 4, "pfg-141");
       Coche C3 = new Coche("azul", "chebrolet", "t-950", 12, 4, "awq-608");
        System.out.println(C1);
        C1.Propiedad();
        System.out.println("");
        System.out.println(C2);
        C2.Propiedad();
        System.out.println("");
        System.out.println(C3);
        C3.Propiedad();
        
}
}

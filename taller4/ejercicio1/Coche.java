
package taller4.ejercicio1;

public class Coche {
    
    String color;
    String marca;
    String modelo;
    int numcaballos;
    int numpuerta;
    String matricula;
    
    
    public Coche(String color, String marca, String modelo, int numcaballos, int numpuerta, String matricula) {
          this.color = color;
          this.marca = marca;
          this.modelo = modelo;
          this.numcaballos = numcaballos;
          this.numpuerta = numpuerta;
          this.matricula = matricula;
      }
 
    
    public class pruevaCoche {
     String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getNumcaballos() {
            return numcaballos;
        }

        public void setNumcaballos(int numcaballos) {
            this.numcaballos = numcaballos;
        }

        public int getNumpuerta() {
            return numpuerta;
        }

        public void setNumpuerta(int numpuerta) {
            this.numpuerta = numpuerta;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
     String marca;
     String modelo;
     int numcaballos;
     int numpuerta;
     String matricula;
    }
    public void Propiedad() 
    {
        System.out.println("su color es: "+color);
        System.out.println("su marca es: "+marca);
        System.out.println("su modelo es: "+modelo);
        System.out.println("el numero de caballos del motor es: "+numcaballos);
        System.out.println("el numero de puertas es: "+numpuerta);
        System.out.println("su numero de matricula es: "+matricula);
    }
            
     
    
}

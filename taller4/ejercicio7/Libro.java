
package taller4.ejercicio7;
import java.util.Scanner;

public class Libro {
    Scanner entrada = new Scanner(System.in);
    int[] Libro = new int[5];
    String Titulo;
    String Edicion;
    String Autor;
    String ISBN;
    public String editorial = "Prentice-Hall";
    String ciudad,pais;
    String fecha;
    int Paginas;
    

    public Libro(String Titulo, String Edicion, String Autor, String ISBN, String editorial, int Paginas, String ciudad, String pais, String fecha) {
        this.Titulo = Titulo;
        this.Edicion = Edicion;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.Paginas = Paginas;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha = fecha;
    }

    public int[] getLibro() {
        return Libro;
    }

    public void setLibro(int[] Libro) {
        this.Libro = Libro;
    }

    public String getTítulo() {
        return Titulo;
    }

    public void setTítulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
 
    
    public int llenarLibros() {
        for (int i=1; i<=2;i++){
            System.out.println("ingrese el titulo del libro #"+i);
            Titulo = entrada.nextLine();
            System.out.println("ingrese la edicion del libro #"+i);
            Edicion = entrada.next();
            System.out.println("ingrese el autor del libro #"+i);
            entrada.nextLine();
            Autor = entrada.nextLine();
            System.out.println("ingrese el ISBN del libro #"+i);
            ISBN = entrada.next();
            System.out.println("ingrese la ciudad del libro #"+i);
            entrada.nextLine();
            ciudad = entrada.nextLine();
            System.out.println("ingrese el pais del libro #"+i);
            pais = entrada.nextLine();
            System.out.println("ingrese la fecha de publicacion del libro #"+i);
            fecha = entrada.next();
            System.out.println("ingrese el numero de paginas del libro #"+i);
            entrada.nextLine();
            Paginas = entrada.nextInt();
            entrada.nextLine();
            System.out.println("");
        }
        return Libro[2];
    }
    
    public int mostrarLibros() {
        for (int j=1; j<=2; j++) {
            System.out.println("titulo del libro #"+j+": "+Titulo);
            System.out.println("edicion del libro #"+j+": "+Edicion);
            System.out.println("autor del libro #"+j+": "+Autor);
            System.out.println("ISBN del libro #"+j+": "+ISBN);
            System.out.println("editorial del libro #"+j+": "+editorial);
            System.out.println("ciudad del libro #"+j+": "+ciudad);
            System.out.println("pais del libro #"+j+": "+pais);
            System.out.println("fecha del libro #"+j+": "+fecha);
            System.out.println("paginas del libro #"+j+": "+Paginas);
            System.out.println("");
        }
        return Libro[2];
    }
    
}

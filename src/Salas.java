import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Salas {
    private Object Espectador = null;
    private int capacidad;
    private String pelicula;
    private String nombre;
    private LinkedList<Espectador> coleccionEspectadores;

    public Salas(int capacidad, String nombre){
        this.capacidad = capacidad;
        this.nombre = nombre;
        //this.coleccionCarrera = new LinkedList<Carrera>();
        this.coleccionEspectadores = new LinkedList<Espectador>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getEspectadores() {
        // Se debe poder listar los espectadores de una sala, pero en caso de que no
        // haya sido asignada se debe capturar el error emitiendo el mensaje "SIN ESPECTADORES CARGADOS".
//        Scanner scan = new Scanner(System.in);
//        String sala;
//        System.out.printf(" ingrese el la sala a listar");
//        sala = scan.next();

        if (coleccionEspectadores.size()!=0){
            System.out.println(coleccionEspectadores.toString());
        }else{
            System.out.println("SIN ESPECTADORES CARGADOS");
        }

        return null;
    }

    public void setEspectadores(Espectador espectadores) {
        coleccionEspectadores.add(espectadores);
        }


    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", espectadores=" + coleccionEspectadores.toString() +
                '}';
    }

    public void setEspectadores() {
    }
}

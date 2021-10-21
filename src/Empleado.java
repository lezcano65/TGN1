import java.util.LinkedList;
import java.util.Objects;

public class Empleado extends Persona{
    private double sueldo;

    public Empleado (String nombre, int edad){

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        if (Objects.equals(Empleado.this.getTipo(), "Empleado")) {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", sueldo= " + sueldo +
                    '}';
        }else {
            return "Acomodador{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", sueldo= " + sueldo +
                    '}';
        }
    }

    @Override
    public String getTipo(){
        return "Empleado";
    }

}

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
        return "Espectador{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';

    }
    @Override
    public String getTipo(){
        return "Empleado";
    }

}

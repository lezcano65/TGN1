public class Acomodador extends Empleado implements ParaAcomodadores{
    private Salas sala;

    public Acomodador(String nombre, int edad){
        super(nombre, edad);
    }


    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    @Override
    public void setSala(Salas sala) {
    }

}

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Salas sala01 = new Salas(40, "salaA");
        Espectador nidea = new Espectador("juan ",23," b",22);
        Espectador nideaa = new Espectador("fede ",23," b",24);
        Espectador nideax = new Espectador("fede ",23," b",24);
        sala01.setEspectadores(nidea);
        sala01.setEspectadores(nideaa);
        sala01.setEspectadores(nideax);
        System.out.println("la sala 01 contiana a : ");
        sala01.getEspectadores();
        Salas sala02 = new Salas(40, "salaA");
        sala02.getEspectadores();

    };
}

package parcial.app;

import parcial.dominio.Material;
import parcial.dominio.Pooflix;

public class Aplicación {
    public static void main(String[] args) {
        Pooflix pooflix=new Pooflix();
        Material material1=new Material(12,"origen",3,"Pelicula");
        Material material2=new Material(15,"PeakyBlindres",1,"Serie");
        Material material3=new Material(8,"OurPlanet",2,"documental");

        pooflix.buscar("origen");

    }
}

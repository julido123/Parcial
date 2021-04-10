package parcial.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pooflix  {
    public static final int CAPACIDAD = 15;
    private List<Material> materiales= new ArrayList<>();




    //Métodos

    public boolean agregar(Material m) {
        for (Material material : this.materiales) {
            if (m.getCodigo() == m.getCodigo()) {
                return false;
            } else {
                materiales.add(m);
                return true;
            }
        }
        return true;
    }

    public boolean retirar(int codigo) {
        for (Material material : this.materiales) {
            if (material.getCodigo() == codigo) {
                materiales.remove(material);
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public Material buscar(int codigo) {
        Material materialBuscar = null;
        for (Material material : this.materiales) {
            if (material.getCodigo() == codigo) {
                materialBuscar = material;

            }
        }

        return materialBuscar;

    }

    public Material buscar(String nombre) {
        Material materialBuscar = null;
        for (Material material : this.materiales) {
            if (material.getNombre().equalsIgnoreCase(nombre)) {
                materialBuscar = material;
            }
        }
        return materialBuscar;
    }

    public List<Material> buscarPorTipo(String tipo) {
        List<Material> porTipo = new ArrayList<>();

        for (Material material : this.materiales) {
            if (material.getTipoMaterial().equals(tipo)) {
                porTipo.add(material);
            }
        }
        return porTipo;
    }

    public int calcularDuracionTotal() {
        /*
        for(int i=0; i<=materiales.size();i++){
            suma += materiales.g;
        }*/
        /*for (Material material:this.materiales) {
            material.getDuracion()+=;

        }*/

        return 0;
    }

    public List<Material> ordenarPorCodigo() {
        List<Material> ordenar= new ArrayList<>();
        Arrays.sort(materiales.toArray());
        for (Material material:this.materiales) {
            materiales.add(material);
        }
        return ordenar;
    }


    //Get and set

    public static int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }
}

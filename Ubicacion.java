import java.util.*;

public class Ubicacion implements Comparable<Ubicacion> {
    private String nombree;
    private float distancia;
    private int cantidad;
    public static List<Ubicacion> ubicaciones = new ArrayList<>();

    public Ubicacion(String no, float di, int ca) {
        this.nombree = no;
        this.distancia = di;
        this.cantidad = ca;
    }

    public String getNombre() {
        return nombree;
    }

    public void setNombre(String nombre) {
        this.nombree = nombre;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int compareTo(Ubicacion e) {
        if (e.getDistancia() > distancia) {
            return -1;
        } else if (e.getDistancia() == distancia) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String casoNueve() {
        String contador = "";
        int posicionMenor = 0;

        for (int i = 0; i < Ubicacion.ubicaciones.size(); i++) {
            Ubicacion p = Ubicacion.ubicaciones.get(1);
            if(i==0){
                posicionMenor =  p.getCantidad();
                contador = "El lugar es "+ p.getNombre() + " la distancia es de "+ p.getDistancia() + " con una invasion de "+ p.getCantidad() + " zombies";
            }
            else{
                if(p.getCantidad()<posicionMenor){
                    posicionMenor = p.getCantidad();
                    contador= "El lugar es " + p.getNombre() + " la distancia es de " + p.getDistancia() +" con una invasion de " + p.getCantidad() + " zombies";

                }
            }
        }
        return contador;

    }

    public Ubicacion() {
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "nombree:'" + nombree + '\'' +
                ", distancia:" + distancia + " " + "m" +
                ", cantidad:" + cantidad +
                '}';
    }
}

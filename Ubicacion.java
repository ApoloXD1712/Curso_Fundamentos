public class Ubicacion {
    private String nombree;
    private float distancia;
    private int cantidad;

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

    public Ubicacion(){
    }
    @Override
    public String toString() {
        return "Ubicacion{" +
                "nombree='" + nombree + '\'' +
                ", distancia=" + distancia +" "+"m"+
                ", cantidad=" + cantidad +
                '}';
    }
}


import java.time.*;

public class Zombie {
    private    String nombre;
    private    int salud;
    private    LocalDate nacimiento;
    private    String tipoSangre;

    public Zombie(String n, int s, String tps, LocalDate na){

        this.nombre = n;
        this.salud = s;
        this.nacimiento = na;
        this.tipoSangre = tps;

    }

    public Zombie() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", nacimiento=" + nacimiento +
                ", tipoSangre='" + tipoSangre + '\'' +
                '}';
    }
}
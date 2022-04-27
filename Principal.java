import java.time.LocalDate;
import java.util.*;
import java.util.Random;
public class Principal {

    public static List<Ubicacion> ubicaciones = new ArrayList<>();
    public static List<Zombie> zombies = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("0: se detiene todo");
        System.out.println("1: se creara un zombie");
        System.out.println("2: se mostrara la informacion de los zombies");
        System.out.println("3: se mostrara la cantidad de zombies");
        System.out.println("4: se mostrara los zombies con sangre 0+ y AB");
        System.out.println("5: se mostrara todo los zombies que nacieron despues del 2000");
        System.out.println("6: se lanzara una bomba a toda la ciudad y reducira a la mitad la salud de los zombies");
        System.out.println("7: se creara una Ubicacion");
        System.out.println("8: se mostrara el total de ubicaciones almacenadas");
        System.out.println("9: se dira la ubicacion mas segura");
        System.out.println("10: se mostraran las ciudades de la mas cercana a la mas alejada de Alejandria");
        System.out.println("11: Frase aleatoria de zombies");
        System.out.println("12: funcionalidad de la alcaldesa");
        Principal.mostrarmenu();
        
    }

    public static void mostrarmenu() {
        int contador = 0;
        int x = 0;

        do {
       
            x = scan.nextInt();
            System.out.println(x);
            int f = x;
            switch (f) {
                case 1:

                    if(zombies.size() >= 5) {
                        System.out.println("Ya no se pueden mas");
                        break;
                    } else {
                        Zombie zombieAInsertar = new Zombie();

                        System.out.println("Escriba un nombre: ");
                        String nombre = scan.next();

                        zombieAInsertar.setNombre(nombre);

                        System.out.println("Salud del zombie: ");
                        int salud = scan.nextInt();

                        zombieAInsertar.setSalud(salud);

                        System.out.println("Tipo de sangre del zombie:");
                        String sangre = scan.next();

                        zombieAInsertar.setTipoSangre(sangre);

                        System.out.println("Fecha de nacimiento(año-mes-dia):");
                        String fecha = scan.next();
                        LocalDate nacimiento = LocalDate.parse(fecha);

                        zombieAInsertar.setNacimiento(nacimiento);

                        zombies.add(zombieAInsertar);
                        contador ++;
                        break;
                    }

                case 2:
                    for (Zombie z : zombies) {
                        System.out.println(z.toString());
                    }
                    // Crear un contador por cada vez que se ejecute el caso 1
                    break;

                case 3:
                    System.out.println(contador);
                    break;
                case 4:
                    for (Zombie z : zombies) {
                        if(z.getTipoSangre().equals("AB+") || z.getTipoSangre().equals("O+") ){
                            System.out.println(z.toString());
                        }
                    }
                    // mostrar zombies con tipo de sanfre AB y O+
                    break;
                case 5:
                    for (Zombie z : zombies) {
                        if(z.getNacimiento().isAfter(LocalDate.of(2000, 12, 12)) ){
                            System.out.println(z.toString());
                        }
                        // Se mostraran todos los zombies que nacieron despues del 2000
                    }
                    break;
                case 6:
                    for (Zombie z : zombies) {
                        int temp = z.getSalud();
                        int num = temp / 2;
                    }
                    break;
                case 7:
                    Ubicacion ubicacionaInsertar = new Ubicacion();

                    System.out.println("Escriba un nombre:");
                    String nombree = scan.next();

                    ubicacionaInsertar.setNombre(nombree);

                    System.out.println("Distancia a Alexandria:");
                    int distancia = scan.nextInt();

                    ubicacionaInsertar.setDistancia(distancia);

                    System.out.println("Cantidad de zombies:");
                    int cantidad = scan.nextInt();

                    ubicacionaInsertar.setCantidad(cantidad);

                    ubicaciones.add(ubicacionaInsertar);

                    
                    break;
                case 8:
                    for (Ubicacion u : ubicaciones) {
                        System.out.println(u.toString());
                    }
                    break;
                case 9:
                //No esta completo, no me dió la logio JASJASJA
                //Intenté pero no me dió tampoco by: Alejo
                break;

                case 11:
                
                System.out.println(Principal.caso_Once());
                break;

                case 12:
                        
                    for (Zombie z : zombies) {
                    
                        int salud = z.getSalud();
                        int daño = 500;
                        int ataque = salud - daño;
                    }
                        //La alcaldesa le quita 500 de vida a todos los zombies
                break;


           
            }
         } while (x != 0);
        
    }

    public static String caso_Once(){
        String frase1 = "Te voy a comer el cerebro";
        String frase2 = "Los zombies de Alejandria son muy peligrosos";
        String frase3 = "La invasion comenzó en el 2020";
        String frase4 = "Los zombies con con pantalon rojo son los mas peligrosos";
        String frase5 = "Loz zombies van a dominar el mundo";

        String frase = "Chupela";
        Random f = new Random();
        int alazar = f.nextInt(5);
        switch(alazar){
            case 1 : frase = frase1;
                    break;
            case 2: frase = frase2;
                    break;
            case 3 : frase = frase3;
                    break;
            case 4 : frase = frase4;
                    break;
            case 5: frase = frase5;
                    break;
        }
        return frase;
    }

}
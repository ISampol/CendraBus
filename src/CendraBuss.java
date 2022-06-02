import java.util.Scanner;

public class CendraBuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digues el numero de seients");
        Caracteristiques.nombreDeSeients = sc.nextInt();

        System.out.println("Digues la marca del motor");
        Caracteristiques.marcaDelMotor = sc.next();

        System.out.println("Digues la cilndrada");
        Caracteristiques.cilindrada = sc.next();

        System.out.println("Digues els CV de potencia");
        Caracteristiques.potencia = sc.next();

        System.out.println("Digues la longitud");
        Caracteristiques.longitud = sc.next();

        System.out.println("Digues el color o colors");
        Caracteristiques.color = sc.next();




        System.out.println("El vehicle marca "+ Caracteristiques.marcaDelConjunt + " té les següents característiques, " +
                "combustible: " + Caracteristiques.combustible + ", " + Caracteristiques.nombreDeSeients + " seients, motor marca: " + Caracteristiques.marcaDelMotor +
                " amb una cilindrada de " + Caracteristiques.cilindrada + " i " + Caracteristiques.potencia + " cavalls de potència. ");

        System.out.println("L’autobús té una longitud de " + Caracteristiques.longitud + " metres i será de color " + Caracteristiques.color + " i incorporarà " +
                "els següents extres xxxxxxx, xxxxx , xxxxx.");

        System.out.println("Un cop acabat el vehicle tindrà un preu de xxxx euros i un pes de xxxx kgs.");

        sc.close();
    }
}

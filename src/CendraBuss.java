import java.util.Scanner;

public class CendraBuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bus cendraBus = new Bus();
        Extres elsExtres = new Extres();

        System.out.println("Digues el numero de seients");
        cendraBus.nombreDeSeients = sc.nextInt();

        System.out.println("Digues la marca del motor");
        cendraBus.marcaDelMotor = sc.next();

        System.out.println("Digues la cilndrada");
        cendraBus.cilindrada = sc.next();

        System.out.println("Digues els CV de potencia");
        cendraBus.potencia = sc.next();

        System.out.println("Digues la longitud");
        cendraBus.longitud = sc.next();

        System.out.println("Digues el color o colors");
        cendraBus.color = sc.next();

        System.out.println("Per ultim digues el pes i el preu del vehicle");
        cendraBus.pesVehicle = sc.nextInt();
        cendraBus.preuVehicle = sc.nextInt();

        System.out.println("Digues quins extres vols");
        String extres = sc.next();

        String seleccio = "";

        if (extres.equals("AireCondicionat")){
            cendraBus.preuVehicleAmbExtres = cendraBus.preuVehicle + elsExtres.aireCondicionatEuros;
            cendraBus.pesVehicleAmbExtres = cendraBus.pesVehicle + elsExtres.aireCondicionatPes;
            seleccio = "Aire Condicionat";
        }else if (extres.equals("EnganxallRemolc")){
            cendraBus.preuVehicleAmbExtres = cendraBus.preuVehicle + elsExtres.enganxallRemolcEuros;
            cendraBus.pesVehicleAmbExtres = cendraBus.pesVehicle + elsExtres.enganxallRemolcPes;
        }else if(extres.equals("SeientsLuxe")){
            cendraBus.preuVehicleAmbExtres = cendraBus.preuVehicle + elsExtres.seientsLuxeEuros;
            cendraBus.pesVehicleAmbExtres = cendraBus.pesVehicle + elsExtres.seientsLuxePes;
        }else if (extres.equals("Calefaccio")){
            cendraBus.preuVehicleAmbExtres = cendraBus.preuVehicle + elsExtres.calefaccioEuros;
            cendraBus.pesVehicleAmbExtres = cendraBus.pesVehicle + elsExtres.calefaccioPes;
        }else if (extres.equals("VidreClimatitzat")){
            cendraBus.preuVehicleAmbExtres = cendraBus.preuVehicle + elsExtres.vidreClimatitzatEuros;
            cendraBus.pesVehicleAmbExtres = cendraBus.pesVehicle + elsExtres.vidreClimatitzatPes;
        }




        System.out.println("El vehicle marca "+ Bus.marcaDelConjunt + " t?? les seg??ents caracter??stiques, " +
                "combustible: " + Bus.combustible + ", " + cendraBus.nombreDeSeients + " seients, motor marca: " + cendraBus.marcaDelMotor +
                " amb una cilindrada de " + cendraBus.cilindrada + " i " + cendraBus.potencia + " cavalls de pot??ncia. ");

        System.out.println("L???autob??s t?? una longitud de " + cendraBus.longitud + " metres i ser?? de color " + cendraBus.color + " i incorporar?? " +
                "els seg??ents extres " + seleccio);

        System.out.println("Un cop acabat el vehicle tindr?? un preu de " + cendraBus.preuVehicleAmbExtres + " euros i un pes de " + cendraBus.pesVehicleAmbExtres + " kgs.");

        sc.close();
    }
}

import com.sun.jdi.StringReference;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Automovil toyota = new Automovil("Toyota","Etios",Color.ROJO,new Motor(1.5, TipoMotor.NAFTA));
        Tanque tanqueToyota = new Tanque(45);
        toyota.setCapacidadTanque(tanqueToyota);


        System.out.println("Automovil color patente: "+ Automovil.getColorPatente());

        Automovil peugeot = new Automovil("Peugeot","206",Color.GRIS);
        peugeot.setMotor(new Motor(1.6, TipoMotor.NAFTA));
        peugeot.setCapacidadTanque(new Tanque());
        System.out.println(peugeot);
        System.out.println("Velocidad maxima: "+ Automovil.VELOCIDAD_MAX_CARRETERA);
        // agregar tipo
        toyota.setTipo(TipoAutomovil.HATCHBACK);
        peugeot.setTipo(TipoAutomovil.SEDAN);
        System.out.println("peugeot.getTipo() = " + peugeot.getTipo().getDescripcion());
        System.out.println("peugeot.getTipo() = " + peugeot.getTipo().getNombre());
        System.out.println("toyota.getTipo() = " + toyota.getTipo().getDescripcion());
        System.out.println("toyota.getTipo() = " + toyota.getTipo().getNombre());
        // agregar nuevos atributos

        Persona camilo = new Persona("Camilo", "Pineda");
        Persona papa = new Persona("Miguel","Valdez");
        toyota.setConductor(camilo);
        peugeot.setConductor(papa);

        System.out.println("Detalle automovil: "+ toyota);
        System.out.println("Detalle automovil: "+ peugeot);

        // agregar ruedas

        for (int i = 0; i < 5; i++) {
            toyota.addRueda(new Rueda("Pirelli",16, 7.5));
        }

        Rueda[] ruedasPeugeot = {new Rueda("Fast",16,7.5),new Rueda("Fast",16,7.5),
                new Rueda("Fast",16,7.5),new Rueda("Fast",16,7.5),new Rueda("Fast",16,7.5)};
        peugeot.setRuedas(ruedasPeugeot);


        for (Rueda r:toyota.getRuedas()) {
            System.out.println("r.getFabricante() = " + r.getFabricante());
        }

    }
    }

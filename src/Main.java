import com.sun.jdi.StringReference;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Automovil toyota = new Automovil("Toyota","Etios",Color.ROJO,1.5);
        toyota.setCapacidadTanque(45);
        System.out.println("Detalle automovil: "+ toyota.detalle());
        System.out.println("toyota.acelerarFrenar(3000) = " + toyota.acelerarFrenar(3000));

        System.out.println("toyota.calcularConsumo(300,0.6f) = " + toyota.calcularConsumo(300,0.6f));
        System.out.println("toyota.calcularConsumo(300,60) = " + toyota.calcularConsumo(300,60));

        System.out.println(toyota.toString());
        System.out.println("Automovil color patente: "+ Automovil.getColorPatente());
        System.out.println("toyota.getColorPatente() = " + toyota.getColorPatente());
        Automovil.setColorPatente("Verde");
        toyota.setColorPatente("verde azulado");
        System.out.println("toyota.getColorPatente() = " + toyota.getColorPatente());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        Automovil peugeot = new Automovil("Peugeot","206",Color.GRIS);
        System.out.println(peugeot);
        System.out.println("Velocidad maxima: "+ Automovil.VELOCIDAD_MAX_CARRETERA);
        // agregar tipo
        toyota.setTipo(TipoAutomovil.HATCHBACK);
        peugeot.setTipo(TipoAutomovil.SEDAN);
        System.out.println("peugeot.getTipo() = " + peugeot.getTipo().getDescripcion());
        System.out.println("peugeot.getTipo() = " + peugeot.getTipo().getNombre());
        System.out.println("toyota.getTipo() = " + toyota.getTipo().getDescripcion());
        System.out.println("toyota.getTipo() = " + toyota.getTipo().getNombre());
    }
    }

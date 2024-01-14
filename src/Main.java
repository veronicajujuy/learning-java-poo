// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Automovil toyota = new Automovil();
        toyota.fabricante = "Toyota";
        toyota.modelo = "Etios";
        toyota.color = "Rojo";
        toyota.cilindrada = 1.6;
        System.out.println("Detalle automovil: "+ toyota.detalle());
        }
    }

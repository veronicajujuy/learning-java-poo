public class Automovil {
    private static int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private TipoAutomovil tipo;

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static final int VELOCIDAD_MAX_CARRETERA = 120;

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    private int capacidadTanque;
    private static String colorPatente = "Azul y blanca";

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void  setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }

    public Automovil() {
        ++id;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Automovil.id = id;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto "+ this.fabricante+" acelera a: "+ rpm +" rpm";
    }
    public String frenar(){
        return this.fabricante +" "+ this.modelo + " frenando!!";
    }
    public String acelerarFrenar(int rpm){
        return this.acelerar(rpm) + "\n"+this.frenar();
    }

    public float calcularConsumo(int km, float porcentajeNafta){
        return km/(this.capacidadTanque*porcentajeNafta);
    }
    public float calcularConsumo(int km, int porcentajeNafta){
        return km/(this.capacidadTanque*(porcentajeNafta/100f));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id= "+ id+ '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada + '\'' +
                ", capacidadTanque=" + capacidadTanque + '\'' +
                ", colorPatente=" + colorPatente+
                '}';
    }
}

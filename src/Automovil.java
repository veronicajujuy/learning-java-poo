public class Automovil {
    private static int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque capacidadTanque;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    // constructores
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque capacidadTanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color);
        this.motor = motor;
        this.capacidadTanque = capacidadTanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static final int VELOCIDAD_MAX_CARRETERA = 120;


    private static String colorPatente = "Azul y blanca";

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public Automovil() {
        ++id;
        this.ruedas = new Rueda[5]; // para que no provoque un error de exception
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Automovil.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(Tanque capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void addRueda(Rueda rueda){
        this.ruedas[indiceRuedas++] = rueda;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelera a: " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!!";
    }

    public String acelerarFrenar(int rpm) {
        return this.acelerar(rpm) + "\n" + this.frenar();
    }

    public float calcularConsumo(int km, float porcentajeNafta) {
        return km / (this.capacidadTanque.getCapacidad() * porcentajeNafta);
    }

    public float calcularConsumo(int km, int porcentajeNafta) {
        return km / (this.capacidadTanque.getCapacidad() * (porcentajeNafta / 100f));
    }

    @Override
    public String toString() {
        String detalle = "Automovil{" +
                "id= " + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + motor.getCilindrada() + '\'' +
                ", capacidadTanque=" + capacidadTanque.getCapacidad() + '\'' +
                ", colorPatente=" + colorPatente +'\'' ;
        if(conductor!=null)
        detalle += ", conductor =" + conductor;
        return detalle;

    }
}
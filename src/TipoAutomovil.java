public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano",4),
    STATION_WAGON("Station Wagon", "Auto Grande", 4),
    HATCHBACK("Hatckback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño",2);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}

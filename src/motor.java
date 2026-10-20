public class motor {
    private String nombre;
    private double potencia;
    private int velocidad;
    private boolean encendido;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPotencia(double potencia) {
        if (potencia >= 0) {
            this.potencia = potencia;
        }
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0 && velocidad <= 100) {
            this.velocidad = velocidad;
        }
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
        this.velocidad = 0;
    }

    public boolean isEncendido() {
        return this.encendido;
    }
}

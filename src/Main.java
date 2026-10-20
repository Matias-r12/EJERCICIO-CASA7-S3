public class Main {
    public static void main(String[] args) {
        motor m = new motor();
        m.setNombre("Motor Cinta");
        m.setPotencia(5.5);
        m.setVelocidad(150); // Inválido, no debe cambiar de 0

        m.encender();
        m.setVelocidad(75); // Válido

        System.out.println("Velocidad actual: " + m.getVelocidad());
    }
}
//package SmartHomeProject;

public class Principal {
    public static void main(String[] args) {
        Lampada Mercurio = new Lampada("Lampada de Mercurio");
    Mercurio.alteraBrilho(25);
        System.out.println("Atualmente o brilho esta em " +Mercurio.getBrilho() +"%");
        Mercurio.alternarEstado();
    Mercurio.alteraBrilho(50);}
}
//package SmartHomeProject;

public class Principal {
    public static void main(String[] args) {
        Lampada Mercurio = new Lampada("Lampada de Mercurio");
        Mercurio.alteraBrilho(25);
        System.out.println("\nAtualmente o brilho esta em " +Mercurio.getBrilho() +"%");
        Mercurio.alternarEstado();
        Mercurio.alteraBrilho(50);
        
        ArCondicionado Arcon = new ArCondicionado("CongelaFrango");
        System.out.println("\nAtualmente o Ar condicionado esta " +Arcon.getEstado());
        Arcon.alternarEstado();
        Arcon.alteraTemp(25);
        System.out.println("Atualmente o Ar condicionado esta " +Arcon.getEstado());
    }
}

//package SmartHomeProject;

public class Lampada extends Dispositivo {
    int brilho = 100;
    
    public Lampada (String nome){
        super(nome);
    }
    public void alteraBrilho(int valor){
        if (estado == "Desligado"){
            System.out.println("Voce so pode alterar o brilho se a lampada estiver ligada");
        }else {
        brilho = valor;
        System.out.println("O brilho esta brilhando em " +brilho+ "%");
        }
    }

    @Override
    public void alternarEstado(){
            if (estado == "Desligado"){
                estado = "Ligado";
                System.out.println("A " +nome+ " foi ligada");
            }else {
                estado = "Desligado";
                System.out.println("A " +nome+ " foi desligada");
        }
    }
    public int getBrilho(){
        return this.brilho;
    }
}

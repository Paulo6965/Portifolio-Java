//package SmartHomeProject;

public class ArCondicionado extends Dispositivo {
    int temp = 22;

    public ArCondicionado (String nome){
        super(nome);
    }
    public void alteraTemp(int valor){
        if (estado == "Desligado"){
            System.out.println("Voce so pode alterar a temperatura se o aparelho estiver ligado");
        }else {
        temp = valor;
        System.out.println("A temperatura esta em " +temp+ "°C");
        }
    }
    public int getTemp(){
        return this.temp;
    }
}

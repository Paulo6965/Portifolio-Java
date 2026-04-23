package GestaoFrota;

public class Principal {
    public static void main(String[]args){
        Veiculo FiatUnoComEscada = new Veiculo("NFT8S20", 10);
        FiatUnoComEscada.viajar(10);
        System.out.printf("Sobrou %f de gasosa", FiatUnoComEscada.get_combustivel());
    }
}
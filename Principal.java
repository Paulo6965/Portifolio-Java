package GestaoFrota;

public class Principal {
    public static void main(String[]args){
        Carro FiatUnoComEscada = new Carro("NFT8S20", 10);
        FiatUnoComEscada.viajar(10);
        Caminhao Scania = new Caminhao("NFT7F19", 50);
        Scania.viajar(10);
        System.out.printf("Sobrou %f de gasosa", FiatUnoComEscada.get_combustivel());
        System.out.printf("\n Sobrou %f de gasosa", Scania.get_combustivel());
    }
}
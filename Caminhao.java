package GestaoFrota;

class Caminhao extends Veiculo {
    public Caminhao (String placa, double combustivel){
        super(placa, combustivel);
    }
        @Override
        public void viajar(double distancia){
            super.viajar(distancia * 9);
        }
}

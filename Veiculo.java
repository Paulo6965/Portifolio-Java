package GestaoFrota;

class Veiculo {
    private String placa;
    private double combustivel;

    public Veiculo(String placa, double combustivel){
        this.placa = placa;
        this.combustivel = combustivel; 
    }

    public void viajar (double distancia){
        double gasto = 9;
        this.combustivel -= distancia/gasto;
        System.out.println("Distancia de " +distancia+ " foram gastos" +distancia/gasto);
    }


    public String get_placa(){
        return this.placa;
    }
    public double get_combustivel(){
        return this.combustivel;
    }
}

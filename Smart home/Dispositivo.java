//package SmartHomeProject;

public class Dispositivo {
        protected String nome;
        protected String estado = "Desligado";

        public Dispositivo(String nome){
            this.nome = nome;
        }

        public void alternarEstado(){
            if (estado == "Desligado"){
                estado = "Ligado";
                System.out.println("O " +nome+ " foi ligado");
            }else {
                estado = "Desligado";
                System.out.println("O " +nome+ " foi desligado");
        }
    }

    public String getEstado(){
        return this.estado;
    }

    public String getNome(){
        return this.nome;
    }
}

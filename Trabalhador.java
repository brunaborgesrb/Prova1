public class Trabalhador{
    //atributos
    String nome; 
    int idade; 
    double valHora; 
    int horasTrabalhadas; 
    boolean ferias; 

    public Trabalhador(String nome, int idade, double valHora, int horasTrabalhadas, boolean ferias){
        this.nome = nome;
        this.idade = idade;
        this.valHora = valHora;
        this.horasTrabalhadas = 0;
        this.ferias = false;
    }


    //metodos
    public void trabalhar(int horas) {
        if (!ferias) {
            horasTrabalhadas += horas;
        }
    }

    public void ferias() {
        ferias =!ferias;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValHora() {
        return valHora;
    }
}

    





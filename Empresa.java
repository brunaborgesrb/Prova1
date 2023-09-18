public class Empresa{
    //atributos
    String nome; 
    String cnpj; 
    Trabalhador[]trabalhadores; 
    String endereco; 
    int numFuncionarios;  
    String ceo;
    
    //construtor
    public Empresa (String nome, String cnpj, String endereco, int numFuncionarios, String ceo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new Trabalhador[20];
        this.endereco = endereco;
        this.numFuncionarios = 0;
        this.ceo = ceo;
    }
 
    //metodos
    public void contratar(Trabalhador trabalhador){
            if (numFuncionarios < 20) {
                trabalhadores[numFuncionarios] = trabalhador;
                numFuncionarios++;
            } else {
                System.out.println("limite de funcionarios");
            }
    }

    public void trabalhar(int ferias){
        for (int i = 0; i < numFuncionarios; i++) {
            trabalhadores[i].trabalhar(8);
        }
    }

    public void calcularPagamento(){
        double totalPagamento = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            totalPagamento += trabalhadores[i].getHorasTrabalhadas() * trabalhadores[i].getValHora();
        }
        System.out.println("valor total a ser pago aos funcionários: R$" + totalPagamento);
    }
}

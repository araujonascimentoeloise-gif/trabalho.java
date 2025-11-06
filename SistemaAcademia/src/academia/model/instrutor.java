package academia.model;

public class instrutor extends pessoa{
    private  String matricula; 

    public instrutor( String nome, int idade, String matricula, String Cpf){
        super(nome, idade ,Cpf);
        this.matricula = matricula;

    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
            System.out.println("instrutor [matricula=" + matricula +"]");
    }

}

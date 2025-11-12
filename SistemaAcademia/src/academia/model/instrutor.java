package academia.model;

public class instrutor extends pessoa{
    private  String matricula; 

    public instrutor( String nome, String  idade, String Cpf, String matricula){
        super(nome, idade ,Cpf);
        this.matricula = matricula;

    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

  
    public void exibirInfo() {
        super.exibirInfo();
            System.out.println("instrutor [matricula=" + matricula +"]");
    }

}

package academia.model;

public class aluno extends pessoa{
	
	private String matricula;
	
public aluno(String nome,String matricula,String idade, String cpf) {
	super(nome,idade,cpf);
	this.matricula = matricula;
	
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

@Override
public void exibirInfo() {
	super.exibirInfo();
	System.out.println("aluno [matricula=" + matricula + "]");
}



}

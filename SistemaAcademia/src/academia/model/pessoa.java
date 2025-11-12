package academia.model;
		public class pessoa{
			private String nome; 
			private String  idade;
			private String Cpf;

		public pessoa (String nome, String idade, String Cpf) {
			this.nome = nome;
			this.idade = idade;
			this.Cpf = Cpf;
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getIdade() {
			return idade;
		}

		public void setIdade(String idade) {
			this.idade = idade;
		}

		public String getCpf() {
			return Cpf;
		}

		public void setCpf(String Cpf) {
			this.Cpf = Cpf;
		}

		public void exibirInfo(){
			System.out.println("pessoa [nome="+ nome + ", idade="+ idade + "Cpf:"+ Cpf+"]");
			
		}	
			
}

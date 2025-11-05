package academia.model;
		public class pessoa{
			private String nome;
			private String idade;
			private String cpf;

		public pessoa (String nome, String idade, String cpf) {
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
			
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
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public void exibirInfo(){
			System.out.println("pessoa [nome="+ nome + ", idade="+ idade + "]");
			
		}	
			
}

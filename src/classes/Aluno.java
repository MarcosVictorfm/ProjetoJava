package classes;

public class Aluno {
	private String nome;
	private String cpf;
	private String email;
	private String idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	public String cadastrar () {
		String msg = "O aluno "+nome+" foi cadastrado";
		return msg;
	}
	

}

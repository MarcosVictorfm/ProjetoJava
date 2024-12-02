package classes;

public class Fornecedor {
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	
	public String cadastrou() {
		String msg = "Fornecedor Cadastrou";
		return msg;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
}

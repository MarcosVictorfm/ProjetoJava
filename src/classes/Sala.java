package classes;

public class Sala {
	private String identificacao;
	private String desacricao;
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getDesacricao() {
		return desacricao;
	}
	public void setDesacricao(String desacricao) {
		this.desacricao = desacricao;
	}
	
	public String cadastrar() {
		String msg = "A sala "+identificacao+"foi cadastrada";
		return msg;
	}

}

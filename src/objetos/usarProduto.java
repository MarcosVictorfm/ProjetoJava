package objetos;

import classes.Fornecedor;
import classes.Produto;

public class usarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell Computer");
		dell.setNomeFantasia("Dell");
		dell.setCnpj("4512684533874");
		System.out.println(dell.cadastrou());
		
		Produto mouse = new Produto();
		mouse.setNome("Mouse sem fio");
		mouse.setDescricao("Mouse sem fio e recaregavel");
		mouse.setPreco(54.20);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("O preço do produto é "+mouse.getPreco());

	}

}

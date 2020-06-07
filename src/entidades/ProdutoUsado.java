package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private Date data_fabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, Date data_fabricacao) {
		super(nome, preco);
		this.data_fabricacao = data_fabricacao;
	}

	public Date getData_fabricacao() {
		return data_fabricacao;
	}

	public String etiquetaPreco() {
		return "" + super.getNome() + " $ " + super.getPreco() + " Data de fabricacao" + dateFormat.format(data_fabricacao);
	}
	
	
	
	
}

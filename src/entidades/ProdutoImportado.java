package entidades;

public class ProdutoImportado extends Produto {

	private double taxa_alfandegaria;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxa_alfandegaria) {
		super(nome, preco);
		this.taxa_alfandegaria = taxa_alfandegaria;
	}

	public double getTaxa_alfandegaria() {
		return taxa_alfandegaria;
	}

	public void setTaxa_alfandegaria(double taxa_alfandegaria) {
		this.taxa_alfandegaria = taxa_alfandegaria;
	}

	public String etiquetaPreco() {
		return "" + super.getNome() + " $ " + precoTotal() + " Taxa alfandegaria "+taxa_alfandegaria;
	}

	public double precoTotal() {
		return super.getPreco() + taxa_alfandegaria;
	}

}

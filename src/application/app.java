package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class app {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o numero de produtos:");
		int n = sc.nextInt();
		List<Produto> novoProduto = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Comum,usado ou importado (c/u/i):");
			char resp = sc.next().charAt(0);

			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Preco:");
			double preco = sc.nextDouble();

			if (resp == 'c' || resp == 'C') {
				
				Produto nvProduto = new Produto(nome, preco);
				novoProduto.add(nvProduto);
				
			} else if (resp == 'u' || resp == 'U') {
				
				System.out.print("Digite data de fabricacao:");
				Date dataF = sdf.parse(sc.next());
				Produto nvProduto = new ProdutoUsado(nome, preco, dataF);
				novoProduto.add(nvProduto);
				
			} else if (resp == 'i' || resp == 'i') {
				
				System.out.print("Digite taxa alfandegaria:");
				double tx = sc.nextDouble();
				Produto nvProduto = new ProdutoImportado(nome, preco, tx);
				novoProduto.add(nvProduto);
				
			}

		}
		
		System.out.print("ETIQUETAS:");
		
		for (Produto produto : novoProduto) {
			System.out.println(produto.etiquetaPreco());
		}
		
		sc.close();

	}

}

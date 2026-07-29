package br.com.connect.models.factories;

import br.com.connect.models.Categoria;
import br.com.connect.models.Produto;

/**
 *
 * @author Daniel Dutra
 */
public class ProdutoFactory {

    public static Produto criarProduto(long id, String nomeProduto, int quantidade, double preco, Categoria categoria) {
        return new Produto(id, nomeProduto, quantidade, preco, categoria);
    }
}

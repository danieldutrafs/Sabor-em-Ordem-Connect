package br.com.connect.repositories;

import br.com.connect.models.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Dutra
 */
public class ProdutoRepository {
    
    private List<Produto> listaProduto = new ArrayList<>();
    
    public void salvarProduto(Produto produto){
        listaProduto.add(produto);
        System.out.println("Produto criado");
    }
    
    public void removerProduto(Produto produto){
        listaProduto.remove(produto);
        System.out.println("Produto removido");
    }
}

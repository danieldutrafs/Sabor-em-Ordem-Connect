package br.com.connect;

import br.com.connect.factories.ProdutoFactory;
import br.com.connect.models.Categoria;
import br.com.connect.models.Produto;
import br.com.connect.repositories.ProdutoRepository;
import java.util.Scanner;

/**
 *
 * @author Daniel Dutra
 */
public class SaborEmOrdemConnect {

    public static void main(String[] args) {
        
        ProdutoFactory factoryP = new ProdutoFactory();
        ProdutoRepository repositoryP = new ProdutoRepository();
        Scanner entrada = new  Scanner(System.in);
        
        
        System.out.println("======Cadastro de categoria======");
        
        System.out.println("Digite o id da categoria: ");
        long idCategoria = entrada.nextLong();
        entrada.nextLine();
        
        System.out.println("Digite o nome da categoria: ");
        String nomeCategoria = entrada.nextLine();
        
        Categoria categoria = new Categoria(idCategoria, nomeCategoria);
        
        System.out.println("======Cadastro de produto======");
        
        System.out.println("Digite o id do produto: ");
        Long idProduto = entrada.nextLong();
        entrada.nextLine();
        
        System.out.println("Digite o nome do produto: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite uma quantidade: ");
        int quantidade = entrada.nextInt();
        
        System.out.println("Digite o valor do Produto: ");
        double preco = entrada.nextDouble();
        entrada.nextLine();
        
        Produto produtoPronto = ProdutoFactory.criarProduto(idCategoria, nome, quantidade, preco, categoria);
        
        repositoryP.salvarProduto(produtoPronto);
        
        System.out.println("ID do Produto: " + produtoPronto.getId());
        System.out.println("Nome do Produto: " + produtoPronto.getNomeProduto());
        System.out.println("Quantidade: " + produtoPronto.getQuantidade());
        System.out.println("Preço: R$ " + produtoPronto.getPreco());
        
        // Acessando os dados da outra classe através do produto!
        System.out.println("Categoria ID: " + produtoPronto.getCategoria().getId());
        System.out.println("Categoria Nome: " + produtoPronto.getCategoria().getNomeCategoria());
        System.out.println("----------------------------------------");
        
        entrada.close();
    }
}

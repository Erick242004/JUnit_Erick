package carrinho;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;


public class CarrinhoTest{
	private Carrinho carrinho;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
	}
	
	@Test
    public void testAdicionarProdutoNoCarrinho() {
        Produto produto = new Produto("Arroz", 10.0);

        carrinho.addItem(produto);

        assertEquals(1, carrinho.getQtdeItems());
    }
	
	 @Test
	 public void testRetornarZeroQuandoCarrinhoEstiverVazio() {
	    assertEquals(0, carrinho.getQtdeItems());
	    }
	 
	 @Test
	    
	 public void testCalcularValorTotalDoCarrinho() {
	    Produto produto1 = new Produto("Arroz", 10.0);
	    Produto produto2 = new Produto("Feijao", 5.0);

	    carrinho.addItem(produto1);
	    carrinho.addItem(produto2);
	        
	    assertEquals(15.0, carrinho.getValorTotal());
	    }
	 
}

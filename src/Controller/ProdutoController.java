/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.SimulaDB;
import DAO.ProdutoDAO;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Pedro
 */
public class ProdutoController {
        ProdutoDAO produtoDAO = ProdutoDAO.getInstance();
    

    
        public Produto salvar(String pNome, int pQuantidade, double pValor, String pCategoria, String pMarca){
            Produto p = new Produto(pNome, pQuantidade, pValor, pCategoria, pMarca);
            return produtoDAO.SalvarProduto(p);
        }
        
        
        public ArrayList<String[]> getProdutos(){
            ArrayList<Produto> Produtos = produtoDAO.getProdutos();       
            ArrayList<String[]> listaProdutos = new ArrayList<>();
        
            for(int i=0; i<Produtos.size();i++){
                listaProdutos.add(new String[]{
                    String.valueOf(Produtos.get(i).getIdProduto()),
                    Produtos.get(i).getNome(),
                    String.valueOf(Produtos.get(i).getQuantidade()),
                    String.valueOf(Produtos.get(i).getValor()),
                    Produtos.get(i).getCategoria(),
                    Produtos.get(i).getMarca()
                });
            }
        
            return listaProdutos;
        }
            
}

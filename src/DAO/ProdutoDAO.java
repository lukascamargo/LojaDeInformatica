/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Produto;
import java.util.ArrayList;
/**
 *
 * @author lukas.camargo
 */
public class ProdutoDAO {
    
    private static ProdutoDAO mockdb;
    private ArrayList<Produto> listaProdutos;
    
    private ProdutoDAO(){
        listaProdutos = new ArrayList<Produto>();
    }
    
    public static synchronized ProdutoDAO getInstance(){
        if(mockdb == null)
            mockdb = new ProdutoDAO();
        
        return mockdb;
    }
    
    public Produto SalvarProduto(Produto p){
        int index = listaProdutos.size() - 1;
        if(index == -1){
            p.setIdProduto(1);
        } else {
            p.setIdProduto(listaProdutos.get(index).getIdProduto() + 1);
        }
        
        listaProdutos.add(p);
        
        return p;
    }
    
    public ArrayList<Produto> getProdutos(){
        return this.listaProdutos;
    }
}

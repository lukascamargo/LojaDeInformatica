/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.VendaDAO;
import model.Venda;
import model.Cliente;
import model.Produto;
import java.util.ArrayList;

/**
 *
 * @author lukas.camargo
 */
public class VendaController {
    VendaDAO vendaDAO = VendaDAO.getInstance();
    
    public Venda salvar(Cliente c, ArrayList<Produto> p){
        Venda v = new Venda(c,p);
        return vendaDAO.SalvarVenda(v);
    }
    
    public boolean atualizar(int codigo, Cliente c, ArrayList<Produto> p, boolean f, double v){
        Venda venda = new Venda(
                codigo,
                c,
                p,
                f, //finalizada
                v //valor
        );
        return vendaDAO.AtualizarVenda(venda);
    }
    
    public Venda adicionaProduto(int codigo, Produto pAdd) {
        Venda venda = vendaDAO.getVenda(codigo);
        ArrayList<Produto> produtos = venda.getProdutos();
        produtos.add(pAdd);
        venda.setProdutos(produtos);
        return venda;
    }
    
    public ArrayList<String[]> getVendas(){
        ArrayList<Venda> vendas = vendaDAO.getVendas();
        ArrayList<String[]> listaVendas = new ArrayList<>();
        
        for(int i = 0; i < vendas.size(); i++){
            
            listaVendas.add(new String[]{
                String.valueOf(vendas.get(i).getCodigo()),
                String.valueOf(vendas.get(i).getCliente()),
                String.valueOf(vendas.get(i).getProdutos()),
                String.valueOf(vendas.get(i).getValorTotal()),
                String.valueOf(vendas.get(i).isFinalizada()),
                String.valueOf(vendas.get(i).getDataDaCompra()),
                String.valueOf(vendas.get(i).getDataAtualizacao())
            });
            
        }
        
        return listaVendas;
    }
    
    public String[] getVenda(int codigo){
        Venda venda = vendaDAO.getVenda(codigo);
        
        return new String[]{
            String.valueOf(venda.getCodigo()),
            String.valueOf(venda.getCliente()),
            String.valueOf(venda.getProdutos()),
            String.valueOf(venda.getValorTotal()),
            String.valueOf(venda.isFinalizada()),
            String.valueOf(venda.getDataDaCompra()),
            String.valueOf(venda.getDataAtualizacao())
        };
    }
    
}

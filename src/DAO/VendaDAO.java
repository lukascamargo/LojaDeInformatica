/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import model.Venda;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lukas.camargo
 */
public class VendaDAO {
    
    private static VendaDAO mockdb;
    private ArrayList<Venda> listaVendas;
    
    private VendaDAO(){
        listaVendas = new ArrayList<Venda>();
    }
    
    public static synchronized VendaDAO getInstance(){
        if(mockdb == null)
                mockdb = new VendaDAO();
        
        return mockdb;
    }
    
    public Venda SalvarVenda(Venda v){
        int index = listaVendas.size() - 1;
        if(index == -1){
            v.setCodigo(1);
        } else {
            v.setCodigo(listaVendas.get(index).getCodigo() + 1);
        }
        //a intenção do código acima é pegar o código da ultima venda computada e adicionar 1
        //Como não existe a função excluir venda, esse código sempre vai funcionar
        //Ao adicionar função de excluir venda - o que não faz sentido - o código vai parar de funcionar
        
        listaVendas.add(v);
        
        return v;
    }
    
    public ArrayList<Venda> getVendas(){
        return this.listaVendas;
    }
    
    public boolean AtualizarVenda(Venda v){
        for(Venda item: listaVendas){
            
            if(item.getCodigo() == v.getCodigo()){
                item.setCliente(v.getCliente());
                item.setProdutos(v.getProdutos());
                item.setDataAtualizacao(new Date());
                item.setValorTotal(v.getValorTotal());
                item.setFinalizada(v.isFinalizada());
            }
            
        }
        
        return true;
    }
    
    public Venda getVenda(int codigo){
        Venda v = new Venda();
        
        for(Venda item: listaVendas){
            if(item.getCodigo() == codigo){
                v = item;
            }
        }
        
        return v;
        
    }
    
}

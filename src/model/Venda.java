/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Cliente;
import model.Produto;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author lukas.camargo
 */
public class Venda {
    
    private int codigo;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private double valorTotal;
    private boolean finalizada;
    private Date dataDaCompra; 
    private Date dataAtualizacao;

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public boolean isFinalizada() {
        return finalizada;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente pClient){
        this.cliente = pClient;
    }
    
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    
    public void setProdutos(ArrayList<Produto> pProdutos){
        this.produtos = pProdutos;
    }
    
    public Date getDataDaCompra(){
        return dataDaCompra;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public void setValorTotal(double valor){
        this.valorTotal = valor;
    }
       
    public Venda(){}
    
    public Venda(Cliente cliente, ArrayList<Produto> produtos){
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataDaCompra = new Date();
        this.finalizada = false;
        
        for(int i = 0; i < produtos.size(); i++){
            this.valorTotal += produtos.get(i).getValor(); 
        }
    }
    
    public Venda(Cliente cliente, ArrayList<Produto> produtos, boolean finalizada){
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataDaCompra = new Date();
        this.finalizada = finalizada;
        
        for(int i = 0; i < produtos.size(); i++){
            this.valorTotal += produtos.get(i).getValor(); 
        }
    }
    
    public Venda(Cliente cliente, ArrayList<Produto> produtos, boolean finalizada, double valor){
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataDaCompra = new Date();
        this.finalizada = finalizada;
        this.valorTotal = valor;
    }
    
    public Venda(int codigo, Cliente cliente, ArrayList<Produto> produtos, boolean finalizada, double valor){
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataDaCompra = new Date();
        this.finalizada = finalizada;
        this.valorTotal = valor;
    }
    
    
    
    
    
}

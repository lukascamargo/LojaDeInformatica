/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernando.fernandes
 */
public class Produto {
    
    private int IdProduto;
    private String Nome;
    private int Quantidade;
    private double Valor;
    private String Categoria;
    private String Marca;

    public Produto(int IdProduto, String Nome, int Quantidade, double Valor, String Categoria, String Marca) {
        this.IdProduto = IdProduto;
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.Valor = Valor;
        this.Categoria = Categoria;
        this.Marca = Marca;
    }

    public Produto(String Nome, int Quantidade, double Valor, String Categoria, String Marca) {
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.Valor = Valor;
        this.Categoria = Categoria;
        this.Marca = Marca;
    }

    public Produto() {
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public String getNome() {
        return Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public double getValor() {
        return Valor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getMarca() {
        return Marca;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
    
    
}

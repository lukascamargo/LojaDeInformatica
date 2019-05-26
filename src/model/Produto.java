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
    private double valor;
    private String nome;
    
    public double getValor(){
        return valor;
    }
    
    public Produto(){
        
    }
    
    public Produto(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
}

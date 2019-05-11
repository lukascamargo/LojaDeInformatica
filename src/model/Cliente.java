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
public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }
    
     public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(int id, String pNome, String pCPF) {
        this.id = id;
        this.nome = pNome;
        this.cpf = pCPF;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

}

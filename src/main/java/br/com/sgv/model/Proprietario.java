/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sgv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Teletrabalho
 */
@Entity
@Getter
@Setter
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private int rg;
    private String cpf;
    private String enderecoProprietario;
    private String telefone;
    private String contaCorrente;
  //  private Endereco endereço;
    //private List imóveis;
   
//    public Proprietario(String Nome, int RG, int CPF, Endereco endereço, List imóveis) {
//        this.Nome = Nome;
//        this.RG = RG;
//        this.CPF = CPF;
//        this.endereço = endereço;
//        this.imóveis = imóveis;  
//    }
//
//    public Proprietario() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}

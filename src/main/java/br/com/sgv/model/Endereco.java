/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sgv.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Teletrabalho
 */

@Getter
@Setter
public class Endereco {
    private String Logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String Estado;
    private int CEP ;
   
    public Endereco(String Logradouro, int numero, String complemento, String bairro, String Estado,int CEP) {
        this.Logradouro = Logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.Estado = Estado;
        this.CEP = CEP;
    }
}

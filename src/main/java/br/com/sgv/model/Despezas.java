/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sgv.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Teletrabalho
 */

@Getter
@Setter
public class Despezas {

    private float IPTU;
    private float agua;
    private float luz;
    private float taxadeIncendio;
    private float Condomínio;
   
    public Despezas(float IPTU, float agua, float luz, float taxadeIncendio, float Condomínio) {
        this.IPTU = IPTU;
        this.agua = agua;
        this.luz = luz;
        this.taxadeIncendio = taxadeIncendio;
        this.Condomínio = Condomínio;
    }
}

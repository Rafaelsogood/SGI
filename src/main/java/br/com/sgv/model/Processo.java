/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sgv.model;

/**
 *
 * @author Teletrabalho
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 06/05/2021
 * @brief class Item
 */
@Entity
@Getter
@Setter
public class Processo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String numero;
    private String ultimaMovimentacao;
    private String prazo;
}

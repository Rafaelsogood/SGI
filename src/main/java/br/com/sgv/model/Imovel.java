package br.com.sgv.model;

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
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String  endereco;
    private String proprietarioDaCasa;
    private String  iptu;
    private String  inquilino;
    private String  valorDoAluguel;
   
    
    // public Imovel( Long id, String endereço, String proprietério) {
	//this.id = id;
      //  this.endereço = endereço;
	//this.proprietário = proprietério;
	
	
            
   // }

   // public Imovel() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 // }
    
}
    
   



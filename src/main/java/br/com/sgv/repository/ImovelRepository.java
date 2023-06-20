package br.com.sgv.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.sgv.model.Imovel;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface ImovelRepository extends CrudRepository<Imovel,Long>{
    
}

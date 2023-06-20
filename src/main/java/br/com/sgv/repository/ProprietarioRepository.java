package br.com.sgv.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.sgv.model.Proprietario;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface ProprietarioRepository extends CrudRepository<Proprietario,Long>{
    
}

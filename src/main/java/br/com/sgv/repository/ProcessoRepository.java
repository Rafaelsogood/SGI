package br.com.sgv.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.sgv.model.Processo;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface ProcessoRepository extends CrudRepository<Processo,Long>{
    
}

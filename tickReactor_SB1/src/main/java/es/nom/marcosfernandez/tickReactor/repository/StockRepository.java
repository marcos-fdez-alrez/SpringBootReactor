/**
 * 
 */
package es.nom.marcosfernandez.tickReactor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import es.nom.marcosfernandez.tickReactor.model.Stock;

/**
 * @author marcos.fernandez
 *
 */
@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

}

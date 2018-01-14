/**
 * 
 */
package es.nom.marcosfernandez.tickReactor.service;

import org.springframework.beans.factory.annotation.Autowired;

import es.nom.marcosfernandez.tickReactor.model.Stock;
import es.nom.marcosfernandez.tickReactor.repository.StockRepository;

/**
 * @author marcos.fernandez
 *
 */
public interface StockService {
	
	public void processStock(Stock stock) throws InterruptedException;

}

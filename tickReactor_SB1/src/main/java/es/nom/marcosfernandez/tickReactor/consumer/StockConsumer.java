/**
 * 
 */
package es.nom.marcosfernandez.tickReactor.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.nom.marcosfernandez.tickReactor.model.Stock;
import es.nom.marcosfernandez.tickReactor.service.StockService;
import reactor.bus.Event;
import reactor.fn.Consumer;

/**
 * @author marcos.fernandez
 *
 */
@Service
public class StockConsumer implements Consumer<Event<Stock>>{

	@Autowired
	private StockService stockService;
	
	@Override
	public void accept(Event<Stock> stockEvent) {
		Stock stock = stockEvent.getData();
		
		try {
			stockService.processStock(stock);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

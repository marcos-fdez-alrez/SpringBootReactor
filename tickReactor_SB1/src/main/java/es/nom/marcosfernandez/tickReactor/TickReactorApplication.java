package es.nom.marcosfernandez.tickReactor;

import static reactor.bus.selector.Selectors.$;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import es.nom.marcosfernandez.tickReactor.consumer.StockConsumer;
import reactor.bus.EventBus;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="es.nom.marcosfernandez.tickReactor")
@Import({es.nom.marcosfernandez.tickReactor.config.Config.class,es.nom.marcosfernandez.tickReactor.config.MongoConfig.class})
public class TickReactorApplication implements CommandLineRunner {
	
	@Autowired
    private EventBus eventBus;
     
    @Autowired
    private StockConsumer stockConsumer;
     
    @Override
    public void run(String... args) throws Exception {
        eventBus.on($("stockConsumer"), stockConsumer);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TickReactorApplication.class, args);
	}
}

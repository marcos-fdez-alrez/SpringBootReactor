/**
 * 
 */
package es.nom.marcosfernandez.tickReactor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;


/**
 * @author marcos.fernandez
 *
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
	
    @Override
    protected String getDatabaseName() {
        return "test";
    }
  
    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("127.0.0.1", 27017);
    }
  
    @Override
    protected String getMappingBasePackage() {
        return "es.nom.marcosfernandez.tickReactor";
    }
}

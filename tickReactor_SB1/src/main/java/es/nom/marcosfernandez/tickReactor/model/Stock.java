package es.nom.marcosfernandez.tickReactor.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@ToString
@EqualsAndHashCode
public class Stock {
	
	private Long id;
	
	private String name;
	
	private Double previousClose;
	
	private Double Open;
	
	private Double Bid;
	
	private Double Ask;
	
	

}

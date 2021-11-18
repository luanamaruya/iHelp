package br.com.ihelp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Shipment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Dispatcher dispatcher;
	
	@OneToOne
	private Receiver receiver;
	
	private int distance;
	
	private boolean completed;
	
}

package br.com.ihelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ihelp.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {}

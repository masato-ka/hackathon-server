package com.example.domain.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.model.LongDistanceBus;

public interface LondDistanceBusRepository extends JpaRepository<LongDistanceBus, Integer> {

	List<LongDistanceBus> findOneByDepatureAndDestinationAndDepDateOrderByPriceAsc(String depature, 
				String destination, 
				Date date);
	
}

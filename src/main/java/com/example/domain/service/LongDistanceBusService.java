package com.example.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.model.LongDistanceBus;
import com.example.domain.repository.LondDistanceBusRepository;

@Service
public class LongDistanceBusService {

	private final LondDistanceBusRepository longDistanceBusRepository;
	
	public LongDistanceBusService(LondDistanceBusRepository _londDistanceBusRepository){
		longDistanceBusRepository = _londDistanceBusRepository;
	}

	public LongDistanceBus getChapestPrice(String depature, String destination, Date date){
		List<LongDistanceBus> result = longDistanceBusRepository.
				findOneByDepatureAndDestinationAndDepDateOrderByPriceAsc(depature, destination, date);
		if(result.size() <= 0){
			return null;
		}
		return result.get(0);
	}
	
	public List<LongDistanceBus> getAll(){
		return longDistanceBusRepository.findAll();
	}
	
	
}

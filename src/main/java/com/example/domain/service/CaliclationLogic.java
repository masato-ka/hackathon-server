package com.example.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.model.Entry;

@Service
public class CaliclationLogic {

	
	public List<Entry> caliculation(Entry entry){
		List<Entry> entries = new ArrayList<>(); 
		
		entries.add(entry);
		return entries;
		
	}
	
	
}

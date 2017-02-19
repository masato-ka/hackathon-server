package com.example.api;

import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.model.Entry;
import com.example.domain.model.LongDistanceBus;
import com.example.domain.service.CaliclationLogic;
import com.example.domain.service.LongDistanceBusService;


@RestController
@RequestMapping("/api/v1")
public class PriceAPI {

	private final CaliclationLogic caliculationLogic;
	private final LongDistanceBusService longDisntanceBusService;
	
	public PriceAPI(LongDistanceBusService longDistanceBusService, CaliclationLogic caliculationLogic){
		this.longDisntanceBusService = longDistanceBusService;
		this.caliculationLogic = caliculationLogic;
	}
	
	@GetMapping("chepest/{date}/{depart}/{dist}")
	public LongDistanceBus getCheapestPrice(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable Date date, @PathVariable String depart, @PathVariable String dist){
		LongDistanceBus result;
		System.out.println(depart+" "+dist+" "+date.toString());
		result = longDisntanceBusService.getChapestPrice(depart, dist, date);
		return result;
	}
	
	@GetMapping("/longdistancebus")
	public List<LongDistanceBus> getAllBus(){
		return longDisntanceBusService.getAll();
	}
	
	@PostMapping("/result")
	public List<Entry> calculationAPI(@RequestBody Entry entry){
		List<Entry> result = null;
		result = caliculationLogic.caliculation(entry);
		return result;
				
	}
	
	
}

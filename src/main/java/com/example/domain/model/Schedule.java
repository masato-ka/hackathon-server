package com.example.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

//Integer budget
//List<Schedule> schedule

@Data
public class Schedule {
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date date;
	String departure;
	String arrive;
	Integer money;
	String ride;
	
}

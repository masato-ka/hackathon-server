package com.example.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Table(name="long_distance_bus")
@Data
public class LongDistanceBus {
	@Id
	@GeneratedValue
	Integer id;
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date depDate;
	String depature;
	String destination;
	Integer price;
	
}

package com.wittybrains.busbookingsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wittybrains.busbookingsystem.model.Bus;
@JsonInclude(value = Include.NON_NULL)
public class BusDTO {
	private String number;
   
    private String timing;
    private Integer numberOfSeats;
    private Integer price;
    private Long id;
    private List<SeatDTO> seats;
	public BusDTO(Bus busDTO) {
		super();
		this.number = busDTO.getNumber();
		
		this.numberOfSeats = busDTO.getNumberOfSeats();
		this.seats=new ArrayList<>();
		if(!busDTO.getSeats().isEmpty()) {
			busDTO.getSeats().forEach(seat ->this.seats.add(new SeatDTO(seat)) );
		}
	}
	
	public BusDTO() {
		super();
	}

	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public List<SeatDTO> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatDTO> seats) {
		this.seats = seats;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}

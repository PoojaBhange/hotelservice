package com.lcwd.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.service.HotelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping()
	public ResponseEntity<Hotel> postMethodName(@RequestBody Hotel hotel) {
		Hotel h1 = hotelService.createHotel(hotel);
		return new ResponseEntity<>(h1,HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<List<Hotel>> getAllHotel() {
		List<Hotel> h2 = hotelService.getAllHotel();
		return new ResponseEntity<>(h2,HttpStatus.OK);
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
		Hotel h3 = hotelService.getHotelById(hotelId);
		return new ResponseEntity<>(h3,HttpStatus.OK);
	}
	
}

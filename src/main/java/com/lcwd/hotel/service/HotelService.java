package com.lcwd.hotel.service;

import java.util.List;

import com.lcwd.hotel.entity.Hotel;

public interface HotelService {

//	create hotel
	Hotel createHotel(Hotel hotel);
//	get all hotel
	List<Hotel> getAllHotel();
	
//	get single hotel
	Hotel getHotelById(String hotelId);
//	update
//	delete
	
}

package com.example.A00444846_springApi.accessingData;

import org.springframework.data.repository.CrudRepository;
import com.example.A00444846_springApi.Entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {
}

package com.example.A00444846_springApi.Controller;

import com.example.A00444846_springApi.Entity.Hotel;
import com.example.A00444846_springApi.accessingData.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HotelController {

    // for index page
    @RequestMapping("/")
    public String index(){
        return "<h1>welcome to hotel management system</h1>";
    }

    @Autowired
    private HotelRepository hotelRepository;

    // for getting list of all hotel
    @GetMapping("/getHotelList")
    public Iterable<Hotel> getHotelList(){
        return hotelRepository.findAll();
    }

    // for add hotel
    @RequestMapping(value = "/addNewHotel", method = RequestMethod.POST, consumes = "application/json")
    public String addNewHotel(@RequestBody Hotel hotelPojo){
        try {
            if(hotelPojo.getHotelName() == null || hotelPojo.getHotelName().trim().length() == 0) {
                throw new Exception("hotelName parameter can not be null or blank");
            }
            if(hotelPojo.getPrice() == null) {
                throw new Exception("Parameter: price is mandatory");
            }
            hotelRepository.save(hotelPojo);
            return "Saved successfully";
        }catch (Exception e){
            return "Error:: "+ e.getMessage();
        }
    }
}

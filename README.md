# A00444846_springApi

For Changing Database you have to do changes in `application.properties`

You have to create blank database with name 'hoteldb'

SQL query: `create database hoteldb;`


#### GET API: http://localhost:8080/getHotelList


Response:
``` 
[
    {
        "id": 1,
        "hotelName": "Pratik",
        "price": 250.0
    },
    {
        "id": 2,
        "hotelName": "Hotel Halifax",
        "price": 200.0
    }
] 
```



#### POST API: http://localhost:8080/addNewHotel

Body:
``` 
{
    "hotelName": "pratik",
    "price" : 250
}
```

Response: 
```
Saved successfully
```

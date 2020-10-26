package com.ft.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ft.core.response.bean.FoodTruck;
import com.ft.core.service.FoodTruckService;

@RestController
@RequestMapping("/ft")
@CrossOrigin(origins = "*")
public class FoodTruckController {
    
	@Autowired
    private FoodTruckService foodTruckService;
	
	@ResponseBody
	@GetMapping("/fetch-all")
    public FoodTruck[] fetch() {
        FoodTruck[] foodTruckData = foodTruckService.getFoodTruckData();
        return foodTruckData;
    }
	
	@ResponseBody
	@GetMapping("/search-all")
    public FoodTruck[] searchFoodItem(@RequestParam(required = false) String fooditems) {
        FoodTruck[] foodTruckData = foodTruckService.searchFoodItem(fooditems);
        return foodTruckData;
    }
	
	@ResponseBody
	@GetMapping("/fetch")
	public FoodTruck[] getFetchFoodItemValue(@RequestParam(required = false) String fooditems){
        FoodTruck[] foodTruckData = foodTruckService.getFetchFoodItemValue(fooditems);
        return foodTruckData;
    }
		  
}

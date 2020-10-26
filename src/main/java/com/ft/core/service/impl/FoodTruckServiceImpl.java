package com.ft.core.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ft.core.response.bean.FoodTruck;
import com.ft.core.service.FoodTruckService;
import com.ft.core.util.Constants;
import com.ft.core.util.GenericRestClient;


@Service
public class FoodTruckServiceImpl implements FoodTruckService{

	@Override
	public FoodTruck[] getFoodTruckData() {
		 String dataDictionary = Constants.DATA_DICTIONARY;
		 ResponseEntity<FoodTruck[]> postHttpEntity = new GenericRestClient<String, FoodTruck[]>().getHttpEntity(dataDictionary, null, FoodTruck[].class);
		 return postHttpEntity.getBody();
	}

	// https://data.sfgov.org/resource/rqzj-sfat.json?fooditems=7 Multiple Trucks on rotation (1 on Mission Bay Blvd South %26 6 on 4th St). Serving everything but hot dogs
	// https://data.cityofchicago.org/resource/tt4n-kn4t.json?$where=job_titles like '%25CHIEF%25'
	
	//https://data.sfgov.org/resource/rqzj-sfat.json?$q= 7 Multiple Trucks;
	@Override
	public FoodTruck[] getFetchFoodItemValue(String fooditem) {
		
		 String dataDictionary = Constants.DATA_DICTIONARY+"?fooditems="+fooditem;
		 ResponseEntity<FoodTruck[]> postHttpEntity = new GenericRestClient<String, FoodTruck[]>().getHttpEntity(dataDictionary, null, FoodTruck[].class);
		 return postHttpEntity.getBody();
	}

	@Override
	public FoodTruck[] searchFoodItem(String fooditem) {
		 String dataDictionary = Constants.DATA_DICTIONARY+"?$q="+fooditem;
		 ResponseEntity<FoodTruck[]> postHttpEntity = new GenericRestClient<String, FoodTruck[]>().getHttpEntity(dataDictionary, null, FoodTruck[].class);
		 return postHttpEntity.getBody();
	}
	
}

package com.ft.core.service;

import com.ft.core.response.bean.FoodTruck;

public interface FoodTruckService {
	public FoodTruck[] getFoodTruckData();

	public FoodTruck[] getFetchFoodItemValue(String fooditems);

	public FoodTruck[] searchFoodItem(String fooditem);
}

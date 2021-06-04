package com.controller;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HouseBoatBean;
import com.service.HouseBoatService;
//36583
//use appropriate annotation to configure RoomController as Controller
@Controller
public class HouseBoatController {
	@Autowired
	private HouseBoatService houseBoatService;
	
	@RequestMapping(value="/showPage",method=RequestMethod.GET)
	public String showPage(@ModelAttribute("houseBoat") HouseBoatBean houseBoatBean) {
		return "showpage";
	}
	//invoke the service class - calculateTotalCost method.
	@RequestMapping(value="/billDesk",method=RequestMethod.POST)
	public String calculateTotalCost(@Valid @ModelAttribute("houseBoat") HouseBoatBean houseBoatBean,
			BindingResult result, ModelMap map) {
		if(result.hasErrors()) {
			return "showpage";
		}
		else {
			double cost = houseBoatService.calculateTotalCost(houseBoatBean);
			map.put("TotalCost", cost);
			return "billdesk";
		}
	}
	@ModelAttribute(name="houseBoatList")
	public Map<String,String> buildState(){
		LinkedHashMap<String,String>houseBoatList = new LinkedHashMap<>();
		houseBoatList.put("1BHB","1BHB");
		houseBoatList.put("2BHB", "2BHB");
		houseBoatList.put("3BHB", "3BHB");
		houseBoatList.put("4BHB", "4BHB");
		houseBoatList.put("6BHB", "6BHB");
		return houseBoatList;
	}
}

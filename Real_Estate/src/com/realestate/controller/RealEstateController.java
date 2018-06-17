package com.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RealEstateController {
	@RequestMapping("/")
	public String showHome() {
		return"index";
	}
	@RequestMapping("/Buy")
	public String showBuy() {
		return"buy";
	}
	@RequestMapping("/Sell")
	public String showSell() {
		return"sell";
	}
	@RequestMapping("/Rent")
	public String showRent() {
		return"rent";
	}
	@RequestMapping("/About")
	public String showAbout() {
		return"generic";
	}
	@RequestMapping("/Elements")
	public String showElements() {
		return"elements";
	}
	@RequestMapping("/Login")
	public String showLogin() {
		return"login";
	}
}

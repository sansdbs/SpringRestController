package com.san.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CityValidator implements ConstraintValidator<IsValidCity, String> {

	private String listOfCity;

	@Override
	public void initialize(IsValidCity isValidCity) {

		this.listOfCity = isValidCity.listOfCities();

	}

	@Override
	public boolean isValid(String empCity, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub

		if (empCity == null) {
			return false;
		}
		if (empCity.matches("listOfCity")) {
			return true;
		} else {
			return false;
		}
	}

}

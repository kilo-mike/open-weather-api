package com.sparta.eng82.openweatherapi.framework.interfaces.dto;

import com.sparta.eng82.openweatherapi.framework.interfaces.DTOChecker;
import com.sparta.eng82.openweatherapi.framework.interfaces.StatusCodeResponse;

import java.util.ArrayList;

public interface MultipleCityDTO extends DTOChecker, StatusCodeResponse {

    ArrayList<CityDTO> getCities();

    Integer getCount();

    String getMessage();

    boolean numberOfCitiesEqualsCount();

    boolean listOfCityContainsNullValue();
}

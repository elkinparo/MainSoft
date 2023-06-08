package com.milescarrental.models;

public class RentCars
{
    private final String AIRPORT,NAME,PHONE,EMAIL;

    public RentCars(String AIRPORT, String NAME, String PHONE, String EMAIL) {
        this.AIRPORT = AIRPORT;
        this.NAME = NAME;
        this.PHONE = PHONE;
        this.EMAIL = EMAIL;
    }

    public String getAIRPORT() {
        return AIRPORT;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }
}

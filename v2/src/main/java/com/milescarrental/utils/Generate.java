package com.milescarrental.utils;

import com.github.javafaker.Faker;
import com.milescarrental.models.RentCars;

public class Generate
{
    private static final Faker FAKER = new Faker();

    public static RentCars dates()
    {
        return new RentCars(FAKER.bothify("Aeropuerto de Florida Keys Marathon"),
                FAKER.name().fullName().replace(".",""),
                FAKER.bothify("##########"),
                FAKER.letterify("???????@gmail.com")
        );
    }
}

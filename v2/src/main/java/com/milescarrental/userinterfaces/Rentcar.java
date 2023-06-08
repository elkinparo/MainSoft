package com.milescarrental.userinterfaces;

import com.ibm.icu.util.Calendar;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Rentcar {
    public static Calendar fecha = Calendar.getInstance();
    public static int dia = fecha.get(Calendar.DAY_OF_MONTH);
    public static int dia2 = dia + 6;


    public static final Target SEARCH_AIRPORT = Target.the("SEARCH_AIRPORT").located(By.xpath("//label[@class='inp-text " +
            "inp-text--secondary inp-text--border-none']//following::input"));
    public static final Target AIRPORT = Target.the("AIRPORT").located(By.xpath("//input[@value='Aeropuerto " +
            "Internacional de Miami']"));
    public static final Target SELECT_AIRPORT = Target.the("SELECT_AIRPORT").located(By.xpath("//span[text()='Aeropuerto" +
            " de Florida Keys Marathon, Marathon, Florida, Estados Unidos']"));
    public static final Target FIRST_MONTH = Target.the("FIRST_MONTH").located(By.xpath("//label[@class='form-qs__pickup" +
            "-date inp-text inp-text--secondary pickers inp-text--hour']"));
    public static final Target NEXT_MONTH = Target.the("NEXT_MONTH").located(By.xpath("//div[@class='month-item']" +
            "//button[@class='button-next-month']"));

    public static final Target TODAY_NEXT_MONTH = Target.the("TODAY_NEXT_MONTH").located(By.xpath("//div[@class='day-" +
            "item'][" +dia+"]"));
    public static final Target TODAY_NEXT_WEEK = Target.the("TODAY_NEXT_WEEK").located(By.xpath("//div[@class='day-item" +
            "']["+dia2+"]"));
    public static final Target SEARCH = Target.the("SEARCH").located(By.xpath("//div[@class='form-qs__button']//" +
            "following::a"));
    public static final Target SELECT_CAR = Target.the("SELECT_CAR").located(By.xpath("//div[@id='car_1']//button[" +
            "@class='button button-xxl-L | d-none d-lg-grid']"));
    public static final Target NAME = Target.the("NAME").located(By.xpath("//input[@id='inpName']"));
    public static final Target PHONE = Target.the("PHONE").located(By.xpath("//input[@id='phoneCustom']"));
    public static final Target EMAIL = Target.the("EMAIL").located(By.xpath("//input[@id='inpEmail']"));
    public static final Target MESAGE = Target.the("MESAGE").located(By.xpath("//h4[@class='car-item__subtitle | " +
            "heading-category__subtitle heading-category__subtitle--fadeout']//span[@class='heading-category__subtitle" +
            "__name']"));
    public static final Target NEXT= Target.the("NEXT").located(By.xpath("//div[@class='tray-payment__button']"));
    public static final Target UPGRADE= Target.the("UPGRADE").located(By.xpath("//span[@class='switch__slider switch__" +
            "slider--pqr switch__slider--round']"));
    public static final Target IMAGE= Target.the("IMAGE").located(By.xpath("//i[@class='card-item__icon | icon-circle-" +
            "check | text-success | ds-mr-NONE']"));

}

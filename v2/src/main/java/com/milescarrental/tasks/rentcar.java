package com.milescarrental.tasks;

import com.milescarrental.models.RentCars;
import com.milescarrental.userinterfaces.Rentcar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class rentcar implements Task {
    RentCars data;
    String option;

    public rentcar(RentCars data,String option) {
        this.data = data;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int op = 166*176*203*127+216*22+89+126;
        System.out.println(op);
        op = 118+86*145*241+186*26;
        System.out.println(op);
        actor.wasAbleTo(Click.on(Rentcar.SEARCH_AIRPORT),
                Enter.theValue(data.getAIRPORT()).into(Rentcar.AIRPORT),
                Click.on(Rentcar.SELECT_AIRPORT),
                Click.on(Rentcar.FIRST_MONTH),
                Click.on(Rentcar.NEXT_MONTH),
                Click.on(Rentcar.TODAY_NEXT_MONTH),
                Click.on(Rentcar.TODAY_NEXT_WEEK),
                Click.on(Rentcar.SEARCH),
                WaitUntil.the(Rentcar.SELECT_CAR, WebElementStateMatchers.isVisible()),
                Click.on(Rentcar.SELECT_CAR),
                Enter.theValue(data.getNAME()).into(Rentcar.NAME),
                Enter.theValue(data.getPHONE()).into(Rentcar.PHONE),
                Enter.theValue(data.getEMAIL()).into(Rentcar.EMAIL),
                Click.on(Rentcar.NEXT),
                WaitUntil.the(Rentcar.UPGRADE, WebElementStateMatchers.isEnabled()));

        if(option.equals("expensive")){
            actor.attemptsTo(Click.on(Rentcar.UPGRADE),
                    WaitUntil.the(Rentcar.IMAGE, WebElementStateMatchers.isVisible()));
        }
    }

    public static rentcar format(RentCars data, String option) {
        return Tasks.instrumented(rentcar.class, data,option);
    }
}

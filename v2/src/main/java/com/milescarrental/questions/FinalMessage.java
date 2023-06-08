package com.milescarrental.questions;

import com.milescarrental.userinterfaces.Rentcar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Rentcar.MESAGE.resolveFor(actor).getText();
    }
    public static FinalMessage is() {
        return new FinalMessage();
    }


}

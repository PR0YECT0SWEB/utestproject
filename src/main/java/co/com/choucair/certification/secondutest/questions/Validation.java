package co.com.choucair.certification.secondutest.questions;

import co.com.choucair.certification.secondutest.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validation implements Question<Boolean> {

    private String strValidation;

    public Validation(String strValidation) {
        this.strValidation = strValidation;
    }

    public static Validation toThe(String strValidation) {
        return new Validation(strValidation);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameValidation = Text.of(UtestJoinPage.COMPLETE_SETUP).viewedBy(actor).asString();

        if (strValidation.equals(nameValidation)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

package co.com.choucair.certification.secondutest.tasks;

import co.com.choucair.certification.secondutest.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task {


    private String strName;
    private String strLastName;
    private String strMail;
    private String strPassword;

    public Join(String strName, String strLastName, String strMail, String strPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strMail = strMail;
        this.strPassword = strPassword;
    }


    public static Join onThePage(String strName, String strLastName, String strMail, String strPassword) {
        return Tasks.instrumented(Join.class,strName,strLastName,strMail,strPassword);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.JOIN_BUTTON),
                Enter.theValue(strName).into(UtestJoinPage.USER_NAME),
                Enter.theValue(strLastName).into(UtestJoinPage.LAST_NAME),
                Enter.theValue(strMail).into(UtestJoinPage.MAIL),
                Click.on(UtestJoinPage.MONTH),
                Click.on(UtestJoinPage.DAY),
                Click.on(UtestJoinPage.YEAR),
                Click.on(UtestJoinPage.NEXT_LOCATION),
                Click.on(UtestJoinPage.NEXT_DEVICE),
                Click.on(UtestJoinPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(UtestJoinPage.PASSWORD),
                Enter.theValue(strPassword).into(UtestJoinPage.CONFIRM_PASSWORD),
                Click.on(UtestJoinPage.CHECK_ONE),
                Click.on(UtestJoinPage.CHECK_TWO));
    }
}

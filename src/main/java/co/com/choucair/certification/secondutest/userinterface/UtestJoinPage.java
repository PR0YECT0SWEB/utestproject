package co.com.choucair.certification.secondutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UtestJoinPage {

    public static final Target JOIN_BUTTON = Target.the("join button")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target USER_NAME = Target.the("user name")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"firstName\"]"));
    public static final Target LAST_NAME = Target.the("last name")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"lastName\"]"));
    public static final Target MAIL = Target.the("mail")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"email\"]"));
    public static final Target MONTH = Target.the("month")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"birthMonth\"]/option[3]"));
    public static final Target DAY = Target.the("day")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"birthDay\"]/option[8]"));
    public static final Target YEAR = Target.the("year")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"birthYear\"]/option[11]"));
    public static final Target NEXT_LOCATION = Target.the("next location")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target NEXT_DEVICE = Target.the("next device")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target NEXT_LAST_STEP = Target.the("next last step")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
    public static final Target PASSWORD = Target.the("password")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"password\"]"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target CHECK_ONE = Target.the("check one")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_TWO = Target.the("check two")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("check two")
            .located(net.serenitybdd.core.annotations.findby.By
                    .xpath("//span[contains(text(), 'Complete Setup')]"));
}

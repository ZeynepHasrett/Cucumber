package stepdefinitions;

import io.cucumber.java.en.*;
import pages.DemoqaPage;

public class DemoqaStepdefinitions {

    DemoqaPage demoqaPage = new DemoqaPage();

    @Then("soldaki sekmelerden Alerts'e tiklar")
    public void soldaki_sekmelerden_alerts_e_tiklar() {
        demoqaPage.alertsSekmesi.click();
    }

    @When("On button click, alert will appear after {int} seconds karsisindaki click me butonuna basar")
    public void on_button_click_alert_will_appear_after_seconds_karsisindaki_click_me_butonuna_basar(Integer int1) {
        demoqaPage.timerAlertButton.click();
    }

}

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.HairDryerPage;
import pages.PageBase;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected PageBase pageBase = new PageBase(driver);
    protected HairDryerPage hairDryerPage = new HairDryerPage(driver);
    @AfterEach
    public void close(){
        driver.quit();
    }
}


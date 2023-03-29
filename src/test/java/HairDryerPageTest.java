import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HairDryerPage;

public class HairDryerPageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(HairDryerPage.class);

    @Test
    public void testChooseOneHairDryer() {
        logger.info("Test 'testChooseOneHairDryer' is started.");
        hairDryerPage.open();
        hairDryerPage.scrollPage();
        hairDryerPage.chooseOneHairDryer();
        Assertions.assertTrue(hairDryerPage.ifSelectedOneHairDryer());
        Assertions.assertTrue(hairDryerPage.isProductsDisplayed());
        logger.info("Test 'testChooseOneHairDryer' is finished.");


    }

    @Test
    public void testChooseHairDryers() {
        logger.info("Test 'testChooseHairDryers' is started.");
        hairDryerPage.open();
        hairDryerPage.scrollPage();
        hairDryerPage.chooseHairDryers();
        Assertions.assertTrue(hairDryerPage.ifSelectedThreeHairDryers());
        Assertions.assertTrue(hairDryerPage.isProductsDisplayed());
        logger.info("Test 'testChooseHairDryers' is finished.");


    }

}


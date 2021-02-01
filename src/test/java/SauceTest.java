import com.saucelabs.saucebindings.SauceSession;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SauceTest {
    @Test
    public void startsBrowser() {
        WebDriver driver = new SauceSession().start();
        Assert.assertNotNull(driver);
    }
}

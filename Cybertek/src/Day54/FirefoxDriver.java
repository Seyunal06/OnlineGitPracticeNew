package Day54;

public class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("opening Firefox browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("navigating to "+url+" using Firefox browser");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Firefox browser");
    }
}

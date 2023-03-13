package Day54;

public class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("navigating to "+url+" using chrome browser");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}

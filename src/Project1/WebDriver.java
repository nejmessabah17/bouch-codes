package Project1;

import java.util.Arrays;

public interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface RemoteWebDriver {
    void navigate();
}

interface TakeScreenShot {
    void getScreenShot();

}

class ChromeDriver implements WebDriver, RemoteWebDriver, TakeScreenShot {


    @Override
    public void navigate() {
        System.out.println("navigate to google home page");
    }

    @Override
    public void getScreenShot() {
        System.out.println("get google home page screen shot");
    }

    @Override
    public void open() {
        System.out.println("open google search page");
    }

    @Override
    public void close() {
        System.out.println("close google search page");
    }

    @Override
    public String getTitle() {
        System.out.println("get the HTML page");
        return null;
    }
}
    class FireFoxDriver implements WebDriver, RemoteWebDriver, TakeScreenShot {
        @Override
        public void navigate() {
            System.out.println("navigate to FireFox home page");
        }

        @Override
        public void getScreenShot() {
            System.out.println("get FireFox home page screen shot");
        }

        @Override
        public void open() {
            System.out.println("open FireFox search page");
        }

        @Override
        public void close() {
            System.out.println("close FireFox search page");
        }

        @Override
        public String getTitle() {
            System.out.println("get the HTML page");
            return null;
        }
    }

    class SafariDriver implements WebDriver, RemoteWebDriver, TakeScreenShot {
        @Override
        public void navigate() {
            System.out.println("navigate to Safari home page Safari");

        }

        @Override
        public void getScreenShot() {
            System.out.println("get Safari home page screen shot");

        }

        @Override
        public void open() {
            System.out.println("open Safari home page");


        }

        @Override
        public void close() {
            System.out.println("close Safari search page");

        }

        @Override
        public String getTitle() {
            System.out.println("get the HTML page");
            return null;
        }


    }

    class Test {
        public static void main(String[] args) {

            WebDriver[] webDrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for (WebDriver webDriver : webDrivers) {
                webDriver.open();
                webDriver.close();
                webDriver.getTitle();
            }
            RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for (RemoteWebDriver remoteWebDriver : remoteWebDrivers) {
                remoteWebDriver.navigate();
            }
            TakeScreenShot[] takeScreenShots = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for (TakeScreenShot takeScreenShot : takeScreenShots) {
                takeScreenShot.getScreenShot();
            }


        }

    }

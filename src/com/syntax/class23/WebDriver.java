package com.syntax.class23;

public class WebDriver {
    public void startBrowser () {
        System.out.println("Starting the browser");
    }

    public void openUrl(String url) {
        System.out.println("opening "+url);
    }

    public  void testLoginPage() {
        System.out.println("checking if login page is vosoblr ");
    }

    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}

class Chrome extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening "+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing google chrome");
    }
}

class FireFox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting FireFox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening "+url+" on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing FireFox");
    }
}

class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening "+url+" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari");
    }
}

class Adge extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Adge");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening "+url+" on Adge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page on Adge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Adge");
    }
}

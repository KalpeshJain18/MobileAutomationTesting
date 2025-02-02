package Testing;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTesting {

	public void AppiumTest() throws MalformedURLException, URISyntaxException {

		// code to start server
		// AndroidDriver, IosDriver
		// Appium code -> Appium server -> Mobile

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("kalpeshemulator");
		options.setApp(
				"//Users//kapi//eclipse-workspace//AppiumTesting//src//test//java//Testingresourse//API Demos for Android_1.9.0_APKPure.apk");

		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
		//Actual code
	}

}

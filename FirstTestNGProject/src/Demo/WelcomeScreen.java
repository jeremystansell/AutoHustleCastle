package Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class WelcomeScreen {
	MobileElement imgLogo;
	MobileElement btnSignIn;
	MobileElement btnRegister;
	MobileElement lbSignInTitle;
	MobileElement btnBackSignIn;
	MobileElement lbRegisterTitle;
	MobileElement btnBackRegister;

	private Screen screen = new Screen();

	// The annotated method will be run before any test method belonging to the
	// classes inside the <test> tag is run.
	@BeforeTest
	public void setUpBeforeTest() throws Exception {
		// launch app
		screen.launchApp();
	}

	// The annotated method will be run after all the test methods belonging to the
	// classes inside the tag have run.
	@AfterTest
	public void setUpAfterTest() throws Exception {
		// quit app
		screen.quitApp();
	}

	// The annotated method will be run before each test method.
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception {
		// sign in if necessary

	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() throws Exception {
		// log out if necessary
	}

	// verify UI
	@Test(priority = 1)
	public void autoArenaByFood() throws Exception {
		// tap on Map
		screen.tapOnScreen(118, 962);
		screen.waitToDo(1);
		// tap on Arena
		screen.tapOnScreen(854, 912);
		screen.waitToDo(1);
		// tap on for food
		screen.tapOnScreen(452, 294);
		screen.waitToDo(1);
		// tap on Participate
		screen.tapOnScreen(633, 932);
		screen.waitToDo(1);
		// tap on Confirm
		screen.tapOnScreen(786, 930);
		screen.waitToDo(90);

		// tap on Round 1
		screen.tapOnScreen(1700, 980);
		screen.waitToDo(2);
		// tap on To battle
		screen.tapOnScreen(1405, 907);
		screen.waitToDo(5);
		// tap on Speed x2
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		// tap on Victory Home
		screen.tapOnScreen(964, 998);
		screen.waitToDo(60);

		// tap on Round 2
		screen.tapOnScreen(1350, 980);
		screen.waitToDo(60);
		// tap on To battle
		screen.tapOnScreen(1405, 907);
		screen.waitToDo(60);
		// tap on Speed x2
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		// tap on Victory Home
		screen.tapOnScreen(964, 998);
		screen.waitToDo(60);

		// tap on Round 3
		screen.tapOnScreen(950, 980);
		screen.waitToDo(60);
		// tap on To battle
		screen.tapOnScreen(1405, 907);
		screen.waitToDo(60);
		// tap on Speed x2
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		// tap on Victory Home
		screen.tapOnScreen(964, 998);
		screen.waitToDo(60);

		// tap on Round 4
		screen.tapOnScreen(600, 980);
		screen.waitToDo(60);
		// tap on To battle
		screen.tapOnScreen(1405, 907);
		screen.waitToDo(60);
		// tap on Speed x2
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		// tap on Victory Home
		screen.tapOnScreen(964, 998);
		screen.waitToDo(60);

		// tap on Round 5
		screen.tapOnScreen(250, 980);
		screen.waitToDo(60);
		// tap on To battle
		screen.tapOnScreen(1405, 907);
		screen.waitToDo(60);
		// tap on Speed x2
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		screen.tapOnScreen(1780, 982);
		screen.waitToDo(1);
		// tap on Victory Home
		screen.tapOnScreen(964, 998);
		screen.waitToDo(60);
		
		// tap on HOME - CLAIM reward
				screen.tapOnScreen(1750, 200);
				screen.waitToDo(60);
	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
		}

		public void tapOnScreen(int x, int y) throws Exception {
			ApplicationHelper.tapOnLocation(x, y);
		}

		public void waitToDo(int x) throws Exception {
			ApplicationHelper.WaitToDo(x);
		}
	}
}

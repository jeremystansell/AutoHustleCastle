package Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WelcomeScreen {
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
		screen.tapOnMap();
		screen.tapOnArena();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() throws Exception {
		// log out if necessary
	}

	// auto battle Arena
	@Test(invocationCount=10)	
	public void autoArenaByFood() throws Exception {
		// participate Arena
		screen.tapOnForFood();
		screen.tapOnParticipate();
		screen.tapOnConfirmParticipate();

		// battle Round 1
		screen.battleRank14();
		// battle Round 2
		screen.battleRank7();
		// battle Round 3
		screen.battleRank4();
		// battle Round 4
		screen.battleRank2();
		// battle Round 5
		screen.battleRank15();

		// claim Reward
		screen.tapOnClaimReward();
		//a
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

		// battle Rank 11 (220,970)
		public void battleRank11() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(220, 970);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 12 (580,970) - Rank 13 (940,970) - Rank 14 (1300,970) - Rank 15
		// (1660,970)
		public void battleRank12() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(580, 970);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 13 (940,970) - Rank 14 (1300,970) - Rank 15 (1660,970)
		public void battleRank13() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(940, 970);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 14 (1300,970) - Rank 15 (1660,970)
		public void battleRank14() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(1300, 970);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 15 (1660,970)
		public void battleRank15() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(1660, 970);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 7 (410,760)
		public void battleRank7() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(410, 760);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 8 (770,760) - Rank 9 (1130,760) - Rank 10 (1490,760)
		public void battleRank8() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(770, 760);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 9 (1130,760) - Rank 10 (1490,760)
		public void battleRank9() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(1130, 760);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 10 (1490,760)
		public void battleRank10() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(1490, 760);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 4 (600,550)
		public void battleRank4() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(600, 550);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 5 (960,550) - Rank 6 (1320,550)
		public void battleRank5() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(960, 550);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 6 (1320,550)
		public void battleRank6() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(1320, 550);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 1 (980,130)
		public void battleRank1() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(980, 130);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 2 (790,340)
		public void battleRank2() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(790, 340);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// battle Rank 3 (1150,340)
		public void battleRank3() throws Exception {
			// choose enemy
			ApplicationHelper.tapOnLocation(1150, 340);
			ApplicationHelper.WaitToDo(2);
			// to battle
			ApplicationHelper.tapOnLocation(1400, 910);
			ApplicationHelper.WaitToDo(5);
			// speed x2
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(1);
			ApplicationHelper.tapOnLocation(1780, 970);
			ApplicationHelper.WaitToDo(15);
			// back to Battle result
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// tap on MAP - HOME button Map (120,960)
		public void tapOnMap() throws Exception {
			ApplicationHelper.tapOnLocation(120, 960);
			ApplicationHelper.WaitToDo(1);
		}

		// tap on ARENA button Arena (860,900)
		public void tapOnArena() throws Exception {
			ApplicationHelper.tapOnLocation(860, 900);
			ApplicationHelper.WaitToDo(1);
		}

		// tap on FOR FOOD button ForFood (450,290)
		public void tapOnForFood() throws Exception {
			ApplicationHelper.tapOnLocation(450, 290);
			ApplicationHelper.WaitToDo(2);
		}

		// tap on FOR TICKETS button ForTicket (800,290)
		public void tapOnForTickets() throws Exception {
			ApplicationHelper.tapOnLocation(800, 290);
			ApplicationHelper.WaitToDo(2);
		}

		// tap on PARTICIPATE button Participate (620,930)
		public void tapOnParticipate() throws Exception {
			ApplicationHelper.tapOnLocation(620, 930);
			ApplicationHelper.WaitToDo(1);
		}

		// tap on CONFIRM ARENA button ConfirmArena (790,930)
		public void tapOnConfirmParticipate() throws Exception {
			ApplicationHelper.tapOnLocation(790, 930);
			ApplicationHelper.WaitToDo(60);
		}

		// tap on VICTORY HOME button VitoryHome (960,990)
		public void tapOnVictoryHome() throws Exception {
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(5);
		}

		// tap on CLAIM REWARD button ClaimReward (960,990)
		public void tapOnClaimReward() throws Exception {
			ApplicationHelper.tapOnLocation(960, 990);
			ApplicationHelper.WaitToDo(2);
		}
	}

	/*
	 * Location of participants Rank 1 (980,130) Rank 2 (790,340) - Rank 3
	 * (1150,340) Rank 4 (600,550) - Rank 5 (960,550) - Rank 6 (1320,550) Rank 7
	 * (410,760) - Rank 8 (770,760) - Rank 9 (1130,760) - Rank 10 (1490,760) Rank 11
	 * (220,970) - Rank 12 (580,970) - Rank 13 (940,970) - Rank 14 (1300,970) - Rank
	 * 15 (1660,970)
	 * 
	 * Location of MAP - HOME button Map (120,960)
	 * 
	 * Location of ARENA button Arena (860,900)
	 * 
	 * Location of FOR FOOD button ForFood (450,290)
	 * 
	 * Location of FOR TICKETS button ForTicket (800,290)
	 * 
	 * Location of PARTICIPATE button Participate (620,930)
	 * 
	 * Location of CONFIRM ARENA button ConfirmArena (790,930)
	 * 
	 * Location of TO BATTLE button ToBattle (1400,910)
	 * 
	 * Location of SPEED X2 button Speed (1780,970)
	 * 
	 * Location of VICTORY HOME button VitoryHome (960,990)
	 * 
	 * Location of CLAIM REWARD button ClaimReward (960,990)
	 */

	private Screen screen = new Screen();
}

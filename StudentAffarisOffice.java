import java.util.ArrayList;

public class StudentAffarisOffice {
	

	//// Stores all clubs registered under SAO
	private ArrayList<Club> clubs = new ArrayList<>();

	// Add a new club
	public void addClub(Club club) {
		clubs.add(club);
	}

	// Search and return a club by name
	public Club getClub(String clubName) {
		for (Club c : clubs) {
			if (c.getName().equalsIgnoreCase(clubName)) {
				return c;
			}
		}
		return null;
	}

	// Display all clubs and their events
	public void showDashboard() {
		System.out.println("\n===== SAO Dashboard =====");
		for (Club c : clubs) {
			System.out.println("Club: " + c.getName());
			c.viewEvents();
			System.out.println("------------------------");
		}
	}

	// Approve an event of a club
	public void approveEvent(Club club, String eventName) {
		club.approveEvent(eventName);
	}

	// Reject an event of a club
	public void rejectEvent(Club club, String eventName) {
		club.rejectEvent(eventName);
	}
}

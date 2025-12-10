import java.util.ArrayList;

public class Club {

	private String name;
	// Stores members of the club
	private ArrayList<MemberRole> members = new ArrayList<>();
	// Stores declared events of the club
	private ArrayList<Event> events = new ArrayList<>();

	// method overloading
	public Club() {

	}

	public Club(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Add a member to the club
	public void addMember(MemberRole m) {
		members.add(m);
	}

	// Method overloading
	public void addMember(String name, String role) {

		MemberRole newMember = new MemberRole(name, role);

		this.addMember(newMember);
	}

	// Remove a member by matching their name
	public void removeMember(String name) {
		members.removeIf(m -> m.getName().equalsIgnoreCase(name));
	}

	// Show all members in the club
	public void viewMembers() {
		if (members.isEmpty()) {
			System.out.println("No members yet.");
			return;
		}
		for (MemberRole m : members) {
			System.out.println(m);
		}
	}

	// Declare a new event (initially pending approval)
	public void declareEvent(String name, String date, String type, String desc) {
		events.add(new Event(name, date, type, desc));
		System.out.println("Event declared and pending approval.");
	}

	// Approve an event by name
	public void approveEvent(String eName) {
		for (Event e : events) {
			if (e.getName().equalsIgnoreCase(eName)) {
				e.setStatus("APPROVED");
				System.out.println("Event approved.");
				return;
			}
		}
		System.out.println("Event not found.");
	}

	// Reject an event by name
	public void rejectEvent(String eName) {
		for (Event e : events) {
			if (e.getName().equalsIgnoreCase(eName)) {
				e.setStatus("REJECTED");
				System.out.println("Event rejected.");
				return;
			}
		}
		System.out.println("Event not found.");
	}

	// Display all events of the club
	public void viewEvents() {
		if (events.isEmpty()) {
			System.out.println("No events.");
			return;
		}
		for (Event e : events) {
			System.out.println(e);
		}
	}
}

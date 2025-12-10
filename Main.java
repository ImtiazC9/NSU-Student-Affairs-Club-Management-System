import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StudentAffarisOffice sao = new StudentAffarisOffice();
		Scanner input = new Scanner(System.in);

		// Main program loop
		while (true) {

			System.out.println("\n===== Main Menu =====");
			System.out.println("1. Add Club");
			System.out.println("2. Manage Club");
			System.out.println("3. SAO Dashboard");
			System.out.println("0. Exit");
			System.out.print("Choose: ");

			int menu = Integer.parseInt(input.nextLine());

			if (menu == 0)
				break;

			switch (menu) {

			
			case 1:
				// Create a new club
				System.out.print("Enter club name: ");
				String clubName = input.nextLine();
				sao.addClub(new Club(clubName));
				System.out.println("Club added.");
				break;

			case 2:
				// Manage an existing club
				System.out.print("Enter club name to manage: ");
				Club club = sao.getClub(input.nextLine());
				if (club == null) {
					System.out.println("Club not found!");
					break;
				}

				manageClub(club, sao, input);
				break;

			case 3:
				// Show dashboard with all club events
				sao.showDashboard();
				break;
			}
		}
	}

	// Sub-menu for club management
	public static void manageClub(Club club, StudentAffarisOffice sao, Scanner input) {

		while (true) {
			System.out.println("\n===== Managing: " + club.getName() + " =====");
			System.out.println("1. Add Member");
			System.out.println("2. Remove Member");
			System.out.println("3. View Members");
			System.out.println("4. Declare Event");
			System.out.println("5. Approve Event");
			System.out.println("6. Reject Event");
			System.out.println("0. Back");
			System.out.print("Choose: ");

			int choice = Integer.parseInt(input.nextLine());

			switch (choice) {
			case 0:
				return;

			case 1:
				// Add a new member
				System.out.print("Enter member name: ");
				String name = input.nextLine();
				System.out.println("Select Role: ");
				System.out.println("1. EXECUTIVE_BODY");
				System.out.println("2. SUB_EB");
				System.out.println("3. GROUP_LEADER");
				System.out.println("4. GENERAL_MEMBER");

				int option = Integer.parseInt(input.nextLine());
				String role;

				switch (option) {
				case 1:
					role = "EXECUTIVE_BODY";
					break;
				case 2:
					role = "SUB_EB";
					break;
				case 3:
					role = "GROUP_LEADER";
					break;
				default:
					role = "GENERAL_MEMBER";
				}

				// Create a member object with role
				MemberRole m = new MemberRole(name, role);
				club.addMember(m);
				System.out.println("Added: " + m);
				break;

			case 2:
				// Remove a member by name
				System.out.print("Enter member name to remove: ");
				club.removeMember(input.nextLine());
				break;

			case 3:
				club.viewMembers();
				break;

			case 4:
				// Declare event
				System.out.print("Event Name: ");
				String eName = input.nextLine();
				System.out.print("Date: ");
				String date = input.nextLine();
				System.out.print("Type: ");
				String type = input.nextLine();
				System.out.print("Description: ");
				String desc = input.nextLine();
				club.declareEvent(eName, date, type, desc);
				break;

			case 5:
				System.out.print("Event name to approve: ");
				club.approveEvent(input.nextLine());
				break;

			case 6:
				System.out.print("Event name to reject: ");
				club.rejectEvent(input.nextLine());
				break;
			}
		}
	}
}

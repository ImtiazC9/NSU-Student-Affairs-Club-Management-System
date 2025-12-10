public class Event {
	private String name, date, type, desc, status;

	// method overloading
	public Event() {
		this.status = "PENDING"; // Default status
	}

	public Event(String name, String date, String type, String desc) {
		this.name = name;
		this.date = date;
		this.type = type;
		this.desc = desc;
		this.status = "PENDING";
	}

	public String getName() {
		return name;
	}

	// Update event status (APPROVED/REJECTED)
	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return name + " | " + date + " | " + type + " | " + status + "\nDescription: " + desc;
	}
}

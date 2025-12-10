// Base class for all types of members
public class Member {
	protected String name;

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Default role (can be overridden by subclasses)
	public String getRole() {
		return "Member"; // default role
	}

	@Override
	public String toString() {
		return name + " [" + getRole() + "]";
	}
}

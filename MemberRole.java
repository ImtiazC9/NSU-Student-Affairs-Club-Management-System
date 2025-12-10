// Represents a member with a specific role
public class MemberRole extends Member {

	private String role;

	public MemberRole(String name, String role) {
		super(name);
		this.role = role;
	}

	@Override
	public String getRole() {
		return role;
	}

	public String toString() {
		return getName() + " (" + role + ")";
	}
}

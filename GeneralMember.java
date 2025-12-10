public class GeneralMember extends Member {
	public GeneralMember(String name) {
		super(name);
	}

	@Override
	public String getRole() {
		return "GENERAL_MEMBER";
	}
}
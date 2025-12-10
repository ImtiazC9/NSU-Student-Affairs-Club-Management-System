public class GroupLeader extends Member {

	public GroupLeader(String name) {
		super(name);
	}

	@Override
	public String getRole() {
		return "GROUP_LEADER";
	}
}

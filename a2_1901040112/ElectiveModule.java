package a2_1901040112;

public class ElectiveModule extends Module{
	private String departmentName;

	public ElectiveModule(String code, String name, int semester, int credits, String departmentName) {
		super(name, semester, credits);
		this.setDepartmentName(departmentName);
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}

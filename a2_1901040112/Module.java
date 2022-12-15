package a2_1901040112;

public class Module {
	protected String code;
	private String name;
	private int semester;
	private int credits;

	private static int[] semesters = new int[10];

	public Module(String name, int semester, int credits) {

		semesters[semester]++;
		if (semesters[semester] > 9) {
			code = "M" + semester + semesters[semester];
		}else {
			code = "M" + semester + "0" + semesters[semester];
		}
		this.name = name;
		this.semester = semester;
		this.credits = credits;
	}

	String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}

package a2_1901040112;

public class Enrolment {
	private Student student;
	private Module module;
	private double internalMark;
	private double examinationMark;

	public Enrolment(Student s, Module m) {
		this.student = s;
		this.module = m;
		setInternalMark(0);
		setExaminationMark(0);
	}
	public char getFinalGrade() {
		double mark = 0.4 * getInternalMark() + 0.6 * getExaminationMark();
		if (mark >= 8){
			return 'E';
		}
		else if (mark >= 6){
			return 'G';
		}
		else if (mark >= 5){
			return 'P';
		}
		else {
			return 'F';
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public double getInternalMark() {
		return internalMark;
	}

	public void setInternalMark(double internalMark) {
		this.internalMark = internalMark;
	}

	public double getExaminationMark() {
		return examinationMark;
	}

	public void setExaminationMark(double examinationMark) {
		this.examinationMark = examinationMark;
	}
}

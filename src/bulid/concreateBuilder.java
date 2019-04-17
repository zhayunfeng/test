package bulid;

public class concreateBuilder extends Builder{
	private Project project=new Project();
	public void buildA(String a) {
		project.setA(a);
	}
	public void buildB(String b) {
		project.setB(b);
	}
	public Project getResult() {
		return project;
	}
}

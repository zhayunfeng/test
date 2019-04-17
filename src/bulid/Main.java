package bulid;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder=new concreateBuilder();
		Director director=new Director(builder);
		Project project=director.construct("第一部分","第二部分");
		System.out.println(project.getA());
	}

}

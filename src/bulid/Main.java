package bulid;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder=new concreateBuilder();
		Director director=new Director(builder);
		Project project=director.construct("��һ����","�ڶ�����");
		System.out.println(project.getA());
	}

}

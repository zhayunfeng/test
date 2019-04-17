package bulid;

public class Director {
	private Builder builder;
	public void setBuilder(Builder builder) {
		this.builder=builder;
	}
	public Director(Builder builder) {
		this.builder=builder;
	}
	public Project construct(String a,String b) {
		builder.buildA(a);
		builder.buildB(b);
		return builder.getResult();
	}
}

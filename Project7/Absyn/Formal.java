package Absyn;

public class Formal extends Absyn{
	protected Type type;
	protected String name;

	public Formal(Type type, String name){
		this.type = type;
		this.name = name;
	}

	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

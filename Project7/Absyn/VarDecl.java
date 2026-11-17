package Absyn;

public class VarDecl extends Absyn{
	protected Type type;
	protected String name;
	protected Expr init;

	public VarDecl(Type type, String name, Expr init){
		this.type = type;
		this.name = name;
		this.init = init;
	}

	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

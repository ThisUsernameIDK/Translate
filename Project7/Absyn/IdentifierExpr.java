package Absyn;

public class IdentifierExpr extends AssignableExpr{
	protected String id;
	
	public IdentifierExpr(String id){
		this.id = id;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

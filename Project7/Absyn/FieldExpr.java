package Absyn;

public class FieldExpr extends AssignableExpr{
	protected Expr target;
	protected String field;

	public FieldExpr(Expr target, String field){
		this.target = target;
		this.field = field;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

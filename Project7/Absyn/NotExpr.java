package Absyn;

public class NotExpr extends Expr{
	protected Expr e1;
	public NotExpr(Expr e1){
		this.e1 = e1;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

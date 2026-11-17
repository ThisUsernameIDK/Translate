package Absyn;

public class FalseExpr extends Expr{
	protected Expr left;
	protected Expr right;

	public FalseExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

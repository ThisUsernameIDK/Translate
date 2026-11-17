package Absyn;

public class DivExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public DivExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

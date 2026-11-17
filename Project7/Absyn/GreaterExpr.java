package Absyn;

public class GreaterExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public GreaterExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit.(this);
	}
}

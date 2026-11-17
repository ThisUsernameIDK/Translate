package Absyn;

public abstract class BinOpExpr extends Expr{

	protected final Expr left;
	protected final Expr right;

	public BinOpExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
}

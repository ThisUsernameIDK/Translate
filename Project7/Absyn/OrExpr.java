package Absyn;

public class OrExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public OrExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

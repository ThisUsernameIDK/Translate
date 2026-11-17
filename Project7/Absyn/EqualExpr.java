package Absyn;

public class EqualExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public EqualExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

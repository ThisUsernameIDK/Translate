package Absyn;

public class NotEqExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public NotEqExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

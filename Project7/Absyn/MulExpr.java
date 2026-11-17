package Absyn;

public class MulExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public MulExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

package Absyn;

public class SubExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public SubExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

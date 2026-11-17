package Absyn;

public class LesserExpr extends BinOpExpr{
	protected Expr left;
	protected Expr right;

	public LesserExpr(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

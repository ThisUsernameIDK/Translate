package Absyn;

public class NegExpr extends Expr{
	protected Expr e1;

	public NegExpr(Expr e1){
		this.e1 = e1;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

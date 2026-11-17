package Absyn;

public class TrueExpr extends Expr{

	public TrueExpr(){}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

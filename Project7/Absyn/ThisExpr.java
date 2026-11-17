package Absyn;

public class ThisExpr extends Expr{
	
	public ThisExpr(){}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

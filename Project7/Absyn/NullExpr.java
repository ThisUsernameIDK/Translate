package Absyn;

public class NullExpr extends Expr{
	public NullExpr(){}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

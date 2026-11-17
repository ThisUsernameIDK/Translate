package Absyn;

public class AddExpr extends BinOpExpr{

	public AddExpr(Expr left, Expr right){
		super(left, right);
	}

	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

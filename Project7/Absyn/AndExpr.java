package Absyn;

public class AndExpr extends BinOpExr{

	public AndExpr(Expr left, Expr right){
		super(left, right);
	}

	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

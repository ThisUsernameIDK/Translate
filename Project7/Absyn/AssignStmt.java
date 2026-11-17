package Absyn;

public class AssignStmt extends Stmt{
	protected AssignableExpr lhs;
	protected Expr rhs;

	public AssignStmt(AssignableExpr lhs, Expr, rhs){
		this.lhs = lhs;
		this.rhs = rhs;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

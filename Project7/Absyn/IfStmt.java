package Absyn;

public class IfStmt extends Stmt{
	protected Expr test;
	protected Stmt thenStm;
	protected Stmt elseStm;

	public IfStmt(Expr test, Stmt thenStm, Stmt elseStm){
		this.test = test;
		this.thenStm = thenStm;
		this.elseStm = elseStm;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

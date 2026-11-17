package Absyn;

public class WhileStmt extends Stmt{
	protected Expr test;
	protected Stmt body;

	public WhileStmt(Expr test, Stmt body){
		this.test = test;
		this.body = body;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

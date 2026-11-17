package Absyn;
import java.util.LinkedList;

public BlockStmt extends Stmt{
	protected LinkedList<Stmt> stmts;
	
	public BlockStmt(LinkedList<Stmt> stmts){
		this.stmts = stmts;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

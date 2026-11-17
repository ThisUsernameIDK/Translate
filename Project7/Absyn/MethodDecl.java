package Absyn;
import java.util.LinkedList;

public class MethodDecl extends Absyn{
	protected Type returnType;
	protected boolean synced;
	protected String name;
	protected LinkedList<Formal> params;
	protected LinkedList<VarDecl> locals;
	protected LinkedList<Stmt> stmts;
	protected Expr returnVal;

	public MethodDecl(Type returnType, boolean synced, String name, LinkedList<Formal> params, LinkedList<VarDecl> locals, LinkedList<Stmt> stmts, Expr returnVal){
		this.returnType = returnType;
		this.synced = synced;
		this.name = name;
		this.params = params;
		this.locals = locals;
		this.stmts = stmts;
		this.returnVal = returnVal;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

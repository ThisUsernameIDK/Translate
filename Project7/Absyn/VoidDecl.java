package Absyn;
import java.util.LinkedList;

public class VoidDecl extends MethodDecl{
	protected String name;
	protected LinkedList<VarDecl> locals;
	protected LinkedList<Stmt> stmts;

	public VoidDecl(String name, LinkedList<VarDecl> locacls, LinkedList<Stmt> stmts){
	this.name = name;
	this.locals = locals;
	this.stmts = stmts;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

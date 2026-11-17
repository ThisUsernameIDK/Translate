package Absyn;
import java.util.LinkedList;

public class CallExpr.java extends Expr{
	protected Expr target;
	protected String method;
	protected LinkedList<Expr> args;

	public CallExpr(target, method, args){
		this.target = target;
		this.method = method;
		this.args = args;
	}

	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

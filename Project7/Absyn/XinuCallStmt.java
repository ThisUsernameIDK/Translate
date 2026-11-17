package Absyn;
import java.util.LinkedList;

public class XinuCallStmt extends Stmt{
	protected String method;
	protected LinkedList<Expr> args;

	public XinuCallStmt(String method, LinkedList<Expr> args){
		this.method = method;
		this.args = args;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

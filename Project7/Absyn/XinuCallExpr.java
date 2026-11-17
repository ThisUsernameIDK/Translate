package Absyn;
import java.util.LinkedList;

public class XinuCallExpr extends Expr{
	protected String method;
	protected LinkedList<Expr> args;

	public XinuCallExpr(String method, LinkedList<Expr> args){
		this.method = method;
		this.args = args;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

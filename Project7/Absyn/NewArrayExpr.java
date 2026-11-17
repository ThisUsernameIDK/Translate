package Absyn;
import java.util.LinkedList;

public class NewArrayExpr extends Expr{
	protected Type type;
	protected LinkedList<Expr> dimensions;

	public NewArrayExpr(Type type, LinkedList<Expr> dimensions){
		this.type = type;
		this.dimensions = dimensions;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

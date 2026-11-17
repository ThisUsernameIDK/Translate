package Abysn;

public class NewObjectExpr extends Expr{
	protected Type type;

	public NewObjectExpr(Type type){
		this.type = type;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

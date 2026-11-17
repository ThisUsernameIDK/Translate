package Absyn;

public class IntegerLiteral extends Expr{
	protected Expr value;

	public IntegerLiteral(Expr value){
		this.value = value;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

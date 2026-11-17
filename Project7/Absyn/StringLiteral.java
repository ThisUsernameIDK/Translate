package Absyn;

public class StringLiteral extends Expr{
	protected String value;

	public StringLiteral(String value){
		this.value = value;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

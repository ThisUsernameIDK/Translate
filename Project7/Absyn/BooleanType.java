package Absyn;

public class BooleanType extends Type{

	public BooleanType(){}
	
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

package Absyn;

public class ArrayType extends Type{
	protected Type base;

	public ArrayType(Type base){
		this.base = base;
	}

	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

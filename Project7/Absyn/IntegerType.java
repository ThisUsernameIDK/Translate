package Absyn;

public class IntegerType extends Type{

	public IntegerType(){}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

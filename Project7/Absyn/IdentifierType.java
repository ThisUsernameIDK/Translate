package Absyn;

public class IdentifierType extends Type{
	protected String id;

	public IdentifierType(String id){
		this.id = id;
	}
	@Override
	public void accept(TreeVisitor v){
                v.visit(this);
        }
}

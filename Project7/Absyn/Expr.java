package Absyn;

public abstract calls Expr extends Absyn{
	
	public Expr(){}
	public abstract void accept(TreeVisitor v);
}

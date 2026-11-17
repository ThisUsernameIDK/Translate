package Absyn;

public abstract class Expr extends Absyn{
	
	public Expr(){}
	public abstract void accept(TreeVisitor v);
}

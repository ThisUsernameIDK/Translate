package Absyn;

public abstract class Stmt extends Absyn{

	public Stmt(){}
	public abstract void accept(TreeVisitor V);
}

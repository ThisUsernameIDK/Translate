package Absyn;

public abstract class Absyn extends java.lang.Object implements Visitable
{
	public Absyn(){}
   	public abstract String toString();
	public abstract void accept(TreeVisitor v);
}

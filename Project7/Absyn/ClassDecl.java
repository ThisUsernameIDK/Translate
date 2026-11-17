package Absyn;
import java.util.LinkedList;

public class ClassDecl extends Absyn{
	public String name;
	public String parent;
	public LinkedList<VarDecl> fields;
	public LinkedList<MethodDecl> methods;

	public ClassDecl(String name, String parent, LinkedList<VarDecl> fields, LinkedList<MethodDecl> methods){
		this.name = name;
		this.parent = parent;
		this.fields = fields;
		this.methods = methods;
	}
	@Override
	public void accept(TreeVisitor v){
		v.visit(this);
	}
}

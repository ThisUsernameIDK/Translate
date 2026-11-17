package Absyn;
import java.util.LinkedList;

public class ThreadDecl extends ClassDecl{
	protected String name;
	protected LinkedList<VarDecl> fields;
	protected LinkedList<MethodDecl> methods;

	public ThreadDecl(String name, LinkedList<VarDecl> fields, LinkedList<MethodDecl> methods){
		this.name = name;
		this.fields = fields;
		this.methods = methods;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

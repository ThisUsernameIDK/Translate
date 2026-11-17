package Absyn;
import java.util.AbstractList;

public class Program extends Absyn{
	protected AbstractList<ClassDecl> classes;

	public Program(AbstractList<ClassDecl> classes){
		this.classes = classes;
	}
	@Override
        public void accept(TreeVisitor v){
                v.visit(this);
        }
}

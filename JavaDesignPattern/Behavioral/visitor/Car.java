package visitor;

public interface Car {
	int drive();
	int getFuel();
	String visit(ViewVisitor viewVisitor);
}

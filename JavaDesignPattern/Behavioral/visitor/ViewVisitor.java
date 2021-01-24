package visitor;

public interface ViewVisitor {
	String visit(Bus bus);
	String visit(Truck truck);
}

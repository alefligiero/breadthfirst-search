package breadthfirst_search;

public class Adjacent {

	private Vertex vertex;
	private int cost;
	
	public Adjacent(Vertex vertex, int cost) {
		this.vertex = vertex;
		this.cost = cost;
	}
	
	public Vertex getVertex() {
		return vertex;
	}
	public void setVertex(Vertex vertex) {
		this.vertex = vertex;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}

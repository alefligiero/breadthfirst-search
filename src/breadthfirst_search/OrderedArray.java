package breadthfirst_search;

public class OrderedArray {

	private int capacity;
	private Vertex[] vertices;

	public OrderedArray(int capacity) {
		this.capacity = capacity;
		this.vertices = new Vertex[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Vertex[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}

	public Vertex getPositionZero() {
		return vertices[0];
	}

	// Responsible function to insert the adjacent city in the array
	public void insertVertex(Vertex v, Vertex atual) {
		// Verifying on the ordered array created if the position is null, and if is, insert in the array
		for (int i = 0; i < vertices.length; i++) {
			if (vertices[i] == null) {
				vertices[i] = v;
				break;
			}
		}
	
		// Creating two new adjacent to compare in the function below
		Adjacent a = null;
		Adjacent b = null;
		
		// Ordering the array based on the shortest edge distance (breadth-first distance)
		for (int i = 0; i < vertices.length; i++) {
			for (int j = 0; j < vertices.length; j++) {
				if (vertices[i] != null && vertices[j] != null) {
					// Filtering vertices i j to obtain the respective cost (edge distance)
					a = vertices[i].getAdjacents().stream().filter(x -> x.getVertex().getLabel() == atual.getLabel()).findFirst().orElse(null);
					b = vertices[j].getAdjacents().stream().filter(x -> x.getVertex().getLabel() == atual.getLabel()).findFirst().orElse(null);
					if (a.getCost() < b.getCost()) {
						Vertex temp = vertices[i];
						vertices[i] = vertices[j];
						vertices[j] = temp;
					}
				}
			}
		}
	}
}

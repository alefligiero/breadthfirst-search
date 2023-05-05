package breadthfirst_search;

import java.util.ArrayList;

public class BreadthFirst {

	private ArrayList<Vertex> route;
	
	// The constructor with the city of destiny in the parameter and the route instantiated with the all cities that was traveled to the destiny
	public BreadthFirst(Vertex vertex) {
		this.route = new ArrayList<Vertex>();
	}
	
	public void recursiveSearch(Vertex v) {
		// Printing the current city where the function is passing through
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		// Printing the current city where the function is passing through
		System.out.printf("Atual: %s\n", v.getLabel());
		// Setting the actual city to visited = true
		v.setVisited(true); 
		// Adding the current city to the route list
		route.add(v);
		
		// List all adjacent from the respective city
		v.listAdjacentVertices();

		// Comparing the city distance because if the distance was equal 0, the function reached the destination
		if (v.getDistance() == 0) {
			System.out.println("|-----Chegou-ao-destino-final-----|");
			System.out.println("\nRota feita do inicio ao destino:");
			System.out.print("[   ");
			for (Vertex vertex : route) {
				System.out.print(vertex.getLabel() + "   ");
			}
			System.out.println("]");
		} else {
			// Instantiating a new Ordered array with the adjacent city size
			OrderedArray orderedArray = new OrderedArray(v.getAdjacents().size());
			
			// Passing in all adjacent of the current city passed in the function parameter
			for (int i = 0; i < orderedArray.getCapacity(); i++) {
				// Verifying if the current adjacent has been visited before
				if (!v.getAdjacents().get(i).getVertex().isVisited()) {
					// If hasn't been visited, insert this on the ordered array calling the function below
					orderedArray.insertVertex(v.getAdjacents().get(i).getVertex(), v);
				}
			}

			// Calling the function again with the city with the smallest edge distance from the destination (position zero)
			// of the array because it is been ordered where the city with the smallest distance went to the first position of the array
			recursiveSearch(orderedArray.getPositionZero());
		}
	}
}

package breadthfirst_search;

public class Program {

	public static void main(String[] args) {

		// Creating graph
		Graph map = new Graph();
		
		// Instantiating the BreadthFirst class with the destiny in the parameter
		BreadthFirst breadthFirst = new BreadthFirst(map.bucharest);
		// Calling the recursive function with the beginning vertex
		breadthFirst.recursiveSearch(map.arad);

	}

}

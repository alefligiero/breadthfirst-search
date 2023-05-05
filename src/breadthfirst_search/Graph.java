package breadthfirst_search;

public class Graph {

	public Vertex arad, zerind, oradea, sibiu, timisoara, lugoj, mehadia, dobreta, craiova, rimnicu, fagaras, pitesti,
			bucharest, giurgiu;

	public Graph() {
		// Instantiating cities in the graph
		arad = new Vertex("Arad", 366);
		zerind = new Vertex("Zerind", 374);
		oradea = new Vertex("Oradea", 380);
		sibiu = new Vertex("Sibiu", 253);
		timisoara = new Vertex("Timisoara", 329);
		lugoj = new Vertex("Lugoj", 244);
		mehadia = new Vertex("Mehadia", 241);
		dobreta = new Vertex("Dobreta", 242);
		craiova = new Vertex("Craiova", 160);
		rimnicu = new Vertex("Rimnicu Vilcea", 193);
		fagaras = new Vertex("Fagaras", 178);
		pitesti = new Vertex("Pitesti", 98);
		bucharest = new Vertex("Bucharest", 0);
		giurgiu = new Vertex("Giurgiu", 77);

		// Adding the respective adjacent of each city
		arad.addAdjacent(new Adjacent(zerind, 75));
		arad.addAdjacent(new Adjacent(sibiu, 140));
		arad.addAdjacent(new Adjacent(timisoara, 118));

		zerind.addAdjacent(new Adjacent(arad, 75));
		zerind.addAdjacent(new Adjacent(oradea, 71));

		oradea.addAdjacent(new Adjacent(zerind, 71));
		oradea.addAdjacent(new Adjacent(sibiu, 151));

		sibiu.addAdjacent(new Adjacent(oradea, 151));
		sibiu.addAdjacent(new Adjacent(arad, 140));
		sibiu.addAdjacent(new Adjacent(fagaras, 99));
		sibiu.addAdjacent(new Adjacent(rimnicu, 80));

		timisoara.addAdjacent(new Adjacent(arad, 118));
		timisoara.addAdjacent(new Adjacent(lugoj, 111));

		lugoj.addAdjacent(new Adjacent(timisoara, 118));
		lugoj.addAdjacent(new Adjacent(mehadia, 70));

		mehadia.addAdjacent(new Adjacent(lugoj, 70));
		mehadia.addAdjacent(new Adjacent(dobreta, 75));
		
		dobreta.addAdjacent(new Adjacent(mehadia, 75));
		dobreta.addAdjacent(new Adjacent(craiova, 120));
		
		craiova.addAdjacent(new Adjacent(dobreta, 120));
		craiova.addAdjacent(new Adjacent(rimnicu, 146));
		craiova.addAdjacent(new Adjacent(pitesti, 138));
		
		rimnicu.addAdjacent(new Adjacent(craiova, 146));
		rimnicu.addAdjacent(new Adjacent(sibiu, 80));
		rimnicu.addAdjacent(new Adjacent(pitesti, 97));
		
		fagaras.addAdjacent(new Adjacent(sibiu, 99));
		fagaras.addAdjacent(new Adjacent(bucharest, 211));
		
		pitesti.addAdjacent(new Adjacent(craiova, 138));
		pitesti.addAdjacent(new Adjacent(rimnicu, 97));
		pitesti.addAdjacent(new Adjacent(bucharest, 101));
		
		bucharest.addAdjacent(new Adjacent(pitesti, 101));
		bucharest.addAdjacent(new Adjacent(giurgiu, 90));
		
		giurgiu.addAdjacent(new Adjacent(bucharest, 90));
		
	}

}

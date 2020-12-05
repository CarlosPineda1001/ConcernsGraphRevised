
public class Test {

	public static void main(String[] args) {
		GraphAM g = new GraphAM(5);
		
		g.addEdge(0, 2, 12); //A is connected C
		g.addEdge(0, 3, 60); //A is connected D
		g.addEdge(1, 0, 10); //B is connected A
		g.addEdge(2, 1, 20); //C is connected B
		g.addEdge(2, 3, 32); //C is connected D
		g.addEdge(4, 0, 7);  //E is connected A
		
		g.displayGraph();
		
		GraphAL a = new GraphAL(5);
		
		a.addEdge(0, 2, 12); //A is connected C
		a.addEdge(0, 3, 60); //A is connected D
		a.addEdge(1, 0, 10); //B is connected A
		a.addEdge(2, 1, 20); //C is connected B
		a.addEdge(2, 3, 32); //C is connected D
		a.addEdge(4, 0, 7);  //E is connected A
		
		
		a.displayGraph();
		a.DFS(1);
		
	}
}

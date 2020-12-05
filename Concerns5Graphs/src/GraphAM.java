
public class GraphAM {
	int n; 			//number of vertices
	int [][] am;	//adjacency matrix
	
	
	public GraphAM(int n) {
		this.n = n;				//size of matrix
		am = new int[n][n];		//initialize matrix 
	}
	
	public void addEdge(int start, int end, int weight) {
		am[start][end] = weight; 
		
	}
	
	public void displayGraph() {
		System.out.println("ADJACENCY MATRIX:");
		System.out.println("=================");
		for(int i = 0; i < am.length; i++) {
			switch(i) {
			case(0): System.out.print('A' + ": ");
					break;
			case(1): System.out.print('B' + ": ");
					break;
			case(2): System.out.print('C' + ": ");
					break;
			case(3): System.out.print('D' + ": ");
					break;
			case(4): System.out.print('E' + ": ");
					break;
			}
			for(int j = 0; j < am[i].length; j++) {
				System.out.print(am[i][j] + "	");
			}
			System.out.println();
		}
	}
}

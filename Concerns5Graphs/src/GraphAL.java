import java.util.Iterator;
import java.util.LinkedList;

public class GraphAL {
	int n;
	LinkedList<Integer>[] al;
	int weight;
	
	public GraphAL(int n) {
		this.n = n;
		al = new LinkedList[n];					//initialize array LinkedList
		for(int i = 0; i < al.length; i++) {
			al[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int node, int connected , int weight) {
		al[node].add(connected);
		this.weight = weight;
	}
	
	public void displayGraph() {
		System.out.println("Adjacency List");
		System.out.println("===============");
		for(int i = 0; i < al.length; i++) {
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
			for(int j = 0; j < al[i].size(); j++) {
				if(al[i].get(j) == 0) {
					System.out.print('A' + " ");
				}
				if(al[i].get(j) == 1) {
					System.out.print('B' + " ");
				}
				if(al[i].get(j) == 2) {
					System.out.print('C' + " ");
				}
				if(al[i].get(j) == 3) {
					System.out.print('D' + " ");
				}
				if(al[i].get(j) == 4) {
					System.out.print('E' + " ");
				}
			}
			System.out.println();
		}
	}
	
	void BFS(int start) {
		boolean visited[] = new boolean[n];			//creating an array that will monitor the nodes if they are visited or not
													//initial value is false
		
		LinkedList<Integer> queue = new LinkedList<Integer>();	//queue is a container of already visited nodes
		
		visited[start] = true;
		queue.add(start);			//indicates that the node is already visited so it added it to the queue variable
		
		while(queue.size() !=0) {					//scanning the 
			start = queue.poll();
			switch(start) {
			case(0): System.out.print('A' + " ");
					break;
			case(1): System.out.print('B' + " ");
					break;
			case(2): System.out.print('C' + " ");
					break;
			case(3): System.out.print('D' + " ");
					break;
			case(4): System.out.print('E' + " ");
					break;
			}
			
			Iterator<Integer> i = al[start].listIterator();
			while(i.hasNext()) 
			{
				int n = i.next();
				if(!visited[n]) 
				{
					visited[n] = true;
					queue.add(n);
				}
			}
			
		}
	}
	
	private void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        switch(v) {
		case(0): System.out.print('A' + " ");
				break;
		case(1): System.out.print('B' + " ");
				break;
		case(2): System.out.print('C' + " ");
				break;
		case(3): System.out.print('D' + " ");
				break;
		case(4): System.out.print('E' + " ");
				break;
		}

        Iterator<Integer> i = al[v].listIterator();
        while(i.hasNext()) 
        {
            int n = i.next();
            if(!visited[n]) 
            {
                DFSUtil(n, visited);
            }
        }
    }

        void DFS(int v) {
            boolean visited[] = new boolean[n];
            DFSUtil(v,visited);
        }
	
	

}
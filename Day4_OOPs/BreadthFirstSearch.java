public class BreadthFirstSearch {
  
    // Java program for Breadth First Search (BFS

    static int MAX = 8;

    static char[] vertices = new char[MAX];          // store vertex labels
    static boolean[] visited = new boolean[MAX];     // visited array
    static int[][] adjMatrix = new int[MAX][MAX];    // adjacency matrix

    static int[] queue = new int[MAX];                // queue
    static int front = 0;
    static int rear = -1;

    static int vertexCount = 0;

    // add vertex
    static void addVertex(char label) {
        vertices[vertexCount++] = label;
    }

    // add edge (undirected graph)
    static void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    // BFS logic
    static void bfs() {

        // start from first vertex
        visited[0] = true;
        System.out.print(vertices[0] + " ");
        queue[++rear] = 0;

        while (front <= rear) {

            int current = queue[front++]; // dequeue

            // check all adjacent vertices
            for (int i = 0; i < vertexCount; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    System.out.print(vertices[i] + " ");
                    queue[++rear] = i; // enqueue
                }
            }
        }
    }

    public static void main(String[] args) {

        // initialize adjacency matrix
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                adjMatrix[i][j] = 0;
            }
        }

        addVertex('S'); // 0
        addVertex('U'); // 1
        addVertex('R'); // 2
        addVertex('A'); // 3
        addVertex('J'); // 4
        addVertex('S'); // 4
        addVertex('A'); // 4
        addVertex('H'); // 4

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(0, 3);
        addEdge(1, 4);
        addEdge(2, 4);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(5, 6);
        addEdge(6, 7);

        System.out.print("BFS Traversal: ");
        bfs();
    }
}
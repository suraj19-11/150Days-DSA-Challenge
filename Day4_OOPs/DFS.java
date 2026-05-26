public class DFS {
    // Simple Java program for Depth First Search (DFS)

    static int MAX = 5;

    static char[] vertices = new char[MAX];   // store vertex labels
    static boolean[] visited = new boolean[MAX]; // track visited nodes
    static int[][] adjMatrix = new int[MAX][MAX]; // graph
    static int[] stack = new int[MAX]; // stack
    static int top = -1;
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

    // DFS logic
    static void dfs() {
        // start from first vertex
        visited[0] = true;
        System.out.print(vertices[0] + " ");
        stack[++top] = 0;

        while (top != -1) {
            int current = stack[top];
            int next = -1;

            // find unvisited adjacent vertex
            for (int i = 0; i < vertexCount; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    next = i;
                    break;
                }
            }

            if (next == -1) {
                top--; // pop
            } else {
                visited[next] = true;
                System.out.print(vertices[next] + " ");
                stack[++top] = next; // push
            }
        }
    }

    public static void main(String[] args) {

        addVertex('S'); // 0
        addVertex('U'); // 1
        addVertex('A'); // 2
        addVertex('J'); // 3
        addVertex('R'); // 4

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(0, 3);
        addEdge(1, 4);
        addEdge(2, 4);
        addEdge(3, 4);

        System.out.print("DFS Traversal: ");
        dfs();
    }
}

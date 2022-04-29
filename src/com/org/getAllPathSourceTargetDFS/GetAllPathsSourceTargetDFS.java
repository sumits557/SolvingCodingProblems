public class GetAllPathsSourceTargetDFS {

    // DFS

    /**
     * Input: graph = [[1,2],[3],[3],[]]
     * Output: [[0,1,3],[0,2,3]]
     * Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
     *
     *
     * Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
     * Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
     *
     *
     * Constraints:
     *
     * n == graph.length
     * 2 <= n <= 15
     * 0 <= graph[i][j] < n
     * graph[i][j] != i (i.e., there will be no self-loops).
     * All the elements of graph[i] are unique.
     * The input graph is guaranteed to be a DAG.
     *
     *
     * @param graph
     * @return
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        if (graph == null || graph.length == 0) {
            return paths;
        }

        dfs(graph, 0, new ArrayList<>(), paths);
        return paths;
    }

    void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> paths) {
        path.add(node);
        if (node == graph.length - 1) {
            paths.add(new ArrayList<>(path));
            return;
        }
        int[] nextNodes = graph[node];
        for (int nextNode: nextNodes) {
            dfs(graph, nextNode, path, paths);
            path.remove(path.size() - 1);
        }
    }
}

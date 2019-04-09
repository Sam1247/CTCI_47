import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
	boolean cyclic = true;
	ArrayList<Integer>[] adj;
	Set<Integer> set = new HashSet<Integer>();
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		adj = new ArrayList[numCourses];
		for (int i = 0; i < numCourses; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < prerequisites.length; ++i) {
			adj[prerequisites[i][0]].add(prerequisites[i][1]);
		}
		for (int i = 0; i < numCourses; ++i) {
			DFS(i);
		}
		return cyclic;
	}

	public void DFS (int s) {
		set.add(s);
		for (int u: adj[s]) {
			if (set.contains(u)) {
				cyclic = false;
				return;
			}
			DFS(u);
		}
		set.remove(s);
	}
}
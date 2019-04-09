import java.util.ArrayList;
import java.util.List;

class Solution {
	public boolean canFinish(int numCourses, int[][] prerequisites) {

		List<Integer>[] graph= new ArrayList[numCourses];

		for(int i=0;i<numCourses;i++){
			graph[i]= new ArrayList<>();
		}
		for(int[] dep: prerequisites){
			graph[dep[0]].add(dep[1]);
		}

		int[] visited= new int[numCourses];
		for(int i=0;i<numCourses;i++){
			if(visited[i]==0){

				if( hasCycle(graph, i ,visited)) return false;
			}
		}

		return true;
	}

	boolean hasCycle( List<Integer>[] graph,int node, int[] visited){
		if(visited[node]==1) return true;

		visited[node]=1;
		for(int i=0;i<graph[node].size();i++){
			if(visited[graph[node].get(i)]!=2){
				if(hasCycle(graph, graph[node].get(i),visited)) return true;
			}
		}
		visited[node]=2;
		return false;
	}
}
package TreeAndGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution07 {
	/*
	 * This problem is equals to building topological order given lists of dependencies.
	 * 
	 * */
	//Algorithm: 1. Generate a graph 2. topology sort the graph, if the number of nodes that can be sorted is equal to the total number of nodes then canfinish(no circle=all nodes can be indegree == 0)
    //Algorithm(Topological sort): 1. Find the first node whose indegree is 0, visit it. 
    //                          2. After visit it, delete all its adjacent edges(decrease indegree of all its adjencent nodes).
    //                          3. Find next node whose indegree is 0 and then visit. 
    //                          4. Repeat this process until no nodes indegree is equal to 0.
    
    
    //Data Structures: Maintain a hashmap and an array, use the hashmap to store the graph structure, which is store nodes as key and its neighbor list as value. Use the array to store indegree, node label as index and indegree as element.
    //                 Maintain a queue for BFS(store the node are waiting for visiting)
    //BFS implement topological sort: 1. Initialize the hashmap, the array and the queue.
    //                                2. Poll a node from the queue.
    //                                3. Iterate the adjacent node of current node, update the indegree array and the queue: 
    //                                   A. Indegree array: decrease one for all the adjacent node of current node.
    //                                   B. Queue: add the node to the queue.
	public int[] findOrder(int numNodes, int[][] dependencies) {
        if (numNodes <= 0) {
            return null;
        }
        int[] res = new int[numNodes];
        int index = 0;
        if (dependencies.length == 0 || dependencies[0].length == 0) {
            while (index < numNodes) {
                res[index] = index++;
            }
            return res;
        }
        int[] course = new int[numNodes];
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < dependencies.length; i++) {
            int val = dependencies[i][0];
            int key = dependencies[i][1];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<Integer>());
            }
            map.get(key).add(val);
            course[val]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numNodes; i++) {
            if (course[i] == 0) {
                queue.add(i);
                res[index++] = i;
            }
        }
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (map.get(cur) != null) {
                for (int temp : map.get(cur)) {
                    course[temp]--;
                    if (course[temp] == 0) {
                        queue.offer(temp);
                        res[index++] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < numNodes; i++) {
            if (course[i] != 0) {
                return new int[0];
            }
        }
        return res;
    }
}

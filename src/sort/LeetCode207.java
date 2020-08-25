package sort;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: sort
 * Date: 2020/8/25 16:36
 */
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < prerequisites.length; i++) {
            ++indegree[prerequisites[i][0]];
        }
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == node) {
                    if (--indegree[prerequisites[i][0]]==0) {
                        queue.offer(prerequisites[i][0]);
                    }
                }
            }
        }
        //这里是为了判断是不是有环，如果有环的话那么说明 最后广度搜索之后队列为空，但是indegree中肯定还有入度不为0的节点
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

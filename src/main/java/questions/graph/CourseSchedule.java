package questions.graph;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            int courseToTake = prereq[0];
            int prerequisiteCourse = prereq[1];


            adj.get(prerequisiteCourse).add(courseToTake);

            inDegree[courseToTake]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int coursesTakenCount = 0;
        while (!queue.isEmpty()) {
            int currentCourse = queue.poll();
            coursesTakenCount++;
            if (adj.containsKey(currentCourse)) {
                for (int neighborCourse : adj.get(currentCourse)) {
                    inDegree[neighborCourse]--;
                    if (inDegree[neighborCourse] == 0) {
                        queue.offer(neighborCourse);
                    }
                }
            }
        }

        return coursesTakenCount == numCourses;
    }
}

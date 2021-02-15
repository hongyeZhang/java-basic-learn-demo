package queue;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author ZHQ
 * @date 2021/2/3
 */
public class PriorityArrayQueueTest {

    public static void main(String[] args) {
        PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            queue.add(new Task(random.nextInt(10), "name-" + i));
        }

        while (!queue.isEmpty()) {
            Task poll = queue.poll();
            poll.doSomething();
        }
    }

    static class Task implements Comparable<Task> {

        private int priority = 0;
        private String name;

        public Task(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Task other) {
            if (this.priority > other.getPriority()) {
                return 1;
            } else {
                return -1;
            }
        }

        public void doSomething() {
            System.out.println("priority: " + priority + " , " + "name : " + name);
        }
    }

}

package queue;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author ZHQ
 * @date 2021/2/3
 */
public class DelayQueueTest {

    public static void main(String[] args) {
        DelayQueue<DelayEle> queue = new DelayQueue<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            DelayEle delayEle = new DelayEle(random.nextInt(500), "task: " + i);
            queue.offer(delayEle);
        }

        DelayEle ele = null;
        try {
            for (; ; ) {
                while ((ele = queue.take()) != null) {
                    System.out.println(ele.toString());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    static class DelayEle implements Delayed {
        private final long delayTime;
        private final long expire;
        private String taskName;

        public DelayEle(long delay, String taskName) {
            this.delayTime = delay;
            this.taskName = taskName;
            this.expire = System.currentTimeMillis() + delay;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(this.expire - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed other) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - other.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            return "DelayEle{" +
                    "delayTime=" + delayTime +
                    ", expire=" + expire +
                    ", taskName='" + taskName + '\'' +
                    '}';
        }
    }


}

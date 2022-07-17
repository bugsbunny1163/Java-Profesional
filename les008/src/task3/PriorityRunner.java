package task3;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread priorityThreadMin = new PriorityThread();
        priorityThreadMin.setPriority(Thread.MIN_PRIORITY);
        priorityThreadMin.setName("thread with MIN priority");
        priorityThreadMin.start();
        PriorityThread priorityThreadNorm = new PriorityThread();
        priorityThreadNorm.setPriority(Thread.NORM_PRIORITY);
        priorityThreadNorm.setName("thread with NORM priority");
        priorityThreadNorm.start();
        PriorityThread priorityThreadMax = new PriorityThread();
        priorityThreadMax.setPriority(Thread.MAX_PRIORITY);
        priorityThreadMax.setName("thread with MAX priority");
        priorityThreadMax.start();
    }
}

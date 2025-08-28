import java.util.PriorityQueue;

class Job implements Comparable<Job> {
    String name;
    int deadline;
    int processingTime;

    Job(String name, int deadline, int processingTime) {
        this.name = name;
        this.deadline = deadline;
        this.processingTime = processingTime;
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    @Override
    public String toString() {
        return name + " (Deadline: " + deadline + ", Time: " + processingTime + ")";
    }
}

public class JobScheduler {
    public static void main(String[] args) {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        pq.add(new Job("Job1", 5, 3));
        pq.add(new Job("Job2", 2, 1));
        pq.add(new Job("Job3", 8, 4));

        while (!pq.isEmpty()) {
            System.out.println("Processing " + pq.poll());
        }
    }
}
import java.util.*;

public class PriorityQueueImp {

    public static void main(String[] args){
        PriorityQueue<Job> prQueue = new PriorityQueue<Job>();
        prQueue.add(new Job("Job5", 5));
        prQueue.add(new Job("Job4", 4));
        prQueue.add(new Job("Job3", 3));
        prQueue.add(new Job("Job1", 1));
        prQueue.add(new Job("Job2", 2));
  //prQueue.add(null); // null elements not allowed in PriorityQueue - 
// NullPointerException
        
        System.out.println("Iterating Over the Elements - No Specific Oder or Sorting");
        for(Job job: prQueue){
            System.out.println(job.getJobName());
        }
        
        System.out.println("Removing the Elements - Sorted based on the job priority - CompareTo method");
        while(!prQueue.isEmpty()){
            System.out.println(prQueue.remove().getJobName());
        }
    }
    
    private static class Job implements Comparable <Job>{

        private String jobName;
        private int jobPriority;
        
        public Job(String jobName, int priority){
            this.jobName = jobName;
            this.jobPriority = priority;
        }

        public String getJobName() {
            return jobName;
        }
        public void setJobName(String jobName) {
            this.jobName = jobName;
        }
        public int getJobPriority() {
            return jobPriority;
        }
        public void setJobPriority(int jobPriority) {
            this.jobPriority = jobPriority;
        }
        
        @Override
        public int compareTo(Job job) {
            //if priority same then sort on name else on prioirty
            if(this.jobPriority == job.jobPriority){
                return this.jobName.compareTo(job.jobName);
            }
            return this.jobPriority - job.jobPriority;
        }
    }
}

package com.study.java.ch07.practice05;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        jobs.add(new Job(4, "Collect garbage"));
        jobs.add(new Job(9, "Match braces"));
        jobs.add(new Job(1, "Fix memory leak"));
        
        while (jobs.size() > 0) {
            Job job = jobs.remove(); // 가장 긴급한 작업부터 제거한다.
            execute(job);
        } 
    }
    
    public static void execute(Job job) {
        System.out.println(job.getDescription());
    }
}

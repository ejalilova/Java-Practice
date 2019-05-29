package day44refactor;
import java.util.*;
public class Dice {
public static void main(String[] args) {
	Job job1 = new Job();
	Job job2 = new Job("Java developer");
	Job job3 = new Job("SDET", "Amazon", 98000.00);
	
	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job3.toString());
	
	List<Job> jobsList = new ArrayList<>();
	jobsList.add(job3);
	jobsList.add(new Job ("Scrum Master", "Google", 123000));
	jobsList.add(new Job ("SDET", "FreddieMac", 100000));
	jobsList.add(new Job ("BA", "Leidos", 98000));
	jobsList.add(new Job("Senior QA Tester", "Delta", 150000));
	System.out.println(jobsList);
	
	double maxSalary = 0;
	int highestIdx = -1;
	for (int i = 0; i < jobsList.size(); i++) {
		if (jobsList.get(i).getAnnualSalary() > maxSalary) {
			maxSalary = jobsList.get(i).getAnnualSalary();
			highestIdx = i;
		}
	}
	Job bestJob = jobsList.get(highestIdx);
	System.out.println("Highest Salary: " + bestJob.toString());
}
}
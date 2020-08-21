package codeSmells.employee;

import java.util.EnumSet;

public abstract class Employee {
	protected EnumSet<Job> jobs;
	private int jobsDone = 0;
	private int jobsSkipped = 0;

	int jobsDoneCount() {
		return jobsDone;
	}

	int jobsSkippedCount() {
		return jobsSkipped;
	}

	void performJob(Job job) {
		if (responsibilities().contains(job))
			jobsDone++;
		else
			jobsSkipped++;
	}

	EnumSet<Job> responsibilities(){
		return jobs;
	}
}

package codeSmells.employee;

import java.util.EnumSet;

class Programmer extends Employee {
	private int jobsDone = 0;
	private int jobsSkipped = 0;

	int jobsDoneCount() {
		return jobsDone;
	}
	
	int jobsSkippedCount() {
		return jobsSkipped;
	}

	void performJob(Job job) {
		EnumSet<Job> acceptableWork = EnumSet.of(Job.TEST, Job.PROGRAM, Job.INTEGRATE, Job.DESIGN);
		if (acceptableWork.contains(job))
			jobsDone++;
		else
			jobsSkipped++;
	}
}

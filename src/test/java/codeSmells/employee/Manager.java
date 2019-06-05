package codeSmells.employee;

import java.util.EnumSet;

class Manager extends Employee {
	private int jobsCompleted = 0;
	private int jobsSkipped = 0;

	int jobsCompletedCount() {
		return jobsCompleted;
	}
	
	int jobsSkippedCount() {
		return jobsSkipped;
	}

	void performJob(Job job) {
		if (responsibilities().contains(job))
			jobsCompleted++;
		else
			jobsSkipped++;
	}
	
	private EnumSet<Job> responsibilities() {
		return EnumSet.of(Job.MANAGE, Job.MARKET, Job.SELL);
	}
}

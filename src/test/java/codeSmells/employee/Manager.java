package codeSmells.employee;

import java.util.EnumSet;

class Manager extends Employee {
	EnumSet<Job> responsibilities() {
		return EnumSet.of(Job.MANAGE, Job.MARKET, Job.SELL);
	}
}

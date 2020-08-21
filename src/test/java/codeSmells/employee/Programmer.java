package codeSmells.employee;

import java.util.EnumSet;

class Programmer extends Employee {
	EnumSet<Job> responsibilities() {
		return EnumSet.of(Job.TEST, Job.PROGRAM, Job.INTEGRATE, Job.DESIGN);
	}
}

package Kodlama.io.buisness;

import Kodlama.io.core.logging.Logger;
import Kodlama.io.dataAccess.InstructorDao;
import Kodlama.io.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers1;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers1) {

		this.instructorDao = instructorDao;
		this.loggers1 = loggers1;

	}

	public void add(Instructor instructor) throws Exception {
		if (instructor.getTc() < 12) {
			throw new Exception("HATA! Aynı TC ile başka eğitmen olamaz.");
		}
		instructorDao.add(instructor);

		for (Logger logger : loggers1) {
			logger.log(instructor.getName());
		}
	}
}

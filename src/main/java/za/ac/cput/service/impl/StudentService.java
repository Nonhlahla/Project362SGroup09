package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Student;
import za.ac.cput.repository.StudentRepository;
import za.ac.cput.service.IStudentService;


@Service
public class StudentService implements IStudentService {

    //Attributes
        @Autowired
        private StudentRepository repository;
        private static StudentService service = null;

    //Singleton
        public static StudentService getService() {

            if(service == null)
            {
                service = new StudentService();
            }

            return service;
        }

    @Override
    public boolean saveStudentDetails(Student student) {
        if(student != null)
        {
            this.repository.save(student);
            return true;
        }

        return false;
    }
}

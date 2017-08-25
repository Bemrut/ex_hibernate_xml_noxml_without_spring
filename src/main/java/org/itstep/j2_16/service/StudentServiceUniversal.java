package org.itstep.j2_16.service;

import java.util.List;
import org.itstep.j2_16.dao.StudentDao;
import org.itstep.j2_16.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceUniversal implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public StudentServiceUniversal(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }
}

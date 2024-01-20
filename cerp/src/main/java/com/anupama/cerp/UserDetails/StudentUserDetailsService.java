package com.anupama.cerp.UserDetails;

import com.anupama.cerp.entities.Student;
import com.anupama.cerp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class StudentUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        optional<?> : object that may or may not contain a non-null value , to avoid nullpointerexc
        Optional<Student> student = studentRepository.findByEmail(username);
        return student.map(StudentUserDetails::new).orElse(null);
    }
}

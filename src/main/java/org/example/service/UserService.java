package org.example.service;

import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private final List<User> userList = new ArrayList<>();

    @Override
    public void create(User user) {
        int countStudent = 0;
        int countTeatcher = 0;
        for (User element : userList) {
            if (element instanceof Student) {
                countStudent++;
            } else {
                countTeatcher++;
            }
        }
        if (user instanceof Student) {
            ((Student) user).setStudentId(countStudent+1);
        }
        if (user instanceof Teacher) {
            ((Teacher) user).setTeacherId(countTeatcher+1);
        }
        userList.add(user);
    }

    @Override
    public User read(Integer id) {
        for (User user : userList) {
            if (user instanceof Student && ((Student) user).getStudentId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}

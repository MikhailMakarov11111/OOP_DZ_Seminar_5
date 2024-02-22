package org.example.controller;

import org.example.entity.Student;
import org.example.entity.StudyGroup;
import org.example.entity.Teacher;
import org.example.service.StudyGroupService;
import org.example.service.UserService;
import org.example.view.StudyGroupView;

public class Controller {
    private UserService service;
    private StudyGroupService groupServise;
    private StudyGroupView view;

    public void ran() {
        Student student1 = new Student("21.04.1998", "Ivanov Ivan Ivanovich", 1);
        Student student2 = new Student("01.03.2000", "Petrov Igor Aleksandrovich", 2);
        Student student3 = new Student("10.09.2001", "Sidorov Sergey Ivanovich", 3);
        Student student4 = new Student("19.02.1998", "Krilov Vladislav Petrovich", 4);
        Student student5 = new Student("21.11.1999", "Ivanov Mikhail Igorevich", 5);
        Student student6 = new Student("27.01.1999", "Titov Ivan Ivanovich", 6);

        Teacher teatcher1 = new Teacher("23.11.1976", "Pavlov Artem Vladimirivich", 1);
        Teacher teatcher2 = new Teacher("21.06.1992", "Ivanov Ivan Vladimirivich", 2);

        service.create(student1);
        service.create(student2);
        service.create(student3);
        service.create(student4);
        service.create(student5);
        service.create(student6);

        service.create(teatcher1);
        service.create(teatcher2);

        groupServise.creatGroupStudy(415, teatcher1, student1, student2, student3);
        groupServise.creatGroupStudy(312, teatcher2, student3, student4, student3);

        StudyGroup result = groupServise.read(1);
        view.printGroup(result);

    }

    public Controller() {
        groupServise = new StudyGroupService();
        service = new UserService();
        view = new StudyGroupView();
    }
}

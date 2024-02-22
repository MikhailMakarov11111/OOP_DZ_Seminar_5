package org.example.service;

import org.example.entity.Student;
import org.example.entity.StudyGroup;
import org.example.entity.Teacher;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService implements DataServiseGroup {
    private final List<StudyGroup> groupList = new ArrayList<>();
    public StudyGroup creatGroupStudy(Integer numId, Teacher teacher, Student... students) {
        List<Student> groupStudy = new ArrayList<>();
        for (Student student : groupStudy) {
            groupStudy.add(student);
        }
        return new StudyGroup(numId, teacher, groupStudy);
    }


    @Override
    public void creat(StudyGroup studyGroup) {
        int countGroup = 0;
        for (StudyGroup element : groupList) {
            if (element instanceof StudyGroup) {
                countGroup++;
            }
        }
        if (studyGroup instanceof StudyGroup) {
            (studyGroup).setGroupId(countGroup+1);
        }
        groupList.add(studyGroup);
    }

    @Override
    public StudyGroup read(Integer Id) {
        for (StudyGroup studyGroup : groupList) {
            if (studyGroup instanceof StudyGroup && (studyGroup).getGroupId().equals(Id)) {
                return studyGroup;
            }
        }
        return null;
    }
}

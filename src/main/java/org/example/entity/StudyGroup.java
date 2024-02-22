package org.example.entity;

import java.util.List;

public class StudyGroup {
    private Integer groupId;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Integer groupId, Teacher teacher, List<Student> students) {
        this.groupId = groupId;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupId=" + groupId +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}

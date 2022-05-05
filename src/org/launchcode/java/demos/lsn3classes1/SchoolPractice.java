package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {
        Student myStudent = new Student("KB",99,1,4.0);


        class Course {
            String courseName;
            ArrayList lectureTopics;
            HashMap students;

            public String getCourseName(){
                return courseName;
            }
            public void setCourseName(String aCourseName){
                courseName = aCourseName;
            }

            public ArrayList getLectureTopics(){
                return lectureTopics;
            }
            public void setLectureTopics(String aLectureTopic){
                lectureTopics.add(aLectureTopic);
            }

            public HashMap getStudents() {
                return students;
            }

            public void setStudents(Student studentEx) {
                students.put(studentEx.getStudentId(), studentEx);
            }
        }
    }
}

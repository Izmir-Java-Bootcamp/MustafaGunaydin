package HW3;

import java.util.Arrays;

public class Course {
    private String name;
    private Student[] students;
    private int capacity=40;
    private int numberOfStudents;
    public String Course;

    public Course(String Course, int capacity) {
        this.Course = Course;
        this.capacity = capacity;

    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean addStudent(Student student){
        int i = 0;
        while(numberOfStudents < capacity){
            if (student.equals(students[i])){
                return false;
            }
            students[numberOfStudents] = student;
            numberOfStudents++;
            i++;
            return true;
        }
        return false;

    }

    public boolean dropStudent(Student student){
        for(int i = 0;i<numberOfStudents;i++){
            if (student.equals(students[i])){
                students[i]=null;
                while (i < numberOfStudents){
                    students[i] = students[i+1];
                    i++;
                }
                numberOfStudents--;
                return true;
            }
        }
        return false;
    }


    public void increaseCapacity(){
        capacity+=5;
    }

    public Student getBestStudent(){
        Student bestStudent = students[0];
        for(int i=1; i < numberOfStudents; i++){
            if(students[i].getGpa() > students[i-1].getGpa())
                bestStudent = students[i];
        }
        return bestStudent;

    }

    public Student getYoungestStudent(){

        Student youngestStudent = students[0];
        for(int i = 0; i < numberOfStudents - 1; i++){
            if((students[i].getPd().getBirthDate()).compareTo(students[i+1].getPd().getBirthDate()) < 0)
                youngestStudent = students[i];
            else if(students[i].getPd().getBirthDate().compareTo(students[i+1].getPd().getBirthDate()) > 0)
                youngestStudent = students[i + 1];
        }
        return youngestStudent;

    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {

            Arrays.fill(students, null);
        }
    }


    public void list(){
        for(int i = 0;i<students.length;i++){

            System.out.println(students[i]);
        }
    }



}

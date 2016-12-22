package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

import pk.edu.nust.seecs.gradebook.dao.*;
import pk.edu.nust.seecs.gradebook.entity.*;






/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {
//CLO
public static void addclo(CloDao obj){

        // Add new clo
        Clo clo = new Clo();
        clo.setName("CLO 1");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("2");
        obj.addClo(clo);

}

public static void updateclo(CloDao obj){
            Clo clo = new Clo();
            //update clo
            obj.updateClo(clo);

}
//CONTENT
public static void addcontent(ContentDao obj){
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();
        // Add new content
App a;
CourseDao coursedao=new CourseDao();
Course c=addcourse(coursedao);
        Content content = new Content();
        content.setTitle("CLO 1");
        content.setDescription("Design efficient solutions for algorithmic problems");
        content.setStarttime(date);
        content.setCourse(c);
        content.setEndtime(null);
        obj.addContent(content);

}

public static void updatecontent(ContentDao obj){
    //update content
        Content content = new Content();
            obj.updateContent(content);

}
//COURSE
public static Course addcourse(CourseDao obj){
    //add course
    
    //create date object for current time
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
            Course course = new Course();
            course.setClasstitle("CLO 1");
            course.setStartsOn(date);
            course.setEndsOn(date);
            course.setCreditHours(10);
            
            // create a hash set
      HashSet hs = new HashSet();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
            course.setContents(hs);
            obj.addCourse(course);
            return course;

}
public static void updatecourse(CourseDao obj){
            Course course = new Course();
            obj.updateCourse(course);
}

//GRADE
public static void addgrade(GradeDao obj){
     // Add new grade
        Content content = new Content();

        Grade grade = new Grade();
        grade.setName("CLO 1");
        grade.setScore(2);
        grade.setContentItem(content);
        obj.addGrade(grade);
}
public static void updategrade(GradeDao obj){
        Grade grade = new Grade();
        obj.updateGrade(grade);
}

//STUDENT
public static void addstudent(StudentDao obj){
Student student=new Student();
student.setName("hello");
// create a hash set
      HashSet hs = new HashSet();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
student.setCourses(hs);
obj.addStudent(student);
}
public static void updatestudent(StudentDao obj){
Student student=new Student();
obj.updateStudent(student);

}
//TEACHER
public static void addteacher(TeacherDao obj){
    Teacher teacher=new Teacher();
teacher.setName("hello");
// create a hash set
      HashSet<Course> hs = new HashSet();
      Course c= getcourse
      
      // add elements to the hash set
      hs.add();
      
teacher.setCourses(hs);
obj.addTeacher(teacher);
}
public static void updateteacher(TeacherDao obj){
        Teacher teacher=new Teacher();
        obj.updateTeacher(teacher);


}
    public static void main(String[] args) {
            CloDao clodao = new CloDao();
            ContentDao contentdao = new ContentDao();
            CourseDao coursedao = new CourseDao();
            GradeDao gradedao = new GradeDao();
            StudentDao studentdao=new StudentDao();
            TeacherDao teacherdao=new TeacherDao();


//for clo
            addclo(clodao);
            updateclo(clodao);
//for content
            addcontent(contentdao);
            updatecontent(contentdao);
//for courses
            addcourse(coursedao);
            updatecourse(coursedao);
//for grades
            addgrade(gradedao);
            updategrade(gradedao);
//for students
            addstudent(studentdao);
            updatestudent(studentdao);
//for teachers
            addteacher(teacherdao);
            updateteacher(teacherdao);
        // Delete an existing clo
        //dao.deleteClo(1);

        // Get all clos
        for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clodao.getCloById(1));

        
    }

}
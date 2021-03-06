/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

class AppTest { 
    ArrayList<String> students;
    ArrayList<Integer> scores;
    int limitation;
    int standard_deviation;
    @Test void studentsNull(){
        students = null;
        scores = new ArrayList<>();
        for(int i = 0;i < 10;i++)
            scores.add(i);
        limitation = 60;
        standard_deviation = 5;
        String message = "Please enter some student/score inputs";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
        
    }
    @Test void scoresNull(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = null;
        limitation = 60;
        standard_deviation = 5;
        String message = "Please enter some student/score inputs";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
    }
    @Test void scoresNegative(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = new ArrayList<>();
        scores.add(10);
        scores.add(-20);
        limitation = 60;
        standard_deviation = 5;
        String message = "Please enter valid positive scores";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
    }
    @Test void limitation_isNegative(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = new ArrayList<>();
        scores.add(10);
        scores.add(20);
        limitation = -10;
        standard_deviation = 5;
        String message = "Please enter valid positive limitation";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
    }
    @Test void limitation_isAbove100(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = new ArrayList<>();
        scores.add(10);
        scores.add(20);
        limitation = 110;
        standard_deviation = 5;
        String message = "Please enter valid positive limitation";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
    }
    @Test void standardDeviation_isNegative(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = new ArrayList<>();
        scores.add(20);
        scores.add(40);
        limitation = 60;
        standard_deviation = -5;
        String message = "Please enter valid positive standard deviation";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
    }
    @Test void standardDeviation_isAbove100(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = new ArrayList<>();
        scores.add(20);
        scores.add(40);
        limitation = 60;
        standard_deviation = 105;
        String message = "Please enter valid positive standard deviation";
        assertEquals(message, App.orderAndScoreStudents(students, scores, limitation, standard_deviation));
    }
    @Test void Students_biggerThan_Scores(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        students.add("busra genc");
        scores = new ArrayList<>();
        scores.add(20);
        scores.add(70);
        limitation = 60;
        standard_deviation = 5;
        String message = App.orderAndScoreStudents(students, scores, limitation, standard_deviation);
        if(message.contains("There is not score information about the student"))
            assertTrue(true);
        else    
            assertTrue(false);
    }
    @Test void Scores_biggerThan_students(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        scores = new ArrayList<>();
        scores.add(20);
        scores.add(80);
        scores.add(50);
        limitation = 60;
        standard_deviation = 5;
        String message = App.orderAndScoreStudents(students, scores, limitation, standard_deviation);
        if(message.contains("There is not student who takes"))
            assertTrue(true);
        else    
            assertTrue(false);
    } 
    @Test void Scores_equals_students(){
        students = new ArrayList<>();
        students.add("alperen yilmaz");
        students.add("murat genc");
        students.add("busra kerdonmez");
        scores = new ArrayList<>();
        scores.add(66);
        scores.add(82);
        scores.add(76);
        limitation = 60;
        standard_deviation = 5;
        String message = App.orderAndScoreStudents(students, scores, limitation, standard_deviation);
        if(message.contains("There is not score information about the student"))
            assertTrue(false);
        else if(message.contains("There is not student who takes"))
            assertTrue(false);
        else 
            assertTrue(true);
    }
}

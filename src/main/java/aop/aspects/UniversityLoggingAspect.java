package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetstudentsLoggingAdvice(){
//        System.out.println("beforeGetstudentsLoggingAdvice: логируем " +
//                "получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetstudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//        System.out.println("afterReturningGetstudentsLoggingAdvice: логируем " +
//                "получение списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(value = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetstudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetstudentsLoggingAdvice:  логируем " +
//                "выброс исключения" + exception);
//    }


    @After("execution(* getStudents())")
        public void afterGetStudentsLoggingAdvice(){
            System.out.println("afterGetStudentsLoggingAdvice: логируем " +
                    "нормальное окончание работы метода или выброс исключения ");
        }

}

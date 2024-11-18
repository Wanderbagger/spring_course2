package aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetstudentsLoggingAdvice(){
        System.out.println("beforeGetstudentsLoggingAdvice: логируем " +
                "получение списка студентов перед методом getStudents");
    }

    @AfterReturning
    public void afterReturningGetstudentsLoggingAdvice(){
        System.out.println("beforeGetstudentsLoggingAdvice: логируем " +
                "получение списка студентов после работы метода getStudents");
    }
}

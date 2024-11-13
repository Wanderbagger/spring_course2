package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUnilabrary() {
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){
    }

    @Pointcut("allMethodsFromUnilabrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary(){
        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice: Log #10");
    }

    //    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUnilabrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUnilabrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUnilabrary() || allReturnMethodsFromUnilabrary()")
//    private void allGetAndReturnMethodsFromUnilabrary(){
//
//    }
//
//
//    @Before("allGetMethodsFromUnilabrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUnilabrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUnilabrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){
//
//    }
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: Попытка получить книгу/журнал");
//    }
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книги/журнала");
//    }
}

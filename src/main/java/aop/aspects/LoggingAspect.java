package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilabrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){
//    }
//
//    @Pointcut("allMethodsFromUnilabrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice: Log #10");
//    }

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


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod()" + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге - " +
                                    myBook.getName() + ", автор - " + myBook.getAuthor() +
                            ", автор - " + myBook.getYearOfPublication()
                    );
                } else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавил " + obj);
                }
            }
        }


        System.out.println("beforeGetLoggingAdvice: логирование" +
                " попытки получить книгу/журнал");
        System.out.println("----------------------------------------------");
    }

}

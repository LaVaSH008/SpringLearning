package ru.lavash.springIIntroduction.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class LoggingAspect {

    //This is creating pointcut for advices
    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    //This advice for classes with method getBook()
    //@Before("execution(public void getBook())")
    //This advice for class UniLibrary with method getBook()
    //@Before("execution(public void ru.lavash.springIIntroduction.aop.lesson1.UniLibrary.getBook())")
    //This advice for class with method who start on get...()
    //@Before("execution(public void get*())")
    //This advice for method with param
    //@Before("execution(public void getBook(String))")
    //This advice for methods with many params
    //@Before("execution(public void getBook(..))")
    //This advice for methods with custom object in param
    //@Before("execution(public void getBook(ru.lavash.springIIntroduction.aop.lesson2.Book))")
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
    }

    //This advice for all return type
    //@Before("execution(public * returnBook())")
    //This advice for all access modifier
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }
}

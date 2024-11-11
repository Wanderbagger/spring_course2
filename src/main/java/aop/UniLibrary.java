package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("Мы берем книгу из Unilibrary");
    }
    public void getMagazine(){
        System.out.println("Мы берем журнал из Unilibrary");
    }

    protected String returnBook(){
        System.out.println("Мы возвращаем книгу в Unilibrary");
        return "OK";
    }

}

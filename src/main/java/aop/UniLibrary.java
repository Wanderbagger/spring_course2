package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из Unilibrary ");
        System.out.println("----------------------------------------------");
    }


    public void getMagazine() {
        System.out.println("Мы берем журнал из Unilibrary");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в Unilibrary");
        System.out.println("----------------------------------------------");
        int a = 10/0;

        return "Война и мир";
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в Unilibrary");
        System.out.println("----------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в Unilibrary ");
        System.out.println("----------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в Unilibrary ");
        System.out.println("----------------------------------------------");
    }
}

package lesson_24.interfaces;


import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Presentation implements ColorPrintable {

    String title;
    String author;
    String theme;
    int pages;

    public Presentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю презентацию в типографию.");
        System.out.printf("Printing presentation in colors: author %s, title: %s\n", author, title);
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}
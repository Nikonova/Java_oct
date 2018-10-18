package ru.stqa.oct.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

       hello("world");
       hello("user");
       hello("Svetlana");

       Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

       Rectangle r = new Rectangle(4, 6 );
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

       Point d = new Point(5,5,4,4);
        System.out.println("Расстояние между точками " + " A(" + d.x1 + "," + d.y1 + ")" + " и " + " B(" + d.x2 +"," + d.y2 + ")"+ " = " + d.area());
    }

    public static void hello(String somebody) {
                System.out.println("Hello, " + somebody + "!");
    }


    }

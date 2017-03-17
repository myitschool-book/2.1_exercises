package ru.samsung.itschool.book;
 
import java.util.Scanner;
 
public class Point {
        // координаты точки
        double x,y;
		private Scanner in;
 
        // Метод выводящий точку на экран в формате: (x;y)
        void printPoint() {
                System.out.println("("+x+"; "+y+")");
        }
 
        // Метод перемещающий точку на dx и dy
        void move(double dx, double dy) {
                x += dx;
                y += dy;
        }
 
        // Метод для задания новых координат точки 
        void input() {
                in = new Scanner(System.in);
                System.out.print("Enter x: ");
                double x = in.nextDouble();
                System.out.print("Enter y: ");
                double y = in.nextDouble();
                move(x,y);
        }
 
        // Метод вычисления расстояния между точками
        double getDistance(Point a) {
                return Math.sqrt( Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2) );
        }
 
        public static void main(String [] args){
                Point p1 = new Point();
                Point p2 = new Point();
 
                p1.input();
                System.out.println("Point 1:");
                p1.printPoint();
 
                p2.input();
                System.out.println("Point 2:");
                p2.printPoint();
 
                System.out.println("Distanse:" + p1.getDistance(p2));
 
                p1.move(1, 2);
 
                System.out.println("Point 1 after move:");
                p1.printPoint();
 
                System.out.println("New distanse:" + p1.getDistance(p2));
        }
}
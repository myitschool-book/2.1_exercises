package samsung.itschool.book;

import java.util.Scanner;

public class Point {
    double x,y;

    void printPoint() {
            System.out.println("("+x+"; "+y+")");
    }

    void move(double dx, double dy) {
            x += dx;
            y += dy;
    }

    void input() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter x: ");
            double x = in.nextDouble();
            System.out.print("Enter y: ");
            double y = in.nextDouble();
            move(x,y);
    }

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
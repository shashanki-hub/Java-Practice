//Write a program that solves the following equation and displays the value x and y: 1)3.4x+50.2y=44.5 2)2.1x+55y=5.9(assume cramer’s rule to solve equation ax+by=e and cx+dy=f) Where x=ed-bf/ad-bc y=af-ec/ad-bc 

public class CramerRule {
    public static void main(String[] args) {

        double a = 3.4, b = 50.2, c = 2.1;
        double d = 0.55, e = 44.5, f = 5.9;

        System.out.println("a=3.4,\nb=50.2,\nc=2.1,\nd=0.55,\ne=44.5,\nf=5.9;");

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("The result of equation 1 is (e*d-b*f)/(a*d-b*c) is :- " + x);
        System.out.println("The result of equation 2 is (a*f-e*c)/(a*d-b*c) is :- " + y);
    }
}
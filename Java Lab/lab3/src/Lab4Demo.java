package lab4;

import lab3.Movie;
import lab3.SpecialMovie;
import lab3.InternationalMovie;

interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class BaseClass {
    public void baseMethod() {
        System.out.println("BaseClass method");
    }
}

class DerivedClass extends BaseClass implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("print() implementation");
    }

    @Override
    public void show() {
        System.out.println("show() implementation");
    }

    public void derivedSpecific() {
        System.out.println("DerivedClass specific method");
    }
}

public class Lab4Demo {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic", "Fox", "James Cameron", 195, 1997, "Romance");
        SpecialMovie specialMovie1 = new SpecialMovie("Avatar", "Fox", "Dolby Atmos", "RealFlow");
        InternationalMovie internationalMovie1 = new InternationalMovie("Amélie", "Claudie Ossard", "France", "French");

        Movie[] movies = {movie1, specialMovie1, internationalMovie1};

        for (Movie m : movies) {
            System.out.println(m.showDetails());

            if (m instanceof SpecialMovie) {
                SpecialMovie sm = (SpecialMovie) m;
                System.out.println("SpecialMovie extra details:");
                System.out.println(sm.showDetails());
            } else if (m instanceof InternationalMovie) {
                InternationalMovie im = (InternationalMovie) m;
                System.out.println("InternationalMovie extra details:");
                System.out.println(im.showDetails());
            }
            System.out.println();
        }

        DerivedClass derivedObj = new DerivedClass();
        Printable printableRef = derivedObj;
        printableRef.print();

        Showable showableRef = derivedObj;
        showableRef.print();
        showableRef.show();

        derivedObj.baseMethod();
        derivedObj.derivedSpecific();
    }
}

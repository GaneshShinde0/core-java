package com.ganesh.basic.advance.polymorphism.polymorph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movie theMovie = new Adventure("Toy Story");
        // Here as we are using new Adventure() at run time method from Adventure is executed and not from Movie().
        theMovie.watchMovie();

        Movie theMovie1 = Movie.getMovie("Science","Star Wars");
        theMovie1.watchMovie();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q for Quit :)");
            String type = sc.nextLine();

            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}

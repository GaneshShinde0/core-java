package com.ganesh.basic.advance.collections.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("He","","llo");
        String dText = "Hell".concat("o");
        String eText ="hello";
        String fText = new String("Hello");
        List<String> hellos = Arrays.asList(aText,bText, cText, dText, eText,fText);
        hellos.forEach(s->System.out.println(s+": "+s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = "+mySet);
        System.out.println("# of elemets = "+mySet.size());

        for(String setValue: mySet){
            System.out.print(setValue+": ");
            for(int i=0; i<hellos.size();i++){
                if(setValue == hellos.get(i)){
                    System.out.print(i+", ");
                }
            }
            System.out.println(" ");
        }

        PlayingCard aceOfHearts = new PlayingCard("Hearts","Ace");
        PlayingCard kingOfClubs = new PlayingCard("King","Clubs");
        PlayingCard queenOfSpaces = new PlayingCard("Queen","Spades");

        List<PlayingCard> cardsA = Arrays.asList(aceOfHearts,kingOfClubs,queenOfSpaces);
        cardsA.forEach(s->System.out.println(s+": "+s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();

        for(PlayingCard c: cardsA){
            if(!deck.add(c)){
                System.out.println("Found a duplicate for "+c);
            }
        }
        System.out.println(deck);
        Set<PlayingCard> cardsSetA = new HashSet<> (Arrays.asList(aceOfHearts,kingOfClubs,queenOfSpaces));
        Set<PlayingCard> cardsSetB = new HashSet<> (Arrays.asList(aceOfHearts, new PlayingCard("Jack","Diamonds")));
        System.out.println("Union of A and B");
        cardsSetA.addAll(cardsSetB);
        System.out.println(cardsSetA.toString());

        cardsSetA = new HashSet<> (Arrays.asList(aceOfHearts,kingOfClubs,queenOfSpaces));
        System.out.println("Itersection of A and B");
        cardsSetA.retainAll(cardsSetB);
        System.out.println(cardsSetA.toString());

        cardsSetA = new HashSet<> (Arrays.asList(aceOfHearts,kingOfClubs,queenOfSpaces));
        System.out.println("A - B :");
        cardsSetA.removeAll(cardsSetB);
        System.out.println(cardsSetA.toString());

        cardsSetA = new HashSet<> (Arrays.asList(aceOfHearts,kingOfClubs,queenOfSpaces));
        Set<PlayingCard> AMinusB = new HashSet<> (Arrays.asList(aceOfHearts,kingOfClubs,queenOfSpaces));
        System.out.println("Symmetric Difference (A - B) U (B-A) :");
        AMinusB.removeAll(cardsSetB);
        System.out.println(AMinusB.toString());
        Set<PlayingCard> BMinusA = new HashSet<> (cardsSetB);
        BMinusA.removeAll(cardsSetA);
        System.out.println(BMinusA.toString());
        AMinusB.addAll(BMinusA);
        System.out.println(AMinusB.toString());

    }
}

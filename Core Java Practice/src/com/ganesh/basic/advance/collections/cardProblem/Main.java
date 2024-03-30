package com.ganesh.basic.advance.collections.cardProblem;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray),"Aces of Hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = "+cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13,aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces Of Hearts",1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingsOfClubs = Collections.nCopies(13,kingOfClubs);
        Card.printDeck(kingsOfClubs,"Kings of Clubs",1);

        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces Added",1);

        Collections.copy(cards,kingsOfClubs);
        Card.printDeck(cards, "Card Collection with kings Copied",1);

        Card.printDeck(cards, "List Copy Of Kings",1);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy Of Kings",1);

        deck = Card.getStandardDeck();
        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled Deck", 4);

        deck = Card.getStandardDeck();
        Collections.reverse(deck);
        Card.printDeck(deck,"Reversed Deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck,sortingAlgorithm);
        Card.printDeck(deck,"Standard Deck sorted bhy rank, suit",13);

        Collections.reverse(deck);
        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings,"Kings in deck",1);

        int subListIndex = Collections.indexOfSubList(deck,kings);
        System.out.println("Sublist index for kings = "+subListIndex);
        System.out.println("Contains = "+deck.containsAll(kings));

        Collections.shuffle(deck);
        subListIndex = Collections.indexOfSubList(deck,kings);
        System.out.println("Sublist index for kings = "+subListIndex);
        System.out.println("Contains = "+deck.containsAll(kings));

        Collections.shuffle(deck);
        subListIndex = Collections.indexOfSubList(deck,kings);
        System.out.println("Sublist index for kings = "+subListIndex);
        System.out.println("Contains = "+ new HashSet<>(deck).containsAll(kings));

        boolean disjoint = Collections.disjoint(deck,kings);
        System.out.println("Disjoint = "+disjoint);

        Collections.sort(deck,sortingAlgorithm);
        //deck.sort(sortingAlgorithm)
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck,tenOfHearts,sortingAlgorithm);
        System.out.println("Found Index = "+ foundIndex);
        System.out.println("Found Index = "+deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB,10);
        Collections.replaceAll(deck,tenOfClubs,tenOfHearts);
        Card.printDeck(deck.subList(32,36),"Tens Row",1);

        if (Collections.replaceAll(deck, tenOfHearts,tenOfClubs)){
            System.out.println("Tens of hearts replaced with tens of clubs");
        } else {
            System.out.println("No Tens of hearts found in the list");
        }

        System.out.println("Tens of Clubs Cards ="+Collections.frequency(deck,tenOfClubs));

        System.out.println("Best Card = "+Collections.max(deck,sortingAlgorithm));
        System.out.println("Worst Card = "+Collections.min(deck,sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck,"Sorted by Suit, Rank",4);
        
        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,2);
        System.out.println("Un Rotated: "+deck.subList(0,13));
        System.out.println("Rotated 2 : "+ copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,-2);
        System.out.println("Un Rotated: "+deck.subList(0,13));
        System.out.println("Rotated 2 : "+ copied);

        copied = new ArrayList<>(deck.subList(0,13));
        for(int i =0;i<copied.size()/2;i++){
            Collections.swap(copied, i, copied.size()-1-i);
        }

        System.out.println("Manual Reverse :"+ copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.reverse(copied);
        System.out.println("Using reverse: "+copied);

    }
}

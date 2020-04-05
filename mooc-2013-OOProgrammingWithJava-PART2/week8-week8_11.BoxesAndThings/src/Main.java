public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box(10);
//        Box box2 = new Box(20);
        Box box3 = new Box(30);
//
        box3.add( new Book("Fedor Dostojevski", "Crime and Punishment", 5) ) ;
        box3.add( new Book("Robert Martin", "Clean Code", 3) );
//        box1.add( new Book("Kent Beck", "Test Driven Development", 2) );
//
//        box2.add( new Book("Fedor Dostojevski", "Crime and Punishment", 10) ) ;
//        box2.add( new Book("Robert Martin", "Clean Code", 6) );
//        box2.add( new Book("Kent Beck", "Test Driven Development", 4) );
//
//        box2.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
//        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
//        box2.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        box3.add(box3);

        System.out.println( box3 );

    }
}

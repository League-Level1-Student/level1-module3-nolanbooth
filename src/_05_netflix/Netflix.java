package _05_netflix;

public class Netflix {

public static void main(String[]args) {
	Movie movie = new Movie("Inception", 5);	
	Movie movie2 = new Movie("Martian", 5);
	Movie movie3 = new Movie("Life of Pi", 5);
	Movie movie4 = new Movie("The Polar Express", 4);
	Movie movie5 = new Movie("The addams family", 1);

	System.out.println(movie.getTicketPrice());
System.out.println(movie2.getTicketPrice());
System.out.println(movie3.getTicketPrice());
System.out.println(movie4.getTicketPrice());
System.out.println(movie5.getTicketPrice());
NetflixQueue queue = new NetflixQueue();
queue.addMovie(movie);
queue.addMovie(movie2);
queue.addMovie(movie3);
queue.addMovie(movie4);
queue.printMovies();
System.out.println("the best movie is "+queue.getBestMovie());
queue.sortMoviesByRating();
System.out.println("the second best movie is "+queue.getMovie(1));

}
	
}

package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "아주 기가 막힙니다.";


        MovieReview movie2 = new MovieReview();
        movie2.title = "인셉션";
        movie2.review = "아주 기가 막힙니다.";

        MovieReview[] movieReviews = new MovieReview[]{movie1, movie2};


        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목: " + movieReview.title + " 리뷰: " + movieReview.review);

        }
    }
}

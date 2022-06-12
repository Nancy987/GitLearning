
class Movie {
    private String title;
    private String studio;
    private String rating;
    Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public Movie[] getPG(Movie[] mov){
        Movie[] pgMov = new Movie[mov.length];
        int newArrayindex = 0;
        for(int i=0;i<mov.length;i++){
            if(mov[i].rating=="PG"){
                pgMov[newArrayindex] = mov[i];
                newArrayindex++;
            }
        }
        return pgMov;
    }
}

public class Q39MovieClass {
    public static void main(String[] args) {
        Movie obj = new Movie("Casino Royale","Eon Productions", "PG-13");
//        Movie[] mov = new Movie[3];
//        mov[0].title = "ABC";
    }
}

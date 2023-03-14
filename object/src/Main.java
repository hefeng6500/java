public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("《长津湖》", 9.7, "吴京");
        movies[1] = new Movie("《我和我的父辈》", 9.6, "吴京");
        movies[2] = new Movie("《扑水少年》", 9.5, "王川");

        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println("片名：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }
    }
}
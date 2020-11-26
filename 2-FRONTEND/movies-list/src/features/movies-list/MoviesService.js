export default class MoviesService {
    getMovies() {
        return fetch('/data/movies.json');
    }
}
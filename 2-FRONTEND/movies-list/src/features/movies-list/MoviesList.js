import React, {Component} from 'react';
import MoviesService from './MoviesService';
import MoviesTable from './MoviesTable/MoviesTable';
import SearchBar from './SearchBar/SearchBar';

export default class MoviesList extends Component {

    constructor(props) {
        super(props);
        this.state = {
            movies: []
        };
        this.moviesService = new MoviesService();
    }

    render() {
        return <div>
            <SearchBar />
            <MoviesTable movies={this.state.movies}/>
        </div>
    }

    componentDidMount() {
        this.moviesService.getMovies()
            .then(res => res.json())
            .then(movies => {
                this.setState({
                    movies: movies
                });
            })
            .catch(() => console.error("Cannot load movies. Put data file into /public/data/movies.json"));
    }
}
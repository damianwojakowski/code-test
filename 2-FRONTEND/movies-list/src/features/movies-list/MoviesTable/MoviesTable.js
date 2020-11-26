import React, {Component} from 'react';
import MovieItem from '../MovieItem/MovieItem';

export default class MoviesTable extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        return <div>
            <table className="table table-striped">
                <thead>
                <tr>
                    <th scope="col">Title</th>
                    <th scope="col">Country</th>
                    <th scope="col">Writer</th>
                    <th scope="col">Genre</th>
                </tr>
                </thead>
                <tbody>
                {
                    this.props.movies && this.props.movies.map(movie => <MovieItem key={movie.title} movie={movie} />)
                }
                </tbody>
            </table>
        </div>
    }
}
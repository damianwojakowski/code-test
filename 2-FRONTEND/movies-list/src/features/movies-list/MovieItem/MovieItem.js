import React, {Component} from 'react';

export default class MovieItem extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        return <tr>
            <td>{this.props.movie.title}</td>
            <td>{this.props.movie.country}</td>
            <td>{this.props.movie.writer}</td>
            <td>{this.props.movie.genre}</td>
        </tr>
    }

}
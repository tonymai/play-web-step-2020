import React, { Component } from "react";
import starIcon from './Images/starIcon.svg';

class SingleAppContainer extends Component {
  render() {
    return (
      <>
        <p class="num">{this.props.listNum}</p>
        <img
          class="img-fluid"
          alt="icon 1"
          src={this.props.url}
        />
        <div class="app-details">
          <h6 class="app-title">{this.props.title}</h6>
          <p class="grey-text">{this.props.category} - Category </p>
          <p class="grey-text">
            {this.props.rating}
            <img
              class="rating-star-icon"
              alt="rating star"
              src= {starIcon}
            />
          </p>
        </div>
      </>
    );
  }
}
export default SingleAppContainer;

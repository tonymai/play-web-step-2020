import React, { Component } from "react";
 
class SingleAppContainer extends Component {
  render() {
    return (
      <div>
        <p class="num"> {this.props.listNum} </p>
        <img
          id="app_icon_img"
          class="img-fluid"
          alt="icon 1"
          src={this.props.url}
        />
        <div class="app_details">
          <h6 class="app_title"> {this.props.title} </h6>
          <p class="grey_text"> {this.props.category} - Category </p>
          <p class="grey_text">
            {this.props.rating}
            <img
              id="rating_star_icon"
              width="12px"
              alt="rating star"
              src="https://www.pngkit.com/png/detail/7-78706_free-png-grey-star-png-images-transparent-grey.png"
            />
          </p>
        </div>
      </div>
    );
  }
}
export default SingleAppContainer;
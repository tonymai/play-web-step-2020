import React, { Component } from "react";
import PropTypes from 'prop-types';
import starIcon from '../TopCharts/Images/starIcon.svg';

class SingleCardContainer extends Component {
    render() {
        const {bigImage, title, iconUrl, rating, rated, appDescription} = this.props;
        return (
          <>
            <img class="musicImage" alt="largeImage" src={bigImage} />
            <div class="appCard">
                <img class="img-fluid" alt="appIcon" src={iconUrl} />
                <div class="app-details">
                     <h3 class="app-title">{title}</h3>
                     <div class="grey-text"> 
                      {rating}
                      <img class="rating-star-icon" alt="rating star" src={starIcon} />  
                      {rated}
                     </div>
                     <p class="grey-text">{appDescription}</p>
                </div>
            </div>
          </>
        );
    }
}
export default SingleCardContainer;

SingleCardContainer.propTypes = {
    bigImage: PropTypes.string,
    iconUrl: PropTypes.string,
    title: PropTypes.string,
    rating: PropTypes.number,
    appDescription: PropTypes.string
};

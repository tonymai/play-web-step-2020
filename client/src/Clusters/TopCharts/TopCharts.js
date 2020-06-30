import emptyAppImage from './Images/emptyAppImage.png';
import facebookLogo from './Images/facebookLogo.svg';
import pandoraLogo from './Images/pandoraLogo.png';
import myWeatherLogo from './Images/myWeatherLogo.png';
import React, { Component } from 'react';
import './SingleAppContainer.js';
import SingleAppContainer from './SingleAppContainer.js';
import './TopChartsStyle.css';
import '../styles.css';
import wearOSLogo from './Images/wearOSLogo.png';

 
class TopCharts extends Component {
  render() {
    const makeColumn = item => (
        <div key={item.title}>
            <SingleAppContainer
            listNum={item.listNum}
            url={item.url}
            title={item.title}
            category={item.category}
            rating={item.rating}
            />
        </div>
    );

    const topCharts = { 
      title: "Top Charts",
      cards: [
      {
        listNum: 1,
        url: facebookLogo,
        title: "Messenger",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 2,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 3,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 4,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      }
    ]
    };
 
    const topGrossing = {
      title: "Top Grossing",
      cards: [
      {
        listNum: 1,
        url: pandoraLogo,
        title: "Pandora",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 2,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 3,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 4,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      }
    ]
    };
    
    const trending = {
      title: "Trending",
      cards: [
      {
        listNum: 1,
        url: wearOSLogo,
        title: "Wear OS by Google",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 2,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 3,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 4,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      }
    ]
    };
 
    const topPaid = {
      title: "Top Paid",
      cards: [
      {
        listNum: 1,
        url: myWeatherLogo,
        title: "MyWeather Radar Weather",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 2,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 3,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      },
      {
        listNum: 4,
        url: emptyAppImage,
        title: "App Name",
        category: "Developer",
        rating: 4.6
      }
    ]
    };
 
    return (
      <div className="col-12 bg-light mx-auto text-center">
        <div class="section-header">
          <h4>Top charts</h4>
          <h8>For Wear OS</h8>
        </div>
 
        <div class="col-25">
          <div class="vertical-row">
            <h6 class="chart-categories">Top Free</h6>
            {topCharts.cards.map(makeColumn)}
          </div>
        </div>
 
        <div class="col-25">
          <div class="vertical-row">
            <h6 class="chart-categories">Top Grossing</h6>
            {topGrossing.cards.map(makeColumn)}
          </div>
        </div>
 
        <div class="col-25">
          <div class="vertical-row"> 
            <h6 class="chart-categories">Trending</h6>
            {trending.cards.map(makeColumn)}
          </div>
        </div>
 
        <div class="col-25">
          <div class="vertical-row">
            <h6 class="chart-categories">Top Paid</h6>
            {topPaid.cards.map(makeColumn)}
          </div>
        </div>
      </div>
    );
  }
}
 
export default TopCharts;

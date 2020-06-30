import React, { Component } from 'react';
import SingleAppContainer from './SingleAppContainer.js';
import {topFree} from './mockData.js';
import {topGrossing} from './mockData.js';
import {topPaid} from './mockData.js';
import {trending} from './mockData.js';
import './TopChartsStyle.css';
import '../styles.css';
 
class TopCharts extends Component {
  render() {
    const makeColumn = item => (
        <div key={item.uniqueID}>
            <SingleAppContainer
            listNum={item.listNum}
            url={item.url}
            title={item.title}
            category={item.category}
            rating={item.rating}
            />
        </div>
    );

    return (
      <div className="col-12 bg-light mx-auto text-center">
        <div class="section-header">
          <h4>Top Charts</h4>
          <h8>For Wear OS</h8>
        </div>
 
        <div class="col-25">
          <div class="vertical-row">
            <h6 class="chart-categories">{topFree.title}</h6>
            {topFree.cards.map(makeColumn)}
          </div>
        </div>
 
        <div class="col-25">
          <div class="vertical-row">
            <h6 class="chart-categories">{topGrossing.title}</h6>
            {topGrossing.cards.map(makeColumn)}
          </div>
        </div>
 
        <div class="col-25">
          <div class="vertical-row"> 
            <h6 class="chart-categories">{trending.title}</h6>
            {trending.cards.map(makeColumn)}
          </div>
        </div>
 
        <div class="col-25">
          <div class="vertical-row">
            <h6 class="chart-categories">{topPaid.title}</h6>
            {topPaid.cards.map(makeColumn)}
          </div>
        </div>
      </div>
    );
  }
}
 
export default TopCharts;

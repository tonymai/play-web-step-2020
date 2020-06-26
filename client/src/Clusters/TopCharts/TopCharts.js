import React, { Component } from "react";
import "./SingleAppContainer.js";
import "./TopChartsStyle.css";
import "../styles.css";
import SingleAppContainer from "./SingleAppContainer.js";
 
class TopCharts extends Component {
  render() {
    const makeColumn = item => (
      <div>
        <SingleAppContainer
          listNum={item.listNum}
          url={item.url}
          title={item.title}
          category={item.category}
          rating={item.rating}
        />
      </div>
    );
    console.log("inside");
    const emptyAppImage =
      "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAANwAAADlCAMAAAAP8WnWAAAAElBMVEWytbXQ0tLLzc26vb2vsrLT1dVz9wdHAAABBklEQVR4nO3PARGAMAwAsQ6Gf8voSO/jIPPcWeqeKUcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqpyqnKqcqp9qeO+9a3w8XGAxhjK6uyAAAAABJRU5ErkJggg==";
 
    const topCharts = [
      {
        listNum: 1,
        url: "https://cdn.worldvectorlogo.com/logos/facebook-messenger-3.svg",
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
    ];
 
    const topGrossing = [
      {
        listNum: 1,
        url:
          "https://lh3.googleusercontent.com/MoJxQ-5RA73b3Wffj91crqXUb-C5LKRYCADm11KbfykIkmNbicXGDa3g9X62C_buEg",
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
    ];
 
    const trending = [
      {
        listNum: 1,
        url:
          "https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/2a/24/92/2a249225-7b8d-1ee0-549a-0b09d8f2930d/AppIcon-0-0-1x_U007emarketing-0-0-0-5-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/246x0w.png",
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
    ];
 
    const topPaid = [
      {
        listNum: 1,
        url:
          "https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/50/4f/a6/504fa6fe-d52c-6051-8914-d07d78433567/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/246x0w.png",
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
    ];
 
    return (
      <div className="col-12 bg-light mx-auto text-center">
        <div class="sectionHeader">
          <h4>Top charts</h4>
          <h8>For Wear OS </h8>
        </div>
        <div class="row" id="Top_Charts_Categories">
          <div class="col-sm-3">
            <h6 class="chart_categories"> TOP FREE </h6>
          </div>
          <div class="col-sm-3">
            <h6 class="chart_categories"> TOP GROSSING </h6>
          </div>
          <div class="col-sm-3">
            <h6 class="chart_categories"> TRENDING </h6>
          </div>
          <div class="col-sm-3">
            <h6 class="chart_categories"> TOP PAID </h6>
          </div>
        </div>
 
        <div class="col" id="First_Col">
          <div class="vertical-row">{topCharts.map(makeColumn)}</div>
        </div>
 
        <div class="col" id="Second_Col">
          <div class="vertical-row">{topGrossing.map(makeColumn)}</div>
        </div>
 
        <div class="col" id="Third_Col">
          <div class="vertical-row">{trending.map(makeColumn)}</div>
        </div>
 
        <div class="col" id="Fourth_Col">
          <div class="vertical-row">{topPaid.map(makeColumn)}</div>
        </div>
      </div>
    );
  }
}
 
export default TopCharts;

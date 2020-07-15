import React, {Component} from 'react';
import './App.css';
import TopCharts from './Clusters/TopCharts/TopCharts.js';
import StandardCluster from './Clusters/StandardCluster/standard_cluster.js';
import RecommendedCategories from './Clusters/RecommendedCategories/RecommendedCategories.js';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { text: '' };
  }

  componentDidMount() {
    fetch('/api/v1/test-servlet')
        .then((response) => response.text())
        .then((text) => {this.setState({text})})
  }

  render() {
    return (
      <div className='App'>
        <StandardCluster />
        <TopCharts />
        <RecommendedCategories />
      </div>
    );
  }
}

export default App;

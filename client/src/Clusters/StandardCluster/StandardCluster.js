import React, { Component } from 'react';
import '../styles.css';
import './StandardClusterStyle.css';
import SingleCardContainer from './SingleCardContainer.js';
import {cluster} from './MockData.js';

class StandardCluster extends Component {
    render() {
        const makeRow = item => (
            <div key={item.id}>
                <SingleCardContainer
                bigImage={item.wearOsImage}
                title={item.title}
                iconUrl={item.iconUrl}
                rating={item.rating}
                rated={item.rated}
                appDescription={item.appDescription}
                />
            </div>
        );

        return (
            <div className="section">
                <div className="section-header">
                    <h2>{cluster.title}</h2>
                </div>
                <div className="col">
                    {cluster.cards.map(makeRow)}
                </div>                
            </div>
        );
    }
}

export default StandardCluster;

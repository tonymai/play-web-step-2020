import React from 'react';
import { render, wait }from '@testing-library/react';
import SingleCardContainer from './SingleCardContainer.js';

const renderSingleCardContainer = () =>
    render(
        <SingleCardContainer 
            bigImage="imageUrl"
            title="testCardContainer"
            iconUrl="testIconUrl"
            rating=5
            rated="Everyone"
            appDescription="this is a test"
        />
    );

test('passes correct imageUrl', async () => {
    const { getByText } = renderSingleCardContainer();
    await wait(() => expect(getByText("imageUrl")).toBeInDocument()); 
});

test('passes correct title', async () => {
    const { getByText } = renderSingleCardContainer();
    await wait(() => expect(getByText("testCardContainer")).toBeInDocument()); 
});

test('passes correct iconUrl', async () => {
    const { getByText } = renderSingleCardContainer();
    await wait(() => expect(getByText("testIconUrl")).toBeInDocument()); 
});

test('passes correct rating', async () => {
    const { getByText } = renderSingleCardContainer();
    await wait(() => expect(getByText("5")).toBeInDocument());     
});

test('passes correct rated', async () => {
    const { getByText } = renderSingleCardContainer();
    await wait(() => expect(getByText("Everyone")).toBeInDocument());     
});

test('passes correct appDescription', async () => {
    const { getByText } = renderSingleCardContainer();
    await wait(() => expect(getByText("this is a test")).toBeInDocument());     
});
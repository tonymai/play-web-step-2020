import React from 'react';
// import { FetchMock } from '@react-mock/fetch';
import { findRenderedComponentWithType } from 'react-dom/test-utils';
import { render, wait }from '@testing-library/react';
import App from './App';
import TopCharts from './Clusters/TopCharts/TopCharts.js';
import SingleAppContainer from './Clusters/TopCharts/SingleAppContainer.js';

const renderComponent = () =>
    render(
        <FetchMock
            options={
                { matcher: '/api/v1/test-servlet', method: 'GET', response: "Hello world" }
            }
        >
            <App />
        </FetchMock>
    );

const renderSingleAppContainer = () =>
    render(
        <SingleAppContainer 
            listNum= {1}
            url= {"testURL"}
            title={"Test Title"}
            category={"test"}
            rating={4.5} />
    );

test('verifies fetch is called', async () => {
    const { getByText } = renderComponent();
    await wait(() => expect(getByText("Hello world")).toBeInTheDocument());
})

test('loads and displays greeting', () => {
    const { getByText } = render(<App />);
    const textElement = getByText('Welcome to React');
    expect(textElement).toBeInTheDocument();
})

test('correct column titles', () => {
    const { getByText } = render(<TopCharts />);
    const textElement = getByText('Top Free');
    expect(textElement).toBeInTheDocument();
})

test('passes correct data into SingleAppContainer', async ()=> {
    const { getByText } = renderSingleAppContainer();
    await wait(() => expect(getByText("Test Title")).toBeInTheDocument());
});

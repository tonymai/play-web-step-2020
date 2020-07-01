import SingleAppContainer from './SingleAppContainer.js';


const renderSingleAppContainer = () =>
    render(
        <SingleAppContainer 
            listNum= {1}
            url= {"testURL"}
            title={"Test Title"}
            category={"test"}
            rating={4.5} />
    );


test('passes correct data into SingleAppContainer', async ()=> {
    const { getByText } = renderSingleAppContainer();
    await wait(() => expect(getByText("Test Title")).toBeInTheDocument());
});
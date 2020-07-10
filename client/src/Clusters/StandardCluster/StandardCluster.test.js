import React from 'react';
import { render, wait }from '@testing-library/react';
import StandardCluster from './StandardCluster.js';

test('correct subtitle', () => {
    const { getByText } = render(<MusicApps />);
    const textElement = getByText('Rock out while you work out');
    expect(textElement).toBeInTheDocument();
});

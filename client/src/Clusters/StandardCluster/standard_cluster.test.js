import React from 'react';
import { render, wait }from '@testing-library/react';
import StandardCluster from './standard_cluster.js';

test('correct subtitle', () => {
    const { getByText } = render(<StandardCluster />);
    const textElement = getByText('Rock out while you work out');
    expect(textElement).toBeInTheDocument();
});

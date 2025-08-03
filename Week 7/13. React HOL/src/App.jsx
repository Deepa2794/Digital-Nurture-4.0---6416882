import React from 'react';
import CourseDetails from './Components/CourseDetails.jsx';
import BookDetails from './Components/BookDetails.jsx';
import BlogDetails from './Components/BlogDetails.jsx';

const App = () => {
  return (
    <div style={{
      display: 'flex',
      justifyContent: 'space-evenly',
      padding: '40px',
      fontFamily: 'Arial'
    }}>
      <div style={{ borderRight: '4px solid green', paddingRight: '30px' }}>
        <CourseDetails />
      </div>

      <div style={{ borderRight: '4px solid green', padding: '0 30px' }}>
        <BookDetails />
      </div>

      <div style={{ paddingLeft: '30px' }}>
        <BlogDetails />
      </div>
    </div>
  );
};

export default App;

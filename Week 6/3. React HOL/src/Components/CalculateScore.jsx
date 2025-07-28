import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const student = {
    name: 'Steeve',
    school: 'DNV Public School',
    totalMarks: 284,
    score: '94.67%'
  };

  return (
    <div className="student-container">
      <h1>Student Details:</h1>
      <p><span className="label name">Name:</span> <span className="value name">{student.name}</span></p>
      <p><span className="label school">School:</span> <span className="value school">{student.school}</span></p>
      <p><span className="label total">Total:</span> <span className="value total">{student.totalMarks} Marks</span></p>
      <p><span className="label score">Score:</span> <span className="value score">{student.score}</span></p>
    </div>
  );
}

export default CalculateScore;

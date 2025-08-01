import React from 'react';

function CourseDetails({ courses }) {
  return (
    <div className="section">
      <h1>Course Details</h1>
      {courses.length && courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;

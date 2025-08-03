function CourseDetails() {
  const showCourse = true; // using && conditional rendering

  return showCourse && (
    <div>
      <h2>Course Details</h2>
      <p><strong>Angular</strong></p>
      <p>4/5/2021</p>
      <p><strong>React</strong></p>
      <p>6/3/20201</p>
    </div>
  );
}

export default CourseDetails;

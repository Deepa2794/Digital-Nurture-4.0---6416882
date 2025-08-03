function BlogDetails() {
  const isLoggedIn = true;

  return (
    <div>
      <h2>Blog Details</h2>
      {
        isLoggedIn ? (
          <>
            <p><strong>React Learning</strong></p>
            <p><em>Stephen Biz</em></p>
            <p>Welcome to learning React!</p>

            <p><strong>Installation</strong></p>
            <p><em>Schwezdenier</em></p>
            <p>You can install React from npm.</p>
          </>
        ) : (
          <p>Please login to view blog details.</p>
        )
      }
    </div>
  );
}

export default BlogDetails;

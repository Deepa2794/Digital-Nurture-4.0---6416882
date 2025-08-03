function BookDetails() {
  const booksAvailable = true;

  if (!booksAvailable) {
    return <p>No books found.</p>;
  }

  return (
    <div>
      <h2>Book Details</h2>
      <p><strong>Master React</strong><br />670</p>
      <p><strong>Deep Dive into Angular 11</strong><br />800</p>
      <p><strong>Mongo Essentials</strong><br />450</p>
    </div>
  );
}

export default BookDetails;

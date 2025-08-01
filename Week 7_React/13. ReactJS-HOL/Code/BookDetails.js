import React from 'react';

function BookDetails({ books }) {
  return (
    <div className="section">
      <h1>Book Details</h1>
      {books.length > 0 ? (
        books.map((book) => (
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))
      ) : (
        <p>No books found</p>
      )}
    </div>
  );
}

export default BookDetails;

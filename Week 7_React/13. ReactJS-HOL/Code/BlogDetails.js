import React from 'react';

function BlogDetails({ blogs }) {
  let blogContent;
  if (blogs.length > 0) {
    blogContent = blogs.map((blog) => (
      <div key={blog.id}>
        <h3>{blog.title}</h3>
        <p><strong>{blog.author}</strong></p>
        <p>{blog.content}</p>
      </div>
    ));
  } else {
    blogContent = <p>No blogs found</p>;
  }

  return (
    <div className="section">
      <h1>Blog Details</h1>
      {blogContent}
    </div>
  );
}

export default BlogDetails;

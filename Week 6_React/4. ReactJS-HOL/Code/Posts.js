import React from "react";
import Post from "./Post";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        const postList = data.map((item) => new Post(item.id, item.title, item.body));
        this.setState({ posts: postList });
      })
      .catch((error) => {
        console.error("Error fetching posts:", error);
        alert("Failed to fetch posts.");
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred in the Posts component.");
    console.error("Error caught by componentDidCatch:", error, info);
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;

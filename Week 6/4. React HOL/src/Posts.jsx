import React, { Component } from 'react';
import Post from './Post'; // assuming you have a Post component

class Posts extends Component {
  constructor() {
    super();
    this.state = {
      posts: [
        { id: 1, title: 'First Post', body: 'This is the first post' },
        { id: 2, title: 'Second Post', body: 'This is the second post' }
      ]
    };
  }

  render() {
    return (
      <div style={{ textAlign: 'center' }}>
        <h2>Blog Posts</h2>
        {this.state.posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;

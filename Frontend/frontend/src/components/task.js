import React, { Component } from "react";

class Task extends Component {
  state = {
    name: "generic task number: " + this.props.id,
    description: "generic task description: " + this.props.id
  };
  render() {
    return (
      <div>
        {this.state.name} - {this.state.description}
      </div>
    );
  }
}

export default Task;

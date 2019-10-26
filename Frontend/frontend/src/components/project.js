import React, { Component } from "react";

class Project extends Component {
  state = {
    name: "generic project number: " + this.props.id,
    description: "generic project description: " + this.props.id
  };
  render() {
    return (
      <div>
        {this.state.name} - {this.state.description}
      </div>
    );
  }
}

export default Project;

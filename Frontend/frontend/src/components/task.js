import React, { Component } from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

class Task extends Component {
  state = {
    name: "generic task number: " + this.props.id,
    description: "generic task description: " + this.props.id
  };
  render() {
    return (
      <div>
        {this.state.name} - {this.state.description} -{" "}
        <Link to="/taskDetails">Details</Link>
      </div>
    );
  }
}

export default Task;

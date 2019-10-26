import React, { Component } from "react";
import Task from "./task.js";

class Tasks extends Component {
  state = {
    tasks: [1, 2]
  };
  render() {
    return (
      <div>
        {this.state.tasks.map(taskNo => (
          <Task key={taskNo} id={taskNo}></Task>
        ))}
      </div>
    );
  }
}

export default Tasks;

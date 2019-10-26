import React, { Component } from "react";
import Project from "./project.js";

class Projects extends Component {
  state = {
    projects: [1, 2]
  };
  render() {
    return (
      <div>
        {this.state.projects.map(projectNo => (
          <Project id={projectNo}></Project>
        ))}
      </div>
    );
  }
}

export default Projects;

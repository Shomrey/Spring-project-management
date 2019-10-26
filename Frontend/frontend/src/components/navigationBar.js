import React, { Component } from "react";
import "./styles/navigationBar.css";
import NavigationButton from "./navigationButton";

class NavigationBar extends Component {
  state = {
    buttonContentProject: "My projects",
    buttonContentTask: "My tasks",
    userLogged: "Shomrey"
  };
  render() {
    return (
      <div id="general">
        <div>User logged: {this.state.userLogged}</div>
        <div id="navButtonsGroup">
          <NavigationButton
            name={this.state.buttonContentProject}
            route="projects"
          ></NavigationButton>
          <NavigationButton
            name={this.state.buttonContentTask}
            route="tasks"
          ></NavigationButton>
        </div>
      </div>
    );
  }
}

export default NavigationBar;

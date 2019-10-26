import React, { Component } from "react";
import "./styles/viewWindow.css";
import Projects from "./projects";
import Tasks from "./tasks";
import TaskDetails from "./taskDetails";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

class ViewWindow extends Component {
  state = {
    comments: ["comment 1", "comment 2"]
  };
  render() {
    return (
      <div id="Container">
        <Switch>
          <Route path="/projects">
            <Projects />
          </Route>
          <Route path="/tasks">
            <Tasks />
          </Route>
          <Route path="/taskDetails">
            <TaskDetails comments={this.state.comments}></TaskDetails>
          </Route>
        </Switch>
      </div>
    );
  }
}

export default ViewWindow;

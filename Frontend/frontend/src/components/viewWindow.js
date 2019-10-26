import React, { Component } from "react";
import "./styles/viewWindow.css";
import Projects from "./projects";
import Tasks from "./tasks";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

class ViewWindow extends Component {
  state = {};
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
        </Switch>
      </div>
    );
  }
}

export default ViewWindow;

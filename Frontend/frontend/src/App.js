import React from "react";
import logo from "./logo.svg";
import "./App.css";
import NavigationBar from "./components/navigationBar";
import ViewWindow from "./components/viewWindow";
import { BrowserRouter as Router } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <Router>
        <NavigationBar></NavigationBar>
        <ViewWindow></ViewWindow>
      </Router>
    </div>
  );
}

export default App;

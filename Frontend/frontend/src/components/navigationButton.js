import React, { Component } from "react";
import "./styles/navigationBar.css";
import { useHistory } from "react-router-dom";

function NavigationButton({ route, name }) {
  const history = useHistory();

  return (
    <button id="navButton" onClick={() => history.push("/" + route)}>
      {name}
    </button>
  );
}

export default NavigationButton;

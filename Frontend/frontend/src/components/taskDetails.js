import React, { Component } from "react";
import "./styles/taskDetails.css";

const TaskDetails = props => {
  const [inputValue, setInputValue] = React.useState("");
  const [comments, setComments] = React.useState(props.comments);

  function onClickButton() {
    setComments([...comments, inputValue]);
    setInputValue("");
  }

  console.log(inputValue);
  return (
    <div>
      {comments.map(comment => (
        <div id="comment">{comment}</div>
      ))}
      <div id="inputHandler">
        <input
          type="text"
          value={inputValue}
          onChange={e => setInputValue(e.target.value)}
        ></input>
        <input type="button" value="Add" onClick={onClickButton}></input>
      </div>
    </div>
  );
};

export default TaskDetails;

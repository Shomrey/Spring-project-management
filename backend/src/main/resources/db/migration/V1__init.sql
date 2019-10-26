CREATE TABLE project (
    project_id serial PRIMARY KEY,
    project_name VARCHAR(50) NOT NULL,
    project_deadline_date TIMESTAMP
);

CREATE TABLE task
(
    task_id    serial PRIMARY KEY,
    task_name  VARCHAR(50) NOT NULL,
    project_id INTEGER     NOT NULL,
    task_description VARCHAR(250),
    CONSTRAINT tasks_project_id_fk FOREIGN KEY (project_id)
        REFERENCES project(project_id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION

);

CREATE TABLE worker(
    worker_id serial PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    privileges VARCHAR(25) NOT NULL
);

CREATE TABLE task_user(
  user_id INTEGER NOT NULL,
  task_id INTEGER NOT NULL,
  CONSTRAINT task_user_user_id_fk FOREIGN KEY (user_id)
                      REFERENCES worker(worker_id) MATCH SIMPLE
                      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT task_user_task_id_fk FOREIGN KEY (task_id)
                      REFERENCES  task(task_id) MATCH SIMPLE
                      ON UPDATE NO ACTION ON DELETE NO ACTION,
   PRIMARY KEY(user_id, task_id)
);

CREATE TABLE project_detail(
    project_id INTEGER NOT NULL,
    details VARCHAR(250),
    CONSTRAINT project_details_project_id_fk FOREIGN KEY (project_id)
                            REFERENCES  project(project_id) MATCH SIMPLE
                            ON UPDATE NO ACTION ON DELETE NO ACTION,
    PRIMARY KEY (project_id)

);

CREATE TABLE task_detail(
    task_id INTEGER NOT NULL,
    details VARCHAR(250),
    CONSTRAINT task_details_task_id_fk FOREIGN KEY (task_id)
                         REFERENCES task(task_id) MATCH SIMPLE
                         ON UPDATE NO ACTION ON DELETE NO ACTION,
    PRIMARY KEY(task_id)

);

CREATE TABLE comment(
    comment_id SERIAL PRIMARY KEY,
    content VARCHAR(250) NOT NULL,
    author_id INTEGER NOT NULL,
    CONSTRAINT comment_author_id_fk FOREIGN KEY (author_id)
                    REFERENCES worker(worker_id) MATCH SIMPLE
                    ON UPDATE NO ACTION ON DELETE NO ACTION
                    );

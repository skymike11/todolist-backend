DROP TABLE IF EXISTS todo;
CREATE TABLE todo (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  content VARCHAR(100) NOT NULL,
  status BOOLEAN DEFAULT FALSE
);

INSERT INTO todo (content, status) VALUES
 ('test', false),
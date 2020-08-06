DROP TABLE IF EXISTS todoentity;
CREATE TABLE todoentity (
  id INT AUTO_INCREMENT PRIMARY KEY,
  status Boolean,
  content varchar(20)
);
INSERT INTO todoentity (id,status,content) VALUES
(1,FALSE,'1');

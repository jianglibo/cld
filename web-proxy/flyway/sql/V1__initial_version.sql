CREATE TABLE WPURL (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  ADDRESS CHAR DEFAULT NULL,
  TS TIMESTAMP DEFAULT NOW(),
  CNT INT DEFAULT 0,
  CONTENT BINARY(3072000) DEFAULT NULL,
  Constraint unique_url UNIQUE(ADDRESS)
);

CREATE TABLE WPHEADER (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  URL_ID INT,
  HEADER_NAME CHAR(30),
  HEADER_VALUE CHAR(255),
  Constraint fk_header_url FOREIGN KEY(URL_ID) REFERENCES WPURL(ID) ON DELETE CASCADE
)

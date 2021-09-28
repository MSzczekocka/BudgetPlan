CREATE TABLE budget_type
(
    id_budget_type   INT AUTO_INCREMENT PRIMARY KEY,
    name_budget_type VARCHAR(400)               NOT NULL
);

CREATE TABLE category
(
    id_category    INT AUTO_INCREMENT PRIMARY KEY,
    name_category  VARCHAR(400) NOT NULL,
    color_category VARCHAR(400) not NULL
);

CREATE TABLE operation_type
(
    id_operation_type   INT AUTO_INCREMENT PRIMARY KEY,
    name_operation_type VARCHAR(400) NOT NULL
);

CREATE TABLE budget
(
    id_budget     INT AUTO_INCREMENT PRIMARY KEY,
    name_budget   VARCHAR(400) NOT NULL,
    id_budget_type INTEGER,
    FOREIGN KEY (id_budget_type) REFERENCES budget_type (id_budget_type)
);



CREATE TABLE operation
(
    id_operation         INT AUTO_INCREMENT PRIMARY KEY,
    amount_operation      FLOAT NOT NULL,
    description_operation VARCHAR(400)  NOT NULL,
    date_operation        DATE  NOT NULL,
    id_budget            INTEGER,
    id_category           INTEGER,
    id_operation_type      INTEGER,
    FOREIGN KEY (id_budget) REFERENCES budget (id_budget),
    FOREIGN KEY (id_category) REFERENCES category (id_category),
    FOREIGN KEY (id_operation_type) REFERENCES operation_type (id_operation_type)
);
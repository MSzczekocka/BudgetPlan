CREATE TABLE budget_type
(
    id_budget_type   SERIAL PRIMARY KEY NOT NULL,
    name_budget_type TEXT               NOT NULL
);

CREATE TABLE category
(
    id_category    SERIAL PRIMARY KEY,
    name_category  TEXT NOT null,
    color_category text not NULL
);

CREATE TABLE operation_type
(
    id_operation_type   SERIAL PRIMARY KEY,
    name_operation_type TEXT NOT null
);

CREATE TABLE budget
(
    id_budget     SERIAL PRIMARY KEY,
    name_budget   TEXT NOT null,
    id_budget_type INTEGER,
    foreign key (id_budget_type) references budget_type (id_budget_type)
);



CREATE TABLE operation
(
    id_operation         SERIAL PRIMARY KEY,
    amount_operation      FLOAT NOT null,
    description_operation text  not null,
    date_operation        date  not null,
    id_budget            INTEGER,
    id_category           INTEGER,
    id_operation_type      INTEGER,
    foreign key (id_budget) references budget (id_budget),
    foreign key (id_category) references category (id_category),
    foreign key (id_operation_type) references operation_type (id_operation_type)
);



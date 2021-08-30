CREATE TABLE BudgetType
(
    idBudgetType   SERIAL PRIMARY KEY NOT NULL,
    nameBudgetType TEXT               NOT NULL
);

CREATE TABLE Category
(
    idCategory    SERIAL PRIMARY KEY,
    nameCategory  TEXT NOT null,
    colorCategory text not NULL
);

CREATE TABLE OperationType
(
    idOperationType   SERIAL PRIMARY KEY,
    nameOperationType TEXT NOT null
);

CREATE TABLE Budget
(
    idBudget     SERIAL PRIMARY KEY,
    nameBudget   TEXT NOT null,
    idBudgetType INTEGER,
    foreign key (idBudgetType) references BudgetType (idBudgetType)
);



CREATE TABLE Operation
(
    idOperation         SERIAL PRIMARY KEY,
    amountOperation      FLOAT NOT null,
    descriptionOperation text  not null,
    dateOperation        date  not null,
    idBudget            INTEGER,
    idCategory           INTEGER,
    idOperationType      INTEGER,
    foreign key (idBudget) references Budget (idBudget),
    foreign key (idCategory) references Category (idCategory),
    foreign key (idOperationType) references OperationType (idOperationType)
);



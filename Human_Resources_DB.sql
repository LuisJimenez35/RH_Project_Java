CREATE TABLE RH_Employe (
    DNI VARCHAR(50) NOT NULL,
    Email VARCHAR(50) NOT NULL,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Position VARCHAR(50) NOT NULL,
    PRIMARY KEY (DNI)
);

CREATE TABLE RH_Employe_Information (
    DNI_Employe VARCHAR(50) NOT NULL,
    Telephone VARCHAR(50) NOT NULL,
    Country VARCHAR(50) NOT NULL,
    City_Province VARCHAR(50) NOT NULL,
    AcademicFormation VARCHAR(50) NOT NULL,
    Language VARCHAR(50) NOT NULL,
    Birthday DATE NOT NULL,
    ContratingDate DATE NOT NULL,
    PRIMARY KEY (DNI_Employe)
);

CREATE TABLE RH_Payments (
    DNI_Employe VARCHAR(50) NOT NULL,
    Insurance FLOAT NOT NULL,
    PaymentDate DATE NOT NULL,
    LaborHours VARCHAR(50) NOT NULL,
    Absences VARCHAR(50),
    Payment FLOAT NOT NULL,
    PRIMARY KEY (DNI_Employe, PaymentDate)
);

CREATE TABLE RH_Positions (
    PostionName VARCHAR(50) NOT NULL,
    PositionSalary FLOAT NOT NULL,
    PRIMARY KEY (PostionName)
);

CREATE TABLE RH_Users (
    UserName VARCHAR(50) NOT NULL,
    Email VARCHAR(50) NOT NULL,
    Password VARCHAR(50) NOT NULL,
    EmployePosition VARCHAR(50) NOT NULL,
    PRIMARY KEY (UserName)
);


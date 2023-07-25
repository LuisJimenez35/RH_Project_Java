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

Convierte este script de sql server a un script de mysql
USE [Human_Resources_DB]
GO
/****** Object:  Table [dbo].[RH_Employe]    Script Date: 5/7/2023 11:05:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RH_Employe](
	[DNI] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[FirstName] [varchar](50) NOT NULL,
	[LastName] [varchar](50) NOT NULL,
	[Position] [varchar](50) NOT NULL
) ON [PRIMARY]
GO
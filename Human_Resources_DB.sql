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
/****** Object:  Table [dbo].[RH_Employe_Information]    Script Date: 5/7/2023 11:05:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RH_Employe_Information](
	[DNI_Employe] [varchar](50) NOT NULL,
	[Telephone] [varchar](50) NOT NULL,
	[Country] [varchar](50) NOT NULL,
	[City-Province] [varchar](50) NOT NULL,
	[AcademicFormation] [varchar](50) NOT NULL,
	[Language] [varchar](50) NOT NULL,
	[Birthday] [date] NOT NULL,
	[ContratingDate] [date] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RH_Payments]    Script Date: 5/7/2023 11:05:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RH_Payments](
	[DNI_Employe] [varchar](50) NOT NULL,
	[Insurance] [float] NOT NULL,
	[PaymentDate] [date] NOT NULL,
	[LaborHours] [varchar](50) NOT NULL,
	[Absences] [varchar](50) NULL,
	[Payment] [float] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RH_Positions]    Script Date: 5/7/2023 11:05:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RH_Positions](
	[PostionName] [varchar](50) NOT NULL,
	[PositionSalary] [float] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RH_Users]    Script Date: 5/7/2023 11:05:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RH_Users](
	[UserName] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[EmployePosition] [varchar](50) NOT NULL
) ON [PRIMARY]
GO

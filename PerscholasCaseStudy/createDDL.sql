CREATE TABLE BUSINESS (EMAIL VARCHAR(255) NOT NULL, ABOUTSECTION VARCHAR(255), ACCOUNTTYPE VARCHAR(255), ADDRESSLINE VARCHAR(255), CITY VARCHAR(255), NAME VARCHAR(255), PASSWORD VARCHAR(255), PHONE VARCHAR(255), STATE VARCHAR(255), BUSINESSHOURS_ID INTEGER, PRIMARY KEY (EMAIL))
CREATE TABLE SERVICE (SERVICEID INTEGER NOT NULL, PRICE DOUBLE, SERVICENAME VARCHAR(255), BUSINESS_EMAIL VARCHAR(255), PRIMARY KEY (SERVICEID))
CREATE TABLE BUSINESSHOURS (ID INTEGER NOT NULL, CLOSETIMES LONGBLOB, OPENTIMES LONGBLOB, SHOPOPENDAYS LONGBLOB, BUSINESS_EMAIL VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE CLIENT (EMAIL VARCHAR(255) NOT NULL, ACCOUNTTYPE VARCHAR(255), PASSWORD VARCHAR(255), REVIEW_ID INTEGER, PRIMARY KEY (EMAIL))
CREATE TABLE EMPLOYEES (EMPID INTEGER NOT NULL, NAME VARCHAR(255), YEARSOFEXPERINCE INTEGER, PRIMARY KEY (EMPID))
CREATE TABLE PROMOTIONS (PROMOID INTEGER NOT NULL, ENDDATE VARCHAR(255), PROMOCONTENT VARCHAR(255), PROMONAME VARCHAR(255), STARTDATE VARCHAR(255), BUSINESS_EMAIL VARCHAR(255), PRIMARY KEY (PROMOID))
CREATE TABLE REVIEW (ID INTEGER NOT NULL, REVCONTENT VARCHAR(255), BUSINESS_EMAIL VARCHAR(255), CLIENT_EMAIL VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE BUSINESS_EMPLOYEES (Business_EMAIL VARCHAR(255) NOT NULL, employeesList_EMPID INTEGER NOT NULL, PRIMARY KEY (Business_EMAIL, employeesList_EMPID))
CREATE TABLE BUSINESS_PROMOTIONS (Business_EMAIL VARCHAR(255) NOT NULL, promotionList_PROMOID INTEGER NOT NULL, PRIMARY KEY (Business_EMAIL, promotionList_PROMOID))
CREATE TABLE BUSINESS_REVIEW (Business_EMAIL VARCHAR(255) NOT NULL, reviewList_ID INTEGER NOT NULL, PRIMARY KEY (Business_EMAIL, reviewList_ID))
CREATE TABLE BUSINESS_SERVICE (Business_EMAIL VARCHAR(255) NOT NULL, serviceList_SERVICEID INTEGER NOT NULL, PRIMARY KEY (Business_EMAIL, serviceList_SERVICEID))
ALTER TABLE BUSINESS ADD CONSTRAINT FK_BUSINESS_BUSINESSHOURS_ID FOREIGN KEY (BUSINESSHOURS_ID) REFERENCES BUSINESSHOURS (ID)
ALTER TABLE SERVICE ADD CONSTRAINT FK_SERVICE_BUSINESS_EMAIL FOREIGN KEY (BUSINESS_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE BUSINESSHOURS ADD CONSTRAINT FK_BUSINESSHOURS_BUSINESS_EMAIL FOREIGN KEY (BUSINESS_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE CLIENT ADD CONSTRAINT FK_CLIENT_REVIEW_ID FOREIGN KEY (REVIEW_ID) REFERENCES REVIEW (ID)
ALTER TABLE PROMOTIONS ADD CONSTRAINT FK_PROMOTIONS_BUSINESS_EMAIL FOREIGN KEY (BUSINESS_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE REVIEW ADD CONSTRAINT FK_REVIEW_BUSINESS_EMAIL FOREIGN KEY (BUSINESS_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE REVIEW ADD CONSTRAINT FK_REVIEW_CLIENT_EMAIL FOREIGN KEY (CLIENT_EMAIL) REFERENCES CLIENT (EMAIL)
ALTER TABLE BUSINESS_EMPLOYEES ADD CONSTRAINT FK_BUSINESS_EMPLOYEES_employeesList_EMPID FOREIGN KEY (employeesList_EMPID) REFERENCES EMPLOYEES (EMPID)
ALTER TABLE BUSINESS_EMPLOYEES ADD CONSTRAINT FK_BUSINESS_EMPLOYEES_Business_EMAIL FOREIGN KEY (Business_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE BUSINESS_PROMOTIONS ADD CONSTRAINT FK_BUSINESS_PROMOTIONS_Business_EMAIL FOREIGN KEY (Business_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE BUSINESS_PROMOTIONS ADD CONSTRAINT FK_BUSINESS_PROMOTIONS_promotionList_PROMOID FOREIGN KEY (promotionList_PROMOID) REFERENCES PROMOTIONS (PROMOID)
ALTER TABLE BUSINESS_REVIEW ADD CONSTRAINT FK_BUSINESS_REVIEW_Business_EMAIL FOREIGN KEY (Business_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE BUSINESS_REVIEW ADD CONSTRAINT FK_BUSINESS_REVIEW_reviewList_ID FOREIGN KEY (reviewList_ID) REFERENCES REVIEW (ID)
ALTER TABLE BUSINESS_SERVICE ADD CONSTRAINT FK_BUSINESS_SERVICE_Business_EMAIL FOREIGN KEY (Business_EMAIL) REFERENCES BUSINESS (EMAIL)
ALTER TABLE BUSINESS_SERVICE ADD CONSTRAINT FK_BUSINESS_SERVICE_serviceList_SERVICEID FOREIGN KEY (serviceList_SERVICEID) REFERENCES SERVICE (SERVICEID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)

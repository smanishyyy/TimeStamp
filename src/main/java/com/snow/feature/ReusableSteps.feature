Feature: Reusable steps

#To submit request from portal and then perform fullfilment steps from admin portal
@First
Scenario Outline: Reusable steps to submit request from portal and then perform fullfilment steps from admin portal

Given User logged into Service Now Portal
When Clicks on Request service link on the home page
#And get the data from sheet as "<row_Index>" and column anme as "<ColumnName>"
Then user select the requested for as with index "<Requested for>"
And User gets select the country as "<Country>"
When user search the item "<Item>"
And Click on the Item link
Then Verify the title "<Item>"
#And Take Screenshot "<ScreenhsotFoldername>" from first driver
#And fill the form detail of itemm "<Item>"
And click on add cart button and submit the request for HP Item "<ScreenhsotFoldername>"
And store the tciket number in sheet for row as "<row_Index>"
And User launch the IETL view and search the request
And user_approve_the_request
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then approve the requested item
And click on the requested tab and click on the RITM link "<ScreenhsotFoldername>"
And click on the task link
And click on the task link and close the task till automate task gets triggered and pass "<AutomateShortDescriptionTask>" , "<AssignedToTask>"
Then close the browser

Examples:
|Requested for|Country|Item|AutomateShortDescriptionTask|AssignedToTask|ScreenhsotFoldername|row_Index|ColumnName|
|poddepa|Canada|Virtual Computer (VDI) (Canada, US)|Virtual Computer Add - Add Virtual Computer to asset system and assign to user|Adolf Evancar Peralta|STRY0019968_WithID_VirtualComputer|1|MLF SubCategory Requirment|


#To create incident from MLF and bridge with any external vendor
#ReusableMLFIncBrigdeWithEX
@Second
Scenario Outline: Reusable steps to create incident from MLF and bridge with any external vendor

Given user launch the ITIL view
When user impersonate the user "<user>"
And verify the user profile
And Open new ticket in ServiceNow at MLF
And Fill description and short description along with all mandatory field 
And verify if source field does not have value "<Souce>" and take screenshot "<ScreenhsotFoldername>"
And fetch all the contains field of source field
Then Assign ticket to activated ServiceNow interface which is "<Assigned To>"
And Refresh the page
When MLF incident gets bridge with CSC
Then take the CSC incident ticket number and take screenshot "<ScreenhsotFoldername>"
And Clicks on the resolve button after filling category and subcategory as "<row_Index>"
#Then close the browser

Examples:

|Assigned To|Souce|ScreenhsotFoldername|user|row_Index|
|AVAYA_Integ-ServiceDesk-IPCR|Integration from AVAYA|STRY0020671_Inc_ITIL|poddepa|1|
#|AVAYA_Integ-ServiceDesk-IPCR|Integration from AVAYA|STRY0020671_Inc_ITIL|poddepa|2|



#To submit incident from portal
@Third
Scenario: Reusable steps to submit incident from portal

Given User logged into Service Now Portal
Then clicks on the report incident link
Then Agin clicks on the report incident link
And Fill the mandatory incident field
Then Click on the submit button
And get the incident number 
And User launch the IETL view to serach the request


#To search the incident or request with data table
@Fourth
Scenario Outline: Reusable steps to search the request or incident

Given User launch the IETL view to serach the request or incident "<Incident>" take screenshot "<ScreenhsotFoldername>"
Then close the second browser

Examples:

|Incident|ScreenhsotFoldername|
|INC03062594|STRY0020679_Inc_AssngGrp|

@Fifth
Scenario Outline: Verify italic message “This is an automated email, please do not reply.” gets displayed in email notification when incident created by Non VIP and resolved by VIP user
#STRY0021263_NonVIP_TC01
Given user launch the ITIL view
When user impersonate the user "<user>"
And verify the user profile
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And Open new ticket in ServiceNow at MLF
And Fill description and short description along with all mandatory field 
And verify if source field does not have value "<Souce>" and take screenshot "<ScreenhsotFoldername>"
And fetch all the contains field of source field
Then Assign ticket to activated ServiceNow interface which is "<Assigned To>"
When user impersonate the user2 "<user2>"
And verify the user profile
And user swicth frame
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And Refresh the page
And Clicks on the resolve button after filling category and subcategory as "<row_Index>"
And user search the incident number
Then verify if the email notifiaction has italics message as "<VerifyMessage>"
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then close the browser

Examples:

|Assigned To|Souce|ScreenhsotFoldername|user|row_Index|VerifyMessage|user2|
|AVAYA_Integ-ServiceDesk-IPCR|Integration from AVAYA|STRY0021263_TC04|poddepa|1|This is an automated email, please do not reply.|chaurma|


@Sixth
Scenario Outline: Rest validation
Given user launch the ITIL view
And Open new ticket in ServiceNow at MLF
And Fill description and short description along with all mandatory field
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And set the priority as high
And select the business CI
Then submit the incident
And Refresh the page
#And again search the incident
Then scroll to the work note
And verify the priority incident tab is being displayed
And then click on the priority incident tab
Then verify the "Customer Facing" is getting displayed
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then click on the "Customer facing
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And verify the values (None, Yes, No )
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And then select "Yes"
And Take Screenshot "<ScreenhsotFoldername>" from first driver
#When MLF incident gets bridge with CSC
#Then take the CSC incident ticket number and take screenshot "<ScreenhsotFoldername>"
And Clicks on the resolve button after filling category and subcategory as "<row_Index>"
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And Refresh the page
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then Click on the REST tab
And then click on the rest link
And get the JSON rest request
And Take Screenshot "<ScreenhsotFoldername>" from first driver
#Then close the browser

Examples:

|Assigned To|Souce|ScreenhsotFoldername|row_Index|
|AVAYA_Integ-ServiceDesk-IPCR|Integration from AVAYA|STRY0020811_TC06|1|

@Report 
Scenario: Report
Given user launch the ITIL view

@Seventh
Scenario Outline: Verify whether field "Caused by Change" in the "Related Records" tab underneath "Change Request" on SIR form
#STRY0021103_TC01_CausedbyChange
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And type "<NameInNaviagtor>" in filter navigator
And Cliks on the "Visible to Me" option
And Clicks on the New button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And Fill the requested by as "<RequestedBy>"
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And Fille the short description as "<ShortDescription>"
And Scroll to the submit button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
When clicks on the submit button
And Store SIR number in sheet in row "<row_Index>"
Then SIR should be submitted sucessfully
And Take Screenshot "<ScreenhsotFoldername>" from first driver
And search created SIR
When scroll to the update button
Then Verify whether field "Caused by Change" in the "Related Records" tab underneath "Change Request"
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then close the browser

Examples:

|NameInNaviagtor|RequestedBy|ScreenhsotFoldername|ShortDescription|row_Index|
|Security Incident|Manish Chaurasia|STRY0021103_TC01_AC|SC|1|




#<-------Reusable to check if manager approval is required for RITM and then click on the RITM

#And Clicks on the approver tab
#Then Scroll down to the bottom and takse snap as "<ScreenhsotFoldername>"
#And Verify if manager approval is required for the Item "<Item2>" and take snap as "<ScreenhsotFoldername>"
#And Click on the RITM link and take snap as "<ScreenhsotFoldername>"
#Then Scroll donw to the bottom and take snap as "<ScreenhsotFoldername>"
#And verify the task short description and assignement group
#And assignement group should be "<AssigmentGroupOftask>"
#And task short description should be "<TaskShortDesc>"
#Then close the browser  ---------------------->
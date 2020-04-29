#Author: Manish Chaurasia
#Short description: MLF to IBM change integration
#Sprint:

#Release:

Feature:  MLF to IBM change integration

@First
Scenario Outline: Verif the MLF change is getting bridged with IBM
#MLF_IBM_ChangeBridge_TC01
Given user launch the ITIL view and pass test name "<TestName>"
And Take Screenshot "<ScreenhsotFoldername>" from second driver
#And type "<NameInNaviagtor>" in filter navigator
#And click on the create new change option
#And select the risk as "<Risk>"
#And store the MLF change number in sheet for row as "<row_Index>"
#And select the type as "<Type>"
#And select the category as "<Category>"
#And passed the affected CI as "<ConfigItem>"
#And select the impact as "<Impact>"
#And fill the change summary change as "<ChangeSummary>"
#And fill the description as "<Description>" 
#And select the owner group as "<OwnerGrp>"
#And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
#And select the change owner as "<ChngOwnr>"
#And select the planned date
#And select the start date
#And clicks on the plan tab
#And fill the implementation plan
#And fill the test plan
#And fill the backout plan
#And fill the outrage description
#And fill the justification
#Then clicks on the submit button to submitting the change
#Then move to the filter navigator
#And type "<NameInNaviagtor>" in filter navigator
#And click on the open change
#And clicks on the filter icon
#Then select the choose option as "<Option>" from change table
#And pass the sumitted change in input box
#Then clicks on the run button
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
#Then clicks on the new button under the change task
#And fill the change task short description as "<TaskShrtDesc>"
#And fill the change task description as "<TasktDesc>"
#And assigned the task to synced IBM group as "<SynIBM>"
#And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
#Then submit the task and row as "<row_Index>"
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
#And store the IBM change number in sheet for row as "<row_Index>"
#And refresh the page untile IBm tciket gets populate in vendor field
#Then open the IBM url
#And type "<NameInNaviagtor>" in IBM filter navigator
#And click on the open change in IBM
#And clicks on the filter icon in IBM
#Then select the choose option as "<Option>" from IBM change table
#And pass the sumitted change in IBM input box
#Then clicks on the IBM run button
#And Take Screenshot "<ScreenhsotFoldername>" from first driver
#Then move to MLF change form
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
#Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|TestName|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_01|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|2|Verify MLF change is getting bridge with IBM|
#|poddepa|Canada|Off Catalog Item (Canada, US)|TC_02|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|MLB-BASS-IPCRA|3|


@Second
Scenario Outline: Verif whether worke note and additional comment is getting passed to IBM chnage form on the MLF initiated change
#MLF_IBM_ChangeBridge_TC01
Given user launch the ITIL view and pass test name "<TestName>"
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
#And click on the create new change option
#And select the risk as "<Risk>"
#And store the MLF change number in sheet for row as "<row_Index>"
#And select the type as "<Type>"
#And select the category as "<Category>"
#And passed the affected CI as "<ConfigItem>"
#And select the impact as "<Impact>"
#And fill the change summary change as "<ChangeSummary>"
#And fill the description as "<Description>" 
#And select the owner group as "<OwnerGrp>"
#And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
#And select the change owner as "<ChngOwnr>"
#And select the planned date
#And select the start date
#And clicks on the plan tab
#And fill the implementation plan
#And fill the test plan
#And fill the backout plan
#And fill the outrage description
#And fill the justification
#Then clicks on the submit button to submitting the change
#Then move to the filter navigator
#And type "<NameInNaviagtor>" in filter navigator
#And click on the open change
#And clicks on the filter icon
#Then select the choose option as "<Option>" from change table
#And pass the sumitted change in input box
#Then clicks on the run button
#Then clicks on the new button under the change task
#And fill the change task short description as "<TaskShrtDesc>"
#And fill the change task description as "<TasktDesc>"
#And assigned the task to synced IBM group as "<SynIBM>"
#And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
#Then submit the task and row as "<row_Index>"
#And store the IBM change number in sheet for row as "<row_Index>"
#And refresh the page untile IBm tciket gets populate in vendor field
#Then open the IBM url
#And type "<NameInNaviagtor>" in IBM filter navigator
#And click on the open change in IBM
#And clicks on the filter icon in IBM
#Then select the choose option as "<Option>" from IBM change table
#And pass the sumitted change in IBM input box
#Then clicks on the IBM run button
#And Take Screenshot "<ScreenhsotFoldername>" from first driver
#Then move to MLF change form
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
#And pass the work as "<WorkNote>" at MLF change form
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
#Then move to IBM change form
#Then verify the passed work note at IBm end
#And Take Screenshot "<ScreenhsotFoldername>" from first driver
#Then move to MLF change form
#And pass the additional comment as "<AdditionalComment>"
#Then move to IBM change form
#Then verify the passed  additional comment at IBM end
#And Take Screenshot "<ScreenhsotFoldername>" from first driver
#Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|WorkNote|AdditionalComment|TestName|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_08|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|7|Work Note from MLF|Additional Comment from MLF|MLF-IBM tes|
#|poddepa|Canada|Off Catalog Item (Canada, US)|TC_09|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|8|Work Note from MLF|Additional Comment from MLF|


@Third
Scenario Outline: Validate whether MLF initiated change with IBM assignment group without creating task does not gets bridged with IBM
#MLF_IBM_ChangeBridge_TC01
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
#And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And verify IBM number is not getting generated and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
#Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_03|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|IBM_Integ-I-MLF-ACCESS|IBM Service Desk|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|4|


@Fourth
Scenario Outline: Validate whether work notes is getting passed from MLF task form to IBM task from
#MLF_IBM_ChangeBridge_TC01
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
#And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then cliks on the change task tab
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And  click on the task
And clicks on the notes tab
Then clicks on the work notes
And pass the input as "<WorkNote>"
And cliks on the activity log tab on task form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then move to IBM change form
And clicks on the change task tab at IBM
Then clicks on the task link
And cliks on the notes tabe at IBM
Then verify the passed work note at IBm's task form
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|WorkNote|AdditionalComment|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_04|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|5|Work Note from MLF|Additional Comment from MLF|


@Fifth
Scenario Outline: Validate whether work notes is getting passed from IBM task form to MLF task from
#MLF_IBM_ChangeBridge_TC01
#Issue: Do not have access to pass work note from IBM task
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
#And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then cliks on the change task tab
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And  click on the task
And cliks on the activity log tab on task form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then move to IBM change form
And clicks on the change task tab at IBM
Then clicks on the task link
And cliks on the notes tabe at IBM
And pass the input as "<WorkNote>" at IBM task form
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change taks form
Then verify the passed work note at MLF's task form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|WorkNote|AdditionalComment|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_05|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|6|Work Note from IBM|Additional Comment from MLF|

@Sixth
Scenario Outline: Validate whether Additional comment is  getting passed from IBM change form to MLF change form
#MLF_IBM_ChangeBridge_TC01
#Issue: Passed additional comment from IBM is not getting displayed at MLF end
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to IBM change form
And pass additional comment at IBM change form as "<AdditionalComment>"
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
Then verify the passed additional comment at MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|WorkNote|AdditionalComment|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_09|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|10|Work Note from IBM|Additional Comment from IBM|


@Seventh
Scenario Outline: Validate whether work notes is  getting passed from IBM change form to MLF change form
#MLF_IBM_ChangeBridge_TC01
#Issue: Passed work not from IBM is not getting displayed at MLF end
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to IBM change form
And pass work note at IBM change form as "<WorkNote>"
Then move to MLF change form
Then verify the passed  work notes at MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|WorkNote|AdditionalComment|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_08|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|9|Work Note from IBM|Additional Comment from IBM|

@Eighth
Scenario Outline: Validate the both side’s state when MLF user review to change
#MLF_IBM_ChangeBridge_TC01
#Phase state at MLF: Assess
#Phase at MLF: Review
#IBM state : Assess
#Working fine (CHG00374406\ IBMR=CHG0030842)
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And click on the review button
Then move to IBM change form
And verify IBM the state after MLF access to change from their end
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
Then verify the pahse state as assess at MLF
Then verify the pahse as review at MLF
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_22|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|23|


@Nine
Scenario Outline: Validate the both side’s state when group approval gets added at MLF.
#Phase state at MLF: Pending Approval
#Phase at MLF: Authorize
#IBM state : Authorize
#Working fine (CHG00374406\ IBMR=CHG0030842)
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And click on the review button
Then move to IBM change form
And verify IBM the state after MLF access to change from their end
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
Then verify the pahse state as assess at MLF
Then verify the pahse as review at MLF
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And click on the request approval at MLF
Then verify the pahse state as "<PhaseState>" at MLF
Then verify the pahse as authorize at MLF
And verify IBM the state at IBM as "<IBMState>"
Then move to IBM change form
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_23|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|24|Pending Approval|Authorize|

@Ten
Scenario Outline: Validate the both side's  state when MLF both side approver approve the MLF initiated change
#Phase state at MLF: Approved
#Phase at MLF: Implement
#IBM state : Waiting to deploy
#Issue: MLF gets displayed as approved at IBM  once MLF analyst approves but no IBM approvers gets displayed at IBM to approve when it comes to IBM
Given user launch the ITIL view
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And type "<NameInNaviagtor>" in filter navigator
And click on the create new change option
And select the risk as "<Risk>"
And store the MLF change number in sheet for row as "<row_Index>"
And select the type as "<Type>"
And select the category as "<Category>"
And passed the affected CI as "<ConfigItem>"
And select the impact as "<Impact>"
And fill the change summary change as "<ChangeSummary>"
And fill the description as "<Description>" 
And select the owner group as "<OwnerGrp>"
And store the MLF owner group as "<OwnerGrp>" in sheet for row as "<row_Index>"
And select the change owner as "<ChngOwnr>"
And select the planned date
And select the start date
And clicks on the plan tab
And fill the implementation plan
And fill the test plan
And fill the backout plan
And fill the outrage description
And fill the justification
Then clicks on the submit button to submitting the change
Then move to the filter navigator
And type "<NameInNaviagtor>" in filter navigator
And click on the open change
And clicks on the filter icon
Then select the choose option as "<Option>" from change table
And pass the sumitted change in input box
Then clicks on the run button
Then clicks on the new button under the change task
And fill the change task short description as "<TaskShrtDesc>"
And fill the change task description as "<TasktDesc>"
And assigned the task to synced IBM group as "<SynIBM>"
And store the IBM synced group as "<SynIBM>" in sheet for row as "<row_Index>"
Then submit the task and row as "<row_Index>"
And store the IBM change number in sheet for row as "<row_Index>"
And refresh the page untile IBm tciket gets populate in vendor field
Then open the IBM url
And type "<NameInNaviagtor>" in IBM filter navigator
And click on the open change in IBM
And clicks on the filter icon in IBM
Then select the choose option as "<Option>" from IBM change table
And pass the sumitted change in IBM input box
Then clicks on the IBM run button
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And click on the review button
Then move to IBM change form
And verify IBM the state after MLF access to change from their end
And Take Screenshot "<ScreenhsotFoldername>" from first driver
Then move to MLF change form
Then verify the pahse state as assess at MLF
Then verify the pahse as review at MLF
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And click on the request approval at MLF
Then verify the pahse state as "<PhaseState>" at MLF
Then verify the pahse as authorize at MLF
Then move to IBM change form
And verify IBM the state at IBM as "<IBMState>"
Then move to MLF change form
And cliks on the group approval tab at MLF
Then find the MLF group as "<MLFApprovalGroup>" and click on the requested link
And click on the first requested link on the group 
Then approve the change
And clik on the update button
Then move to IBM change form
And reload the IBM change from page
And click on approver tab at IBM
Then find the IBM group as "<IBMApproverGroup>" and approver
And verify IBM the state at IBM as "<IBMState2>"
And reload the IBM change from page
Then move to MLF change form
Then verify the pahse state as "<PhaseState2>" at MLF
And verify the pahse as implement at MLF
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_24|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|25|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Waiting to Deploy|Approved|IBM-SD-ACCESS|
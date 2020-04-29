
#Author: Manish Chaurasia
#Short description: MLF to IBM change integration
#Sprint:
#Release:

Feature:  MLF to IBM change integration V.2

@Eleven
Scenario Outline: Validate the both side’s state when MLF approvers reject the change
#Phase state at MLF: Cancelled
#Phase at MLF: Close
#IBM state : Cancelled
#(CHG00374406\ IBMR=CHG0030842)
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
#And click on the review button
#Then move to IBM change form
#And verify IBM the state after MLF access to change from their end
#And Take Screenshot "<ScreenhsotFoldername>" from first driver
#Then move to MLF change form
#Then verify the pahse state as assess at MLF
#Then verify the pahse as review at MLF
#And Take Screenshot "<ScreenhsotFoldername>" from second driver
#And click on the request approval at MLF
#Then verify the pahse state as "<PhaseState>" at MLF
#Then verify the pahse as authorize at MLF
#Then move to IBM change form
#And verify IBM the state at IBM as "<IBMState>"
#Then move to MLF change form
#And cliks on the group approval tab at MLF
#Then find the MLF group as "<MLFApprovalGroup>" and click on the requested link
#And click on the first requested link on the group 
#Then deny the change
#And clik on the update button
#Then verify the pahse state as "<PhaseState2>" at MLF
#And verify the pahse as close at MLF
#Then move to IBM change form
#And reload the IBM change from page
#And verify IBM the state at IBM as "<IBMState2>"
#Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|TestName|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_26|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|27|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Cancelled|Cancelled|IBM-SD-ACCESS|Test2|

@Twelve
Scenario Outline: Validate the both side’s state when IBM approvers reject the change
#Phase state at MLF: Cancelled
#Phase at MLF: Close
#IBM state : Draft
#Working fine (CHG00374406\ IBMR=CHG0030842) 
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
Then move to IBM change form
And reload the IBM change from page
And click on approver tab at IBM
Then find the IBM group as "<IBMApproverGroup>" and reject the chnage
And verify IBM the state at IBM as "<IBMState2>"
Then move to MLF change form
Then verify the pahse state as "<PhaseState2>" at MLF
Then reload the MLF change from page
And verify the pahse as close at MLF
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_27|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|28|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Draft|Cancelled|IBM-SD-ACCESS|


@Thirteen
Scenario Outline: Validate IBM CTask moves to “In-progress” from “Open” when MLF CTask gets moved to “Work in progress”
#MLF_IBM_ChangeBridge_TC01
#Issue: Sometime IBM bridged task appears at MLF task but the same task does no link with their respective change at IBM end
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
Then move to MLF change taks form
And select the task state as "<MLFTaskState>"
And save the MLF task page
And move to the IBM task form page
Then verify the IBM task sate is getting populated as "<IBMTaskState>"
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|WorkNote|AdditionalComment|MLFTaskState|IBMTaskState|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_11|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|12|Work Note from IBM|Additional Comment from MLF|Work in Progress|In Progress|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_12|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|13|Work Note from IBM|Additional Comment from MLF|Pending|Pending|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_13|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|14|Work Note from IBM|Additional Comment from MLF|Closed Complete|Closed|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_14|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|15|Work Note from IBM|Additional Comment from MLF|Closed Skipped|Canceled|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_15|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|16|Work Note from IBM|Additional Comment from MLF|Closed Cancelled|Canceled|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_16|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|17|Work Note from IBM|Additional Comment from MLF|Closed Rejected|Canceled|

@Fourteen
Scenario Outline: Validate MLF and IBM group approval gets triggered at MLF when user clicks on the “Request approval “ button. 
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
And cliks on the group approval tab at MLF
Then find the MLF group as "<MLFApprovalGroup>" and click on the requested link
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_17|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|18|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Waiting to Deploy|Approved|IBM-SD-ACCESS|


@Fifteen
Scenario Outline: Validate approver of MLF approval group is able to approve the change form MLF side and MLF change state does not move to the “Approved “ since IBM approvers has not approved from their end.
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
And verify IBM the state at IBM as "<IBMState2>"
And reload the IBM change from page
Then move to MLF change form
Then verify the pahse state as "<PhaseState2>" at MLF
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_18|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|19|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Authorize|Pending Approval|IBM-SD-ACCESS|


@Sixteen
Scenario Outline: Validate MLF group is getting displayed as approved under ETD  at IBM side after approving from MLF side
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
And verify IBM the state at IBM as "<IBMState2>"
And reload the IBM change from page
Then move to MLF change form
Then verify the pahse state as "<PhaseState2>" at MLF
Then move to IBM change form
And click on the schedule tab
Then verify the MLF group is getting displayed as approved
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_19|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|20|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Authorize|Pending Approval|IBM-SD-ACCESS|



@Seventeen
Scenario Outline: Validate change moves to “Approved” state at both side after approving by both side approval group 
#Phase state at MLF: Approved
#Phase at MLF: Implement
#IBM state : Waiting to deploy
#Issue:Do not have access in IBM TEST, due to that unable to approve the chnage from IBM side
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
And verify the IBM approval state
And reload the IBM change from page
Then move to MLF change form
Then verify the pahse state as "<PhaseState2>" at MLF
And verify the pahse as implement at MLF
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_21|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|22|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Waiting to Deploy|Approved|IBM-SD-ACCESS|


@Eighteen
Scenario Outline: Validate change moves to “Approved” state at both side after approving by both side approval group 
#Phase state at MLF: Approved
#Phase at MLF: Implement
#IBM state : Waiting to deploy
#Issue:Do not have access in IBM TEST, due to that unable to approve the chnage from IBM side
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
And verify the IBM approval state
And reload the IBM change from page
Then move to MLF change form
Then verify the pahse state as "<PhaseState2>" at MLF
And verify the pahse as implement at MLF
And click on the vendor details tab
Then verify the IBM group is getting displayed as approved
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_20|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|21|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Waiting to Deploy|Approved|IBM-SD-ACCESS|

@Nineteen
Scenario Outline: Validate whether MLF user is not able to close the change without closing its task
#Phase state at MLF: Completed
#Phase at MLF: Close
#IBM state : Closed
#(CHG00374527\ IBMR=CHG0030911)
#Issue:Do not have access in IBM TEST, due to that unable to approve the chnage from IBM side
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
And click on the close button
Then handle the pop up
And select the actual start time
And select the actual end time
And select the closure code
And fill the closure details
And click on the close button
#And handle the last pop up
And then verify the error message
Then verify the pahse state as "<PhaseState2>" at MLF
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_10|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|11|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Waiting to Deploy|Approved|IBM-SD-ACCESS|


@Twenty
Scenario Outline: Validate the both side's  state when MLF complete the change .
#Phase state at MLF: Completed
#Phase at MLF: Close
#IBM state : Closed
#(CHG00374527\ IBMR=CHG0030911)
#Issue:Do not have access in IBM TEST, due to that unable to approve the chnage from IBM side
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
Then cliks on the change task tab
And Take Screenshot "<ScreenhsotFoldername>" from second driver
And  click on the task
And select the task state as "<MLFTaskState>"
And save the MLF task page
Then close the task
And click on the close button
Then handle the pop up
And select the actual start time
And select the actual end time
And select the closure code
And fill the closure details
And click on the close button
And handle the last pop up
Then verify the pahse state as "<PhaseState3>" at MLF
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then move to IBM change form
And verify IBM the state at IBM as "<IBMState3>"
And Take Screenshot "<ScreenhsotFoldername>" from second driver
Then update the test status in sheet in row as "<row_Index>"

Examples:

|Requested for|Country|Item|ScreenhsotFoldername|NameInNaviagtor|Risk|Type|Category|ConfigItem|Impact|ChangeSummary|Description|OwnerGrp|ChngOwnr|Option|TaskShrtDesc|TasktDesc|SynIBM|row_Index|PhaseState|IBMState|MLFApprovalGroup|IBMState2|PhaseState2|IBMApproverGroup|MLFTaskState|IBMState3|PhaseState3|
|poddepa|Canada|Off Catalog Item (Canada, US)|TC_25|Change|Minor|Normal|Business Applications|Manulife Rewards Registration UI - UAT|Asia|Change|Description|MLB-BASS-IPCRA|Heather Stevenson|Number|Task1|Description|IBM_Integ-I-MLF-ACCESS|26|Pending Approval|Authorize|DS-L2SUPP-A-CAN|Waiting to Deploy|Approved|IBM-SD-ACCESS|Closed Complete|Closed|Complete|
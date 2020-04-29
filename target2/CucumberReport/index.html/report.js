$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/snow/feature/ReusableSteps.feature");
formatter.feature({
  "line": 1,
  "name": "Reusable steps",
  "description": "",
  "id": "reusable-steps",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 33,
      "value": "#To create incident from MLF and bridge with any external vendor"
    },
    {
      "line": 34,
      "value": "#ReusableMLFIncBrigdeWithEX"
    }
  ],
  "line": 36,
  "name": "Reusable steps to create incident from MLF and bridge with any external vendor",
  "description": "",
  "id": "reusable-steps;reusable-steps-to-create-incident-from-mlf-and-bridge-with-any-external-vendor",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user launch the ITIL view",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user impersonate the user \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "verify the user profile",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Open new ticket in ServiceNow at MLF",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Fill description and short description along with all mandatory field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "verify if source field does not have value \"\u003cSouce\u003e\" and take screenshot \"\u003cScreenhsotFoldername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "fetch all the contains field of source field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Assign ticket to activated ServiceNow interface which is \"\u003cAssigned To\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Refresh the page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "MLF incident gets bridge with CSC",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "take the CSC incident ticket number and take screenshot \"\u003cScreenhsotFoldername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Clicks on the resolve button after filling category and subcategory as \"\u003crow_Index\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 50,
      "value": "#Then close the browser"
    }
  ],
  "line": 52,
  "name": "",
  "description": "",
  "id": "reusable-steps;reusable-steps-to-create-incident-from-mlf-and-bridge-with-any-external-vendor;",
  "rows": [
    {
      "cells": [
        "Assigned To",
        "Souce",
        "ScreenhsotFoldername",
        "user",
        "row_Index"
      ],
      "line": 54,
      "id": "reusable-steps;reusable-steps-to-create-incident-from-mlf-and-bridge-with-any-external-vendor;;1"
    },
    {
      "cells": [
        "AVAYA_Integ-ServiceDesk-IPCR",
        "Integration from AVAYA",
        "STRY0020671_Inc_ITIL",
        "poddepa",
        "1"
      ],
      "line": 55,
      "id": "reusable-steps;reusable-steps-to-create-incident-from-mlf-and-bridge-with-any-external-vendor;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10660000,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Reusable steps to create incident from MLF and bridge with any external vendor",
  "description": "",
  "id": "reusable-steps;reusable-steps-to-create-incident-from-mlf-and-bridge-with-any-external-vendor;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user launch the ITIL view",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user impersonate the user \"poddepa\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "verify the user profile",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Open new ticket in ServiceNow at MLF",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Fill description and short description along with all mandatory field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "verify if source field does not have value \"Integration from AVAYA\" and take screenshot \"STRY0020671_Inc_ITIL\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "fetch all the contains field of source field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Assign ticket to activated ServiceNow interface which is \"AVAYA_Integ-ServiceDesk-IPCR\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Refresh the page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "MLF incident gets bridge with CSC",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "take the CSC incident ticket number and take screenshot \"STRY0020671_Inc_ITIL\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Clicks on the resolve button after filling category and subcategory as \"1\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.user_launch_the_ITIL_view()"
});
formatter.result({
  "duration": 23011385800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "poddepa",
      "offset": 27
    }
  ],
  "location": "ReusableStepDefFile.user_impersonate_the_user(String)"
});
formatter.result({
  "duration": 22214825500,
  "status": "passed"
});
formatter.match({
  "location": "ReusableStepDefFile.verify_the_user_profile()"
});
formatter.result({
  "duration": 6195966000,
  "status": "passed"
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.Open_new_ticket_in_ServiceNow_at_MLF()"
});
formatter.result({
  "duration": 11543392300,
  "status": "passed"
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.Fill_description_and_short_description_along_with_all_mandatory_field()"
});
formatter.result({
  "duration": 18658952000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Integration from AVAYA",
      "offset": 44
    },
    {
      "val": "STRY0020671_Inc_ITIL",
      "offset": 89
    }
  ],
  "location": "ReusableMLFIncBrigdeWithEX.verify_if_source_field_does_not_have_value(String,String)"
});
formatter.result({
  "duration": 4115969700,
  "status": "passed"
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.fetch_all_the_contains_field_of_source_field()"
});
formatter.result({
  "duration": 251610500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AVAYA_Integ-ServiceDesk-IPCR",
      "offset": 58
    }
  ],
  "location": "ReusableMLFIncBrigdeWithEX.Assign_ticket_to_activated_ServiceNow(String)"
});
formatter.result({
  "duration": 9580994900,
  "status": "passed"
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.Refresh_the_page()"
});
formatter.result({
  "duration": 17214919700,
  "status": "passed"
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.MLF_incident_gets_bridge_with_CSC()"
});
formatter.result({
  "duration": 42106319400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "STRY0020671_Inc_ITIL",
      "offset": 57
    }
  ],
  "location": "ReusableMLFIncBrigdeWithEX.take_the_CSC_incident_ticket_number(String)"
});
formatter.result({
  "duration": 183100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 72
    }
  ],
  "location": "ReusableMLFIncBrigdeWithEX.clicks_on_the_resolve_button(String)"
});
formatter.result({
  "duration": 24605367900,
  "status": "passed"
});
formatter.after({
  "duration": 33150200,
  "status": "passed"
});
});
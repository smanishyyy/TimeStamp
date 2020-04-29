$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/snow/feature/STRY0020960.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Jose Yamin"
    },
    {
      "line": 2,
      "value": "#Short description: Fix for INC03252680 - When requesting Off Catalog Item service, there should be an option to Ship To a user\u0027s address instead of just Shipping to a Stockroom"
    },
    {
      "line": 3,
      "value": "#Sprint: 2019 Open Incident Stories (2019-12-08)"
    },
    {
      "line": 4,
      "value": "#Release: ServiceNow - Stories for Incidents"
    }
  ],
  "line": 6,
  "name": "Fix for INC03252680 - When requesting Off Catalog Item service, there should be an option to Ship To a user\u0027s address instead of just Shipping to a Stockroom",
  "description": "",
  "id": "fix-for-inc03252680---when-requesting-off-catalog-item-service,-there-should-be-an-option-to-ship-to-a-user\u0027s-address-instead-of-just-shipping-to-a-stockroom",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 78,
  "name": "Verify the user is able to submit the request with item \"Off Catalog Item (Canada, US)\"",
  "description": "",
  "id": "fix-for-inc03252680---when-requesting-off-catalog-item-service,-there-should-be-an-option-to-ship-to-a-user\u0027s-address-instead-of-just-shipping-to-a-stockroom;verify-the-user-is-able-to-submit-the-request-with-item-\"off-catalog-item-(canada,-us)\"",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 77,
      "name": "@Fourth"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 79,
      "value": "#STRY0020960_TC01_VerifyDropdown"
    }
  ],
  "line": 80,
  "name": "User logged into Service Now Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "Clicks on Request service link on the home page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 82,
      "value": "#And get the data from sheet as \"\u003crow_Index\u003e\" and column anme as \"\u003cColumnName\u003e\""
    }
  ],
  "line": 83,
  "name": "user select the requested for as with index \"\u003cRequested for\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "User gets select the country as \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "user search the item \"\u003cItem\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "Click on the Item link",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "Verify the title \"\u003cItem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Fill all the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "click on add cart button and submit the request for HP Item \"\u003cScreenhsotFoldername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "store the tciket number in sheet for row as \"\u003crow_Index\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "User launch the IETL view and search the request",
  "keyword": "And "
});
formatter.examples({
  "line": 93,
  "name": "",
  "description": "Examples:",
  "id": "fix-for-inc03252680---when-requesting-off-catalog-item-service,-there-should-be-an-option-to-ship-to-a-user\u0027s-address-instead-of-just-shipping-to-a-stockroom;verify-the-user-is-able-to-submit-the-request-with-item-\"off-catalog-item-(canada,-us)\";",
  "rows": [
    {
      "cells": [
        "Requested for",
        "Country",
        "Item",
        "ScreenhsotFoldername"
      ],
      "line": 95,
      "id": "fix-for-inc03252680---when-requesting-off-catalog-item-service,-there-should-be-an-option-to-ship-to-a-user\u0027s-address-instead-of-just-shipping-to-a-stockroom;verify-the-user-is-able-to-submit-the-request-with-item-\"off-catalog-item-(canada,-us)\";;1"
    },
    {
      "cells": [
        "poddepa",
        "Canada",
        "Off Catalog Item (Canada, US)",
        "STRY0020960_TC01"
      ],
      "line": 96,
      "id": "fix-for-inc03252680---when-requesting-off-catalog-item-service,-there-should-be-an-option-to-ship-to-a-user\u0027s-address-instead-of-just-shipping-to-a-stockroom;verify-the-user-is-able-to-submit-the-request-with-item-\"off-catalog-item-(canada,-us)\";;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 96,
  "name": "Verify the user is able to submit the request with item \"Off Catalog Item (Canada, US)\"",
  "description": "Examples:",
  "id": "fix-for-inc03252680---when-requesting-off-catalog-item-service,-there-should-be-an-option-to-ship-to-a-user\u0027s-address-instead-of-just-shipping-to-a-stockroom;verify-the-user-is-able-to-submit-the-request-with-item-\"off-catalog-item-(canada,-us)\";;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 77,
      "name": "@Fourth"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 79,
      "value": "#STRY0020960_TC01_VerifyDropdown"
    }
  ],
  "line": 80,
  "name": "User logged into Service Now Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "Clicks on Request service link on the home page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 82,
      "value": "#And get the data from sheet as \"\u003crow_Index\u003e\" and column anme as \"\u003cColumnName\u003e\""
    }
  ],
  "line": 83,
  "name": "user select the requested for as with index \"poddepa\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "User gets select the country as \"Canada\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "user search the item \"Off Catalog Item (Canada, US)\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "Click on the Item link",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "Verify the title \"Off Catalog Item (Canada, US)\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Fill all the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "click on add cart button and submit the request for HP Item \"STRY0020960_TC01\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "store the tciket number in sheet for row as \"\u003crow_Index\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "User launch the IETL view and search the request",
  "keyword": "And "
});
formatter.match({
  "location": "ReusableStepDefFile.User_logged_into_Service_Now_Portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReusableStepDefFile.Clicks_on_Request_service_link_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "poddepa",
      "offset": 45
    }
  ],
  "location": "ReusableStepDefFile.user_select_the_requested_for_Index(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Canada",
      "offset": 33
    }
  ],
  "location": "ReusableStepDefFile.User_gets_select_the_country_and_searches_to_the_Item(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Off Catalog Item (Canada, US)",
      "offset": 22
    }
  ],
  "location": "ReusableStepDefFile.user_search_the_item(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReusableStepDefFile.Click_on_the_Item_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Off Catalog Item (Canada, US)",
      "offset": 18
    }
  ],
  "location": "ReusableStepDefFile.Verify_The_Form_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC01_STRY0021103.fill_all_the_mandatory_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "STRY0020960_TC01",
      "offset": 61
    }
  ],
  "location": "ReusableStepDefFile.click_on_add_cart_button_and_submit_the_request(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003crow_Index\u003e",
      "offset": 45
    }
  ],
  "location": "ReusableStepDefFile.store_the_tciket_number_in_sheet_for_row_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReusableStepDefFile.And_User_launch_the_IETL_view_and_search_the_request()"
});
formatter.result({
  "status": "skipped"
});

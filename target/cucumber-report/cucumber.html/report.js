$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ComputerPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page",
  "description": "",
  "id": "computer-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9913968000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should verify Product are arranged in Alphabetical order",
  "description": "",
  "id": "computer-page;user-should-verify-product-are-arranged-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on desktop tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select sort by position Name: Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should verify product will arrange in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 387513300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 950423700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iClickOnDesktopTab()"
});
formatter.result({
  "duration": 558098500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iSelectSortByPositionNameZToA()"
});
formatter.result({
  "duration": 222266400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iShouldVerifyProductWillArrangeInDescendingOrder()"
});
formatter.result({
  "duration": 270262200,
  "status": "passed"
});
formatter.after({
  "duration": 1049751100,
  "status": "passed"
});
formatter.uri("Electronic.feature");
formatter.feature({
  "line": 1,
  "name": "Electronic Test",
  "description": "\r\nAs a user i should navigate to cellphone page and products are added and place order successfully",
  "id": "electronic-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6159139700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to Cell Phone page successfully",
  "description": "",
  "id": "electronic-test;user-should-navigate-to-cell-phone-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover to Electronics Tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover and click on Cell Phones tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to Cell Phone page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 33400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iMouseHoverToElectronicsTab()"
});
formatter.result({
  "duration": 1181093400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iMouseHoverAndClickOnCellPhonesTab()"
});
formatter.result({
  "duration": 1834647700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iShouldNavigateToCellPhonePage()"
});
formatter.result({
  "duration": 63179300,
  "status": "passed"
});
formatter.after({
  "duration": 1129782400,
  "status": "passed"
});
formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage",
  "description": "\r\nAs a user i should navigate to selected menu page",
  "id": "homepage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"\u003cTopmenu tab\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"\u003cNavigate Page\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;",
  "rows": [
    {
      "cells": [
        "Topmenu tab",
        "Navigate Page"
      ],
      "line": 11,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;1"
    },
    {
      "cells": [
        "Computers",
        "Computers"
      ],
      "line": 12,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;2"
    },
    {
      "cells": [
        "Electronics",
        "Electronics"
      ],
      "line": 13,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;3"
    },
    {
      "cells": [
        "Apparel",
        "Apparel"
      ],
      "line": 14,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;4"
    },
    {
      "cells": [
        "Digital downloads",
        "Digital downloads"
      ],
      "line": 15,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;5"
    },
    {
      "cells": [
        "Books",
        "Books"
      ],
      "line": 16,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;6"
    },
    {
      "cells": [
        "Jewelry",
        "Jewelry"
      ],
      "line": 17,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;7"
    },
    {
      "cells": [
        "Gift Cards",
        "Gift Cards"
      ],
      "line": 18,
      "id": "homepage;user-should-navigate-to-selected-menu-page;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6071301000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Computers\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Computers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 33400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 1144940400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 43971100,
  "error_message": "org.junit.ComparisonFailure: Computers expected:\u003cComputers[]\u003e but was:\u003cComputers[ page not display]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Computers\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1754951400,
  "status": "passed"
});
formatter.before({
  "duration": 6380611900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Electronics\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Electronics\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 30300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 728404200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 43972000,
  "error_message": "org.junit.ComparisonFailure: Electronics expected:\u003c[Electronics]\u003e but was:\u003c[Computers page not display]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Electronics\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2093445000,
  "status": "passed"
});
formatter.before({
  "duration": 6483246900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Apparel\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Apparel\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 41600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apparel",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 1030320800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apparel",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 35887700,
  "error_message": "org.junit.ComparisonFailure: Apparel expected:\u003c[Apparel]\u003e but was:\u003c[Computers page not display]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Apparel\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2184785300,
  "status": "passed"
});
formatter.before({
  "duration": 6989946500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Digital downloads\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Digital downloads\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 29700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital downloads",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 1037527500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital downloads",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 45356700,
  "error_message": "org.junit.ComparisonFailure: Digital downloads expected:\u003c[Digital downloads]\u003e but was:\u003c[Computers page not display]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Digital downloads\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2173272600,
  "status": "passed"
});
formatter.before({
  "duration": 5885142700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Books\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Books\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 28200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 1437913400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 45175100,
  "error_message": "org.junit.ComparisonFailure: Books expected:\u003c[Books]\u003e but was:\u003c[Computers page not display]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Books\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1587828800,
  "status": "passed"
});
formatter.before({
  "duration": 6007909000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Jewelry\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Jewelry\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jewelry",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 1465297800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jewelry",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 34701200,
  "error_message": "org.junit.ComparisonFailure: Jewelry expected:\u003c[Jewelr]y\u003e but was:\u003c[Computers page not displa]y\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Jewelry\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1624848200,
  "status": "passed"
});
formatter.before({
  "duration": 6866855000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should navigate to selected menu page",
  "description": "",
  "id": "homepage;user-should-navigate-to-selected-menu-page;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i click on any menu from \"Gift Cards\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i navigate to selected menu page \"Gift Cards\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gift Cards",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iClickOnAnyMenuFrom(String)"
});
formatter.result({
  "duration": 873362200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gift Cards",
      "offset": 34
    }
  ],
  "location": "HomePageSteps.iNavigateToSelectedMenuPage(String)"
});
formatter.result({
  "duration": 44359400,
  "error_message": "org.junit.ComparisonFailure: Gift Cards expected:\u003c[Gift Cards]\u003e but was:\u003c[Computers page not display]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.nopcommerce.demo.steps.HomePageSteps.iNavigateToSelectedMenuPage(HomePageSteps.java:24)\r\n\tat ✽.Then i navigate to selected menu page \"Gift Cards\"(HomePage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2266765300,
  "status": "passed"
});
});
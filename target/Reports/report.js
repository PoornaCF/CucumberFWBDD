$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Math.feature");
formatter.feature({
  "line": 1,
  "name": "Doing Math",
  "description": "As a user of a calculator app\nI want to be able to do math functions\nSo that I can get answers",
  "id": "doing-math",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Adding numbers",
  "description": "",
  "id": "doing-math;adding-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@add"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I have two numbers \"\u003cfirstNum\u003e\" and \"\u003csecondNum\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I \"\u003ccalcMethod\u003e\" them",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the total will be \"\u003ctotal\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "doing-math;adding-numbers;",
  "rows": [
    {
      "cells": [
        "firstNum",
        "calcMethod",
        "secondNum",
        "total"
      ],
      "line": 12,
      "id": "doing-math;adding-numbers;;1"
    },
    {
      "cells": [
        "1",
        "add",
        "2",
        "3"
      ],
      "line": 13,
      "id": "doing-math;adding-numbers;;2"
    },
    {
      "cells": [
        "10",
        "subtract",
        "2",
        "8"
      ],
      "line": 14,
      "id": "doing-math;adding-numbers;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2940352871,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Adding numbers",
  "description": "",
  "id": "doing-math;adding-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@add"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I have two numbers \"1\" and \"2\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I \"add\" them",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the total will be \"3\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "2",
      "offset": 28
    }
  ],
  "location": "calcstepDefs.i_have_two_numbers_and(String,String)"
});
formatter.result({
  "duration": 81167609,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "add",
      "offset": 3
    }
  ],
  "location": "calcstepDefs.i_them(String)"
});
formatter.result({
  "duration": 1313493721,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "calcstepDefs.the_total_will_be(String)"
});
formatter.result({
  "duration": 29416462,
  "status": "passed"
});
formatter.after({
  "duration": 106483578,
  "status": "passed"
});
formatter.before({
  "duration": 2203659215,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adding numbers",
  "description": "",
  "id": "doing-math;adding-numbers;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@add"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I have two numbers \"10\" and \"2\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I \"subtract\" them",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the total will be \"8\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 20
    },
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "calcstepDefs.i_have_two_numbers_and(String,String)"
});
formatter.result({
  "duration": 95580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "subtract",
      "offset": 3
    }
  ],
  "location": "calcstepDefs.i_them(String)"
});
formatter.result({
  "duration": 1391511754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 19
    }
  ],
  "location": "calcstepDefs.the_total_will_be(String)"
});
formatter.result({
  "duration": 25280949,
  "status": "passed"
});
formatter.after({
  "duration": 107023363,
  "status": "passed"
});
});
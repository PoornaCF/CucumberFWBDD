# cuccumber_framework_example

To run the tests from the commad line
-------------------------------------

mvn test

to run with browser:
--------------------
mvn -DBROWSER=firefox test
 
mvn -DBROWSER=chrome test

to run with browser and tags:
-----------------------------

mvn -DBROWSER=chrome -Dcucumber.options="--tags @add" test

mvn -DBROWSER=chrome -Dcucumber.options="--tags @searchemployee" test



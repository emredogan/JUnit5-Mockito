# JUnit5-Mockito
Simple example of test doubles using Mockito and Junit5 with Java

`FootballTeamClassTest.java` file represents some example usages for different kinds of test doubles.
Class has the following test doubles:

**- Dummy:** Dummy football player is created and used as an input parameter.  
**- Stub:** The function is stubbed to return the wanted values, when it is called.  
**- Mock:** Test is checking if the `logScorePlayer` method is called within the FootballTeam class when the `scoreGoal` function is called.  
**- Spy:** Here Spy allows us to track the interactions with the object and also offering access to the methods of the object.  

@JobBoard_Activity_2
Feature: Search a Job and apply
 
  Scenario: Search for a job and apply for it
    Given The user is on job site
    And User has navigated to jobs page
    When Find the Keywords Search Field and type the keyword
    And search for jobs
    And Set the filter job type to show only fulltime job
    And Select one job from the list
    Then Apply for the job
    And close the browser
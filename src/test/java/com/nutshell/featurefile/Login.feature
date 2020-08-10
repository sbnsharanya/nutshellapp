Feature: Creating and publishing a basic app in nutshell


Scenario: Verify user can login and Create new app in nutshell
  Given User launch the nutshell application
  When user enters "saranya25sep88@gmail.com" and "Saranya009$$" and click Login button
  And user click app button and create app in Login page
  And user gives "hellooworld" as screen name and click create button in create new app
  And User selects smartphone, portrait and yes in device settings and click confirm in device settings page
  Then user verify the username displayed in homepage  
  
  Scenario: Verify user create screen component in home page
  Given User clicks screen icon
  When User drag and drop screen component on to the canvas page
  And user edit the screen name as "Startscreen" in Label control
  And user clicks set as start screen in Behaviour control 
  And user click upload image from Background image dropdrown in styling control
  And user click save button 
  Then user verify the file name displayed under styling control in screen properties pannel
  
Scenario: Verify user add title to the screen
  Given user clicks visuals in essential component
  And user drag and drop text component on to the screen
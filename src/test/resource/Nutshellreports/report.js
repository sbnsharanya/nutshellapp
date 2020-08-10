$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/nutshell/featurefile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Creating and publishing a basic app in nutshell",
  "description": "",
  "id": "creating-and-publishing-a-basic-app-in-nutshell",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user can login and Create new app in nutshell",
  "description": "",
  "id": "creating-and-publishing-a-basic-app-in-nutshell;verify-user-can-login-and-create-new-app-in-nutshell",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the nutshell application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"saranya25sep88@gmail.com\" and \"Saranya009$$\" and click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click app button and create app in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user gives \"hellooworld\" as screen name and click create button in create new app",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User selects smartphone, portrait and yes in device settings and click confirm in device settings page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verify the username displayed in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "NutshellStepdefiniton.user_launch_the_nutshell_application()"
});
formatter.result({
  "duration": 2910601600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "saranya25sep88@gmail.com",
      "offset": 13
    },
    {
      "val": "Saranya009$$",
      "offset": 44
    }
  ],
  "location": "NutshellStepdefiniton.user_enters_and_and_click_Login_button(String,String)"
});
formatter.result({
  "duration": 1735592200,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_click_app_button_and_create_app_in_Login_page()"
});
formatter.result({
  "duration": 2963005600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hellooworld",
      "offset": 12
    }
  ],
  "location": "NutshellStepdefiniton.user_gives_as_screen_name_and_click_create_button_in_create_new_app(String)"
});
formatter.result({
  "duration": 1532829800,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_selects_smartphone_portrait_and_yes_in_device_settings_and_click_confirm_in_device_settings_page()"
});
formatter.result({
  "duration": 829166300,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_verify_the_username_displayed_in_homepage()"
});
formatter.result({
  "duration": 5602880600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify user create screen component in home page",
  "description": "",
  "id": "creating-and-publishing-a-basic-app-in-nutshell;verify-user-create-screen-component-in-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User clicks screen icon",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User drag and drop screen component on to the canvas page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user edit the screen name as \"Startscreen\" in Label control",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks set as start screen in Behaviour control",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click upload image from Background image dropdrown in styling control",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click save button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user verify the file name displayed under styling control in screen properties pannel",
  "keyword": "Then "
});
formatter.match({
  "location": "NutshellStepdefiniton.user_clicks_screen_icon()"
});
formatter.result({
  "duration": 1271692100,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_drag_and_drop_screen_component_on_to_the_canvas_page()"
});
formatter.result({
  "duration": 693798100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Startscreen",
      "offset": 30
    }
  ],
  "location": "NutshellStepdefiniton.user_edit_the_screen_name_as_in_Label_control(String)"
});
formatter.result({
  "duration": 1145730600,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_clicks_set_as_start_screen_in_Behaviour_control()"
});
formatter.result({
  "duration": 934520700,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_click_upload_image_from_Background_image_dropdrown_in_styling_control()"
});
formatter.result({
  "duration": 703821500,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_click_save_button()"
});
formatter.result({
  "duration": 216504200,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_verify_the_image_name_displayed_in_screen_properties_pannel()"
});
formatter.result({
  "duration": 69560900,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify user add title to the screen",
  "description": "",
  "id": "creating-and-publishing-a-basic-app-in-nutshell;verify-user-add-title-to-the-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user clicks visuals in essential component",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user drag and drop text component on to the screen",
  "keyword": "And "
});
formatter.match({
  "location": "NutshellStepdefiniton.user_clicks_visuals_in_essential_component()"
});
formatter.result({
  "duration": 830647800,
  "status": "passed"
});
formatter.match({
  "location": "NutshellStepdefiniton.user_drag_and_drop_text_component_on_to_the_screen()"
});
formatter.result({
  "duration": 2327636200,
  "status": "passed"
});
});
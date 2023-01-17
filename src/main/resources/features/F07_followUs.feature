@smoke
  Feature: F07_followUs | users could click on all followUs buttons
    Scenario: user opens facebook link
      When  user opens facebook link
      Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: user clicks on  twitter icon
      When user opens twitter link
      Then "https://twitter.com/nopCommerce" is opened in new tab

    Scenario: user clicks on rss icon
      When user opens rss link
      Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

    Scenario: user clicks on youtube icon
      When user opens youtube link
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab
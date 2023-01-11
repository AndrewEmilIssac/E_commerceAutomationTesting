@smoke
  Feature: F07_followUs | users coulds click on all followus buttons
    Scenario: user opens facebook link
      When user clicks on facebook btn
      Then new tab should be opened

    Scenario: user opens twitter link
      When user clicks on twiiter btn
      Then new twitter tab should be opened

    Scenario: user opens rss link
      When user clicks on rss btn
      Then new rss tab should be opened

    Scenario: user opens youTube link
      When  user opens youtube link
      Then youTube is opened in new tab
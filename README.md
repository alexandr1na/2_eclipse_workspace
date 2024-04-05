# Selenium Test Automation Project
## Description
This Maven project contains automated tests for placing orders on the Magento website using Selenium WebDriver and TestNG. The tests cover various scenarios, including placing orders as an anonymous user, placing orders without certain details, and placing orders as a logged-in user.

## Setup Instructions
- Clone the repository to your local machine.
- Ensure you have Maven installed.
- Make sure you have the latest version of Chrome installed, as the tests use ChromeDriver for browser automation.
- Open a terminal or command prompt and navigate to the project directory.
- Run the command mvn test to execute all the tests

## Test Descriptions
- testOrderPlacementWithAnonymiusUser: Tests the process of placing an order for a non-logged-in user, including selecting a product, completing address details, and placing the order.
- testOrderPlacementWithAnonymiusUserWithoutTelNr: Tests placing an order for a non-logged-in user without providing a telephone number. Verifies that an error message is displayed.
- testOrderPlacementWithAnonymiusUserWithoutPostalCode: Tests placing an order for a non-logged-in user without providing a postal code. Verifies that an error message is displayed.
- testOrderPlacementWithLoggedUser: Tests placing an order for a logged-in user, including creating a new user, selecting a product, completing address details, and placing the order.
- testOrderPlacementWithLoggedUserWithoutShippingMethod: Tests placing an order for a logged-in user without selecting a shipping method. Verifies that an error message is displayed.

Contributors
[Alexandrina] - [alexandrina.cosciuc@gmail.com]
Feel free to contribute to this project by submitting pull requests or reporting issues. For any questions or inquiries, please contact [alexandrina.cosciuc@gmail.com].

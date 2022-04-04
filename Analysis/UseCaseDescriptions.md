## Use cases 

|Use case|1|
|---------------|---|
|**Name**           |Browse products|
|**Actor**          |Customer|
|**Description**    |A customer browses the products on the application.|
|**Pre-condition**  |None.|
|**Scenario**       |1. Customer chooses to browse products.<br>2. System displays list of products, with each product having an option for purchase, for more details to be seen and an option for price alerts request, filtering/search options and an option to view popular products.|
|**Result**         |Customer has seen the browsing options.|
|**Extensions**     |None.|
|**Exceptions**     |None.| 

|Use case|2|
|---|---|
|**Name**|View popular products|
|**Actor**|Customer|
|**Description**|Customer views popular products.|
|**Pre-condition**|None.|
|**Scenario**|1. Customer <u>browses products</u>.<br>2. Customer chooses to view popular products.<br>3. System shows a list of the most popular products.|
|**Result**|Customer has access to the list of most popular products.|
|**Extensions**|3a. Customer chooses to view a product's details.<br> 1. System shows a list containing the details of the chosen product.<br>3a. Customer chooses to request price alerts for a product.<br>1. System displays confirmation of the request and asks the user for maximum price input.<br>4. User provides the input.<br>5. System displays a confirmation.<br>3a. Customer chooses to purchase a product. |
|**Exceptions**|None.|

|Use case|3|
|---|---|
|**Name**|View product's details|
|**Actor**|Customer|
|**Description**|Customer views product's details.|
|**Pre-condition**|None.|
|**Scenario**|1. Customer <u>browses products</u>.<br>2. Customer chooses to view a product's details.<br>3. System shows a list containing the details of the chosen product.|
|**Result**|Customer has access to a product's details.|
|**Extensions**|None.|
|**Exceptions**|None.|

|Use case|4|
|---|---|
|**Name**|Filter products based on a criteria|
|**Actor**|Customer|
|**Description**|Customer filters products based on a certain criteria.|
|**Pre-condition**|None.|
|**Scenario**|1. Customer <u>browses products</u>.<br>2. Customer chooses the filter option.<br>3. System displays an option for input. <br>4. Customer enters keyword for filter.<br>5. System shows lists of products matching the input.|
|**Result**|Customer has access to a list of products that match given filter criteria.|
|**Extensions**|5a. Customer chooses to view a product's details.<br> 1. System shows a list containing the details of the chosen product.<br>5a. Customer chooses to request price alerts for a product.<br>2. System displays confirmation of the request and asks the user for maximum price input.<br>4. User provides the input.<br>5. System displays a confirmation.|
|**Exceptions**|5. No products matching filter criteria.|

|Use case|5|
|---|---|
|**Name**|Request price alert|
|**Actor**|Customer|
|**Description**|Customer requests price alerts for a product.|
|**Pre-condition**|None.|
|**Scenario**|1. Customer <u>browses products</u>.<br>2. Customer chooses to request price alerts for a product.<br>3. System displays confirmation of the request and asks the user for maximum price input.<br>4. User provides the input.<br>5. System displays a confirmation.|
|**Result**|Customer has requested price alerts for a product and has given a maximum price they would pay for it.|
|**Extensions**|None.|
|**Exceptions**|None.|

|Use case|6|
|---|---|
|**Name**|Add product|
|**Actor**|Employee|
|**Description**|Employee adds a new product to the applcation.|
|**Pre-condition**|User must be logged in as an employee.|
|**Scenario**|1. Employee chooses an option to add a product.<br>2. System asks the user for description, title and price of the product and displays an option to take a picture.<br>3. Employee inputs the information and confirms.<br>4. System displays a confirmation and shows the product's details.|
|**Result**|Employee has added a new product to the application.|
|**Extensions**|3a. User chooses to take a picture of the product.<br>1. System opens camera.<br>2. User chooses to take a picture.<br>3. System displays confirmation of the picture taken. Return to step 3.|
|**Exceptions**|4. System message: "Insufficient information!".<br>4.1 Use case ends here.|

|Use case|7|
|---|---|
|**Name**|View store's location|
|**Actor**|Customer|
|**Description**|Customer views a store's location.|
|**Pre-condition**|None.|
|**Scenario**|1. Customer chooses to view a list of stores.<br>2. System displays a list of all the stores available.<br>3. Customer chooses a store.<br>4. System shows a map with the location of the chosen store and a route to it from the location of the customer.|
|**Result**|Customer has seen the location of a chosen store and the route to it.|
|**Extensions**|None.|
|**Exceptions**|None.|

|Use case|8|
|---|---|
|**Name**|Purchase product|
|**Actor**|Customer|
|**Description**|Customer purchases a product.|
|**Pre-condition**|None.|
|**Scenario**|1. Customer <u>browses products</u>.<br>2. Customer chooses to purchase a product.<br>3. System redirects the user to an external website where the order can be completed.|
|**Result**|Customer has purchased a product.|
|**Extensions**|None.|
|**Exceptions**|None.|
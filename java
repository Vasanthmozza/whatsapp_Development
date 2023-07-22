1. Maximize window:
To maximize a browser window, we need to call the maximize() method of the Window interface of the driver class. Add the second line right below where you define an instance of FirefoxDriver.
Example: 
driver = new FirefoxDriver(); 
driver.manage().window().maximize();

2. Delete cookies
Delete all the cookies for the current domain using deleteAllCookies() method.
Example:
driver.manage().deleteAllCookies();

Deleting the specific cookie with cookie name "--abcd"
driver.manage().deleteCookieNamed("__abcd");

3. Get command:
The command launches a new browser and opens the specified URL in the browser instance
The command takes a single string type parameter that is usually a URL of application under test.
Example: driver.get("https://google.com");

done


  video call  audio call 
   features

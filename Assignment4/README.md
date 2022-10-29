# Design patterns

### Requirement 1

##### The color is reporsented by the value of red, green and blue, the value for each ranges from 0-255

### Solution
##### the Color constuctor takes 3 patameters of type int, these parameters represents the Red green and blue values, it throws an exception if one of the values is out of range

### Requirement 2

##### The application will create one instance only for each color

### Solution
##### The color class have a method for generating a unique key, each instance will be inserted into a hashmap with it's key, whenever the user try to add new color the program will check if the color exist in the hashmap, if true it will return the existing instance, otherwise it will instantiate new instance and insert it with it's key

### Requirement 3

##### The color instance is immutable

### Solution
##### The color class is a final class, so it can’t be extended, all properties are private so that direct access is not allowed, and final so that its value can be assigned only once, the methods that need to return a value will return a copy of it, not the value itself so it can't be modfied.

### Requirement 4

##### By default, common colors are returned from cache which are Black, White, Green, Red, and Blue

### Solution
##### The ColorStore class have a static block that will instantiate the default colors and add them to the hashmap

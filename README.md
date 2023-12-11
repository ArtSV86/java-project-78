### Hexlet tests and linter status:
[![Actions Status](https://github.com/ArtSV86/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/ArtSV86/java-project-78/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/7dbce38435d59151487e/maintainability)](https://codeclimate.com/github/ArtSV86/java-project-78/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/7dbce38435d59151487e/test_coverage)](https://codeclimate.com/github/ArtSV86/java-project-78/test_coverage)

### **Data validator**

**Data validator** is a library for checking the correctness of the entered data: String, Number, Map. The library has the methods to work with data:
1. **String:**
  - ***required()*** - checking whether a string is not _null_ or empty,
  - ***minLength()*** - checking if a string is more or equals given length,
  - ***contains()*** - checking if a string contains a given substring.
2. **Number:**
  - ***required()*** - checking whether a number is not _null_,
  - ***positive()*** - checking if a number is positive,
  - ***range()*** - checking whether a number is in the range.
3. **Map:**
  - ***required()*** - checking whether a map is not _null_,
  - ***sizeof()*** - checking whether a map is equal to a given size,
  - ***shape()*** - allows to describe validation for inserted objects of Map by keys.

![Screenshot 1](https://github.com/ArtSV86/java-project-78/blob/main/app/Screenshots/Screenshot%201%20(project).jpg)
![Screenshot 2](https://github.com/ArtSV86/java-project-78/blob/main/app/Screenshots/Screenshot%202%20(project).jpg)
![Screenshot 3](https://github.com/ArtSV86/java-project-78/blob/main/app/Screenshots/Screenshot%203%20(project).jpg)
![Screenshot 4](https://github.com/ArtSV86/java-project-78/blob/main/app/Screenshots/Screenshot%204%20(project).jpg)

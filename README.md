<!-- PROJECT LOGO -->
<br />

![GitHub repo size](https://img.shields.io/github/repo-size/dylandasilva1999/zap-quiz-app?color=%23e61e25)
![GitHub watchers](https://img.shields.io/github/watchers/dylandasilva1999/zap-quiz-app?color=%23e61e25)
![GitHub language count](https://img.shields.io/github/languages/count/dylandasilva1999/zap-quiz-app?color=%23e61e25)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/dylandasilva1999/zap-quiz-app?color=%23e61e25)

<h6 align="center">Dylan da Silva Android 301</h6>
<p align="center">
</br>
   
  <a href="https://github.com/dylandasilva1999/zap-quiz-app">
    <img src="Images/App Icon.png" alt="Logo" width="140" height="140">
  </a>
  
  <h3 align="center">Zap!</h3>

  <p align="center">
    Superhero Trivia
  </p>

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
* * [Project Description](#project-description)
  * [Built with](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [How to install](#how-to-install)
* [Features and Functionality](#features-and-functionality)
   * [Features](#features)
   * [Functionality](#functionality)
* [Concept Process](#concept-process)
   * [Ideation](#ideation)
   * [Wireframes](#wireframes)
   * [User-flow](#user-flow)
* [Development Process](#development-process)
   * [Implementation](#implementation)
   * [Peer Reviews](#peer-reviews)
* [Video Demonstration](#video-demonstration)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)

<!--PROJECT DESCRIPTION-->
## About the Project

![image1][image1]

### Project Description

According to research on the topic "The Psychology Of Why You Love Superheroes" in 2017, alongside further research done at the Kyoto University in Japan "humans are drawn to heroes from early stages of development" and want to challange superhero lovers into some trivia. What is another name for Superman? In which Marvel comic did Elektra make her debut?

Zap! is a challenging, fun and interactive trivia quiz game! Zap! will put your superhero knownledge to the test and educate you on interesting history, comic, movies and general superhero trivia.

### Built With

* [Android Studio](https://developer.android.com/studio)
* [Kotlin](https://kotlinlang.org/)
* [GitHub](https://github.com/)

<img src="https://upload.wikimedia.org/wikipedia/commons/3/34/Android_Studio_icon.svg" width="5%" height="5%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://upload.wikimedia.org/wikipedia/commons/b/b5/Kotlin-logo.png" width="5%" height="5%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://upload.wikimedia.org/wikipedia/commons/9/91/Octicons-mark-github.svg" width="5%" height="5%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<!-- GETTING STARTED -->
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Ensure that you have the latest version of Android Studio installed on your machine. The Kotlin plugin will also be required.

### How to install

### Installation
Here are a couple of ways to clone this repo:

1. Android Studio </br>
`Android Studio` -> `File` -> `New` -> `From Version Control` -> `Git`</br>
Enter `https://github.com/dylandasilva1999/zap-quiz-app.git` into the URL field and press the `Clone` button.

2. Command-line + Android Studio </br>
Run the following in the command-line to clone the project:
   ```sh
   git clone https://github.com/dylandasilva1999/zap-quiz-app.git
   ```
Open `Android Studio` and select `File | Open...` from the menu. Select cloned directory and press `Open` button

<!-- FEATURES AND FUNCTIONALITY-->
## Features and Functionality

### Features

![image2][image2]
* Users can enter and add their name.
* See the highest score of each category.

![image3][image3]

* Choose from a range of 4 categories.
  - The categories are General, History, Movies and Comics.
  - Each category has their own themed design.
* Awnser questions in each category.
  - Test your overall Superhero knowledge.
* Instant validation when the user selects an answer.

![image4][image4]

* Results page to display amount of correct answers.
* Added a custom animation when opening the app.

### Functionality

* `Relative`, `Linear` and `Grid` layouts were used to create the layouts.
* Four `Activities` were used to create the different quiz categories.
* `Progress Bars` are utilised on each category quiz to indicate which question the user is on.
* A `Constants` file holds all the questions in an `ArrayList`.
* `SharedPreferences` is used the hold each category's highest scores.
* `Intents` are used to keep track of the name of the user and the category name that is displayed on the results page.

<!-- CONCEPT PROCESS -->
## Concept Process

The `Conceptual Process` is the set of actions, activities and research that was done when starting this project.

### Ideation

![image5][image5]

### Wireframes

![image6][image6]

### User-flow

![image7][image7]

<!-- DEVELOPMENT PROCESS -->
## Development Process

The `Development Process` is the technical implementations and functionality done in the backend of the application.

### Implementation

#### Challenges

* Learning how to use the different layout for different purposes and how it integrates into Kotlin.
* Making the application responsive to various screen types was a great learning curve challenge.
* User validation when moving from one question to another.
* Using `SharedPreferences` to store the highest score of each category.
* Understanding the use of `Activities` as means of navigation and functionality.
* Making use of `Intents` to transfer data from one activity to another.

### Peer Reviews

The `Peer Reviews` were conducted by my fellow students and lecturer.

#### Feedback

* The user need to hide the keyboard before they can click the `Start` button.
* The overall theme is unique, fun and creative.
* Improve the user experience, when the user wants to move onto the next question they have press two `Buttons`, rather consider one `Button`.
* The navigation flow makes complete sense.
* Add slogan to the splash screen to give more context to the application.

#### Future Changes

* Remove the two `Button` interaction.
* Add a slogan to the splash screen.
* Update the enterNameView that the button shows after user typed their name.

<!-- VIDEO DEMONSTRATION -->
## Video Demonstration

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/dylandasilva1999/zap-quiz-app/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- AUTHORS -->
## Authors

* **Dylan da Silva** - [DylandaSilva](https://github.com/dylandasilva1999)

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.\

<!-- LICENSE -->
## Contact

* **Dylan da Silva** - 190082@virtualwindow.co.za
* **Project Link** - https://github.com/dylandasilva1999/zap-quiz-app

<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* [Android Documenation](https://developer.android.com/docs)
* [Flat Icon](https://www.flaticon.com/)
* [Animations](https://www.youtube.com/watch?v=3DR4DiU_rmw)
* [Layout](https://www.youtube.com/watch?v=OCceWupZ_Ik)
* [Code Assist](https://www.youtube.com/watch?v=b21fiIyOW4A)

<!-- MARKDOWN LINKS & IMAGES -->
[image1]: Images/Image1.png
[image2]: Images/Image2.png
[image3]: Images/Image3.png
[image4]: Images/Image4.png
[image5]: Images/Image5.png
[image6]: Images/Image6.png
[image7]: Images/Image7.png

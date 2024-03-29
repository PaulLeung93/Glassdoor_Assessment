# [Glassdoor Inc](https://www.glassdoor.com) Homework Project

## License agreement

By accessing and using this project in whole or in part, you agree to [the following terms and conditions](LICENSE.md).

## Assignment

Bring an existing project to release state and present it during the **Live Homework Assessment**.
The assignment has two components that will be assessed: following clear instructions and overall understanding of the project.

You have **48 hours** from receiving this assignment to submit your results.
The finished work must be available on [GitHub](https://github.com), and a link to the project repository must be provided before the next interview.
After the deadline, **every 4 hours of delay** are counted as **minus 1 point**.

### Preparations

- [X] Download and install the latest (stable) version of [Android Studio](https://developer.android.com/studio)
- [X] Download and extract the **Homework Project** to the destination folder
- [X] [Enable version control system for the project](https://docs.github.com/en/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github)

### Instructions

Each individual instruction about what should be done will be defined using a `TODO` and may contain a link to a resource with the corresponding topic or examples.
For each correctly completed instruction, **1 point** is awarded, which must then be defended at the **Live Homework Assessment** interview.

#### TODO

- [X] [AndroidManifest.xml](app/src/main/AndroidManifest.xml): [Define the required permissions](https://developer.android.com/develop/connectivity/network-ops/connecting)
- [X] [AndroidManifest.xml](app/src/main/AndroidManifest.xml): [Specify application class](https://developer.android.com/reference/android/app/Application)
- [X] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): [Declare the UI](https://developer.android.com/codelabs/jetpack-compose-basics#5) based on the UI model structure
- [X] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): [Request an image download](https://github.com/coil-kt/coil#requests)
- [X] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): Define UI models for preview purposes
- [X] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): Define UI models for preview purposes
- [X] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): Specify the [item key](https://developer.android.com/jetpack/compose/lists#item-keys) and [content type](https://developer.android.com/jetpack/compose/lists#content-type)
- [X] [CoroutineModule.kt](app/src/main/java/com/glassdoor/intern/utils/coroutine/CoroutineModule.kt): [Annotate the DI module](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules) with correct definitions and [component](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules)
- [X] [CoroutineModule.kt](app/src/main/java/com/glassdoor/intern/utils/coroutine/CoroutineModule.kt): Annotate dependency with the correct [qualifier label](https://developer.android.com/training/dependency-injection/hilt-android#multiple-bindings)
- [X] [DomainModule.kt](app/src/main/java/com/glassdoor/intern/domain/di/DomainModule.kt): Determine the [appropriate annotation](https://developer.android.com/codelabs/android-hilt#6) and provide the most optimal [scope component](https://developer.android.com/training/dependency-injection/hilt-android#generated-components)
- [X] [ErrorMessageComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ErrorMessageComponent.kt): Call an action that hides the error message
- [X] [ErrorMessageComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ErrorMessageComponent.kt): Define how long the error message will be displayed
- [X] [ErrorMessageComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ErrorMessageComponent.kt): Define the [background color](https://developer.android.com/jetpack/compose/modifiers#scope-safety), as well as [the color, style, and alignment](https://developer.android.com/jetpack/compose/text/style-text) of the error message
- [X] [HeaderInfo.kt](app/src/main/java/com/glassdoor/intern/domain/model/HeaderInfo.kt): Determine undefined model properties
- [X] [HeaderInfoDto.kt](app/src/main/java/com/glassdoor/intern/data/model/HeaderInfoDto.kt): Define the structure of the DTO model based on the server response
- [X] [HeaderInfoMapper.kt](app/src/main/java/com/glassdoor/intern/data/mapper/HeaderInfoMapper.kt): Complete the transformation logic
- [X] [HeaderUiModel.kt](app/src/main/java/com/glassdoor/intern/presentation/model/HeaderUiModel.kt): Define empty state
- [X] [HeaderUiModel.kt](app/src/main/java/com/glassdoor/intern/presentation/model/HeaderUiModel.kt): Define the structure of the UI model based on the domain model
- [X] [HeaderUiModelMapper.kt](app/src/main/java/com/glassdoor/intern/presentation/mapper/HeaderUiModelMapper.kt): Convert domain model to UI model
- [X] [HeaderUiModelMapper.kt](app/src/main/java/com/glassdoor/intern/presentation/mapper/HeaderUiModelMapper.kt): Define date formatting pattern
- [X] [InfoApi.kt](app/src/main/java/com/glassdoor/intern/data/source/InfoApi.kt): Apply the [get annotation](https://square.github.io/retrofit) and specify the correct endpoint from `BuildConfig`
- [X] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert DTO into domain model
- [X] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert to error
- [X] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert to error
- [X] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert to error
- [X] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Inject the correct mapper dependency
- [X] [ItemUiModel.kt](app/src/main/java/com/glassdoor/intern/presentation/model/ItemUiModel.kt): Determine the key value
- [X] [LoggingModule.kt](app/src/main/java/com/glassdoor/intern/utils/logging/LoggingModule.kt): [Annotate the DI module](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules) with correct definitions and [component](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules)
- [X] [MainActivity.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainActivity.kt): [Annotate a class for dependency injection](https://developer.android.com/training/dependency-injection/hilt-android#android-classes)
- [X] [MainActivity.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainActivity.kt): Define the main composable to display
- [X] [MainModule.kt](app/src/main/java/com/glassdoor/intern/presentation/di/MainModule.kt): Define default values and provide initial state
- [X] [MainScreen.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainScreen.kt): [Consume UI state safely from the ViewModel](https://developer.android.com/codelabs/jetpack-compose-advanced-state-side-effects#3)
- [X] [MainScreen.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainScreen.kt): Define UI state for preview purposes
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Define the correct methods as callbacks
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Delegate method to `uiStateMachine`
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Emit the transformed UI model as state
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Inject the correct header mapper dependency
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Refresh the screen only when the header is empty
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Separate handling and update correct properties `previousUiState`
- [X] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Transform the header domain model to the UI model
- [X] [Strings.xml](app/src/main/res/values/strings.xml): Provide a suitable application name
- [X] [TokenInterceptor.kt](app/src/main/java/com/glassdoor/intern/data/network/TokenInterceptor.kt): Declare the email address from your resume as a token
- [X] [TopBarComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/TopBarComponent.kt): Declare a [title](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Text(androidx.compose.ui.text.AnnotatedString,androidx.compose.ui.Modifier,androidx.compose.ui.graphics.Color,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.font.FontStyle,androidx.compose.ui.text.font.FontWeight,androidx.compose.ui.text.font.FontFamily,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextDecoration,androidx.compose.ui.text.style.TextAlign,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextOverflow,kotlin.Boolean,kotlin.Int,kotlin.Int,kotlin.collections.Map,kotlin.Function1,androidx.compose.ui.text.TextStyle)) using the app name resource from strings
- [X] [TopBarComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/TopBarComponent.kt): Define a component and use the state to preview it
- [X] [TopBarComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/TopBarComponent.kt): Define all possible states for preview purposes

#### Bonus points

- [X] The application does not crash
- [ ] The previously loaded list remains on the screen after the error appears
- [X] All fulfilled `TODO` instructions remain in place, and the prefix is replaced with the word `DONE`
- [X] The project's change history has the [conventional commit messages](https://www.conventionalcommits.org/en/v1.0.0)
- [X] [The project has a history of changes](https://git-scm.com/book/en/v2/Git-Basics-Recording-Changes-to-the-Repository)

#### What does not affect the rating

- [ ] Aesthetics and visual style
- [ ] Selecting a component layout

### Understanding

In the **Live Homework Assessment**, it's essential that the candidate can clearly explain the reasoning behind their decisions and modifications in the Homework assignment.
The primary goal of this session is to gain insight into the candidate's problem-solving approach and their rationale for the choices made during the assignment.

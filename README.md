# ToasterTest

Testing custom android libraries.

# How to use
1. Add this to your build.gradle project level:
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
````
2. Add this to your build.gradle app level:
```
dependencies {
    implementation 'com.github.frcnetto:ToasterTest:Tag'
}
```
3. Rebuild your project.

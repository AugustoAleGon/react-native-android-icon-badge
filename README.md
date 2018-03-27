
# react-native-android-icon-badge

## Getting started

`$ npm install react-native-android-icon-badge --save`

### Mostly automatic installation

`$ react-native link react-native-android-icon-badge`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAndroidIconBadgePackage;` to the imports at the top of the file
  - Add `new RNAndroidIconBadgePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-android-icon-badge'
  	project(':react-native-android-icon-badge').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-android-icon-badge/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-android-icon-badge')
  	```


## Usage
```javascript
import RNAndroidIconBadge from 'react-native-android-icon-badge';

// TODO: What to do with the module?
RNAndroidIconBadge;
```
  
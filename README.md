
# react-native-secure-store

## Getting started

`$ npm install react-native-secure-store --save`

### Mostly automatic installation

`$ react-native link react-native-secure-store`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-secure-store` and add `RNSecureStore.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSecureStore.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.securestore.RNSecureStorePackage;` to the imports at the top of the file
  - Add `new RNSecureStorePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-secure-store'
  	project(':react-native-secure-store').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-secure-store/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-secure-store')
  	```


## Usage
```javascript
import RNSecureStore from 'react-native-secure-store';

// TODO: What to do with the module?
RNSecureStore;
```
  
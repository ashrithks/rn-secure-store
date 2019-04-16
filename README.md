
# react-native-secure-store
  React Native Library for securely storing keys to iOS and Android devices in KeyChain and KeyStore respectively

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
import RNSecureStore, {ACCESSIBLE} from "react-native-secure-store";

// For storing key
RNSecureStore.set("key1", "value1", {accessible: ACCESSIBLE.ALWAYS_THIS_DEVICE_ONLY})
	.then((res) => {
		console.log(res);
	}, (err) => {
		console.log(err);
	});

// For retrieving key
RNSecureStore.get("key1")
	.then((res) => {
		console.log(res);
	}, (err) => {
		console.log(err);
	});

// For removing key
RNSecureStore.remove("key1")
	.then((res) => {
		console.log(res);
	}, (err) => {
		console.log(err);
	});	
```
  
## License

The MIT License (MIT)

Copyright (c) 2019 ashrithks

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
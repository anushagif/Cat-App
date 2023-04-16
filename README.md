# Cat-App


Step 1. To add cat library to your android app


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.anushagif:Cat-App:1.1'
	}

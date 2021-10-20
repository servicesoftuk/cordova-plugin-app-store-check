# Cordova AppStoreCheck plugin

A plugin to determine whether or not the app was installed via an app store. Currently only works for Android and the Google play store but may be expanded in future to include iOS.

## Installation

### With cordova-cli

If you are using [cordova-cli](https://github.com/apache/cordova-cli), install
with:

    cordova plugin add cordova-plugin-app-store-check

## Use from Javascript

To use the plugin call cordova.plugins.appstorecheck
````javascript
cordova.plugins.appstorecheck.isInstalledFromAppStore(function(installedFromAppStore) {
  alert(installedFromAppStore);
});
````

### Output
isInstalledFromAppStore() returns a string "true" if the app was installed from the google play store, otherwise "false".

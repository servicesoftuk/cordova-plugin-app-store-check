# Cordova AppStoreCheck plugin

A plugin to determine whether or not the app was installed via an app store. Currently only works for Android and the Google play store but may be expanded in future to include iOS.

## Installation

### With cordova-cli

If you are using [cordova-cli](https://github.com/apache/cordova-cli), install
with:

    cordova plugin add cordova-plugin-app-store-check

## Use from Javascript

If you are using jQuery, AngularJS, WinJS or any Promise/A library (Bluebird), promise style is supported. Use something like:
````javascript
    cordova.plugins.appstorecheck.isInstalledFromAppStore().then(function (installedFromAppStore) {
        alert(installedFromAppStore);
    });
````

If not, pass a callback function:
````javascript
cordova.plugins.appstorecheck.isInstalledFromAppStore(function(installedFromAppStore) {
  alert(installedFromAppStore);
});
````

### Output
isInstalledFromAppStore() returns 1 if the app was installed from the google play store, otherwise 0.

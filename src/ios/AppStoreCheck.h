/********* Echo.h Cordova Plugin Header *******/

#import <Cordova/CDVPlugin.h>

@interface AppStoreCheck : CDVPlugin

- (void)isInstalledFromAppStore:(CDVInvokedUrlCommand*)command;

@end
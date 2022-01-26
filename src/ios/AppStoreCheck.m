/********* Echo.m Cordova Plugin Implementation *******/

#import "AppStoreCheck.h"
#import <Cordova/CDVPlugin.h>

@implementation AppStoreCheck

- (void)isInstalledFromAppStore:(CDVInvokedUrlCommand*)command
{
    NSString* callbackId = command.callbackId;
    NSInteger* result = 0;
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsInt:result];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackId];
}

@end
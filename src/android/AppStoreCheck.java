package uk.co.servicesoft.cordova;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.content.Context;
import android.content.IntentSender;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
// import java.util.ArrayList;
// import java.util.List;

/**
 * This class echoes a string called from JavaScript.
 */
public class AppStoreCheck extends CordovaPlugin {
	CallbackContext _callbackContex;

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		_callbackContex=callbackContext;
		Context testParameter = (cordova.getActivity()).getBaseContext();

		if (action.equals("isInstalledFromAppStore"))
		{
			Context context = this.cordova.getActivity().getApplicationContext();
         
            List<String> validInstallers = new ArrayList<>(Arrays.asList("com.android.vending", "com.google.android.feedback"));
    
            // The package name of the app that has installed your app
            final String installer = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        
            callbackContext.success(Boolean.toString(installer != null && validInstallers.contains(installer)));
            // true if your app has been downloaded from Play Store 

			return true;
		}

		return false;
	}
}

package uk.co.servicesoft.cordova;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.content.Context;
import android.content.IntentSender;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

public class AppStoreCheck extends CordovaPlugin {
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("isInstalledFromAppStore"))
		{
			Context context = this.cordova.getActivity().getApplicationContext();
         
            List<String> validInstallers = new ArrayList<>(Arrays.asList("com.android.vending", "com.google.android.feedback"));
    
            // The package name of the app that has installed your app
            final String installer = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        
			boolean result = installer != null && validInstallers.contains(installer);
            callbackContext.success(result ? 1 : 0);           

			return true;
		}

		return false;
	}
}

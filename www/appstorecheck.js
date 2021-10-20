var exec = require('cordova/exec');

exports.isInstalledFromAppStore = function (success, error) {
	exec(success, error, 'appstorecheck', 'isInstalledFromAppStore');
};

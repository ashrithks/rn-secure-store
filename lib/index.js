'use strict';

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.ACCESSIBLE = undefined;

var _reactNative = require('react-native');

var ACCESSIBLE = exports.ACCESSIBLE = {
  WHEN_UNLOCKED: 'AccessibleWhenUnlocked',
  AFTER_FIRST_UNLOCK: 'AccessibleAfterFirstUnlock',
  ALWAYS: 'AccessibleAlways',
  WHEN_PASSCODE_SET_THIS_DEVICE_ONLY: 'AccessibleWhenPasscodeSetThisDeviceOnly',
  WHEN_UNLOCKED_THIS_DEVICE_ONLY: 'AccessibleWhenUnlockedThisDeviceOnly',
  AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY: 'AccessibleAfterFirstUnlockThisDeviceOnly',
  ALWAYS_THIS_DEVICE_ONLY: 'AccessibleAlwaysThisDeviceOnly'
};

var RNSecureStore = _reactNative.NativeModules.RNSecureStore;
exports.default = RNSecureStore;
//# sourceMappingURL=index.js.map
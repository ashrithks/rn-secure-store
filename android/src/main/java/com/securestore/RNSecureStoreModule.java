
package com.securestore;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.securestore.SharedDataProvider;
import com.securestore.SharedHandler;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;


public class RNSecureStoreModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNSecureStoreModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNSecureStore";
    }

    @ReactMethod
    public void set(String key, String value, @Nullable ReadableMap options, Promise promise) {
        try {
            SharedHandler.init(getReactApplicationContext());
            SharedDataProvider.putSharedValue(key,value);
            promise.resolve("stored text in app storage");
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("message\":" + e.getMessage());
        }
    }


    @ReactMethod
    public void get(String key, Promise promise) {
        try {
            SharedHandler.init(getReactApplicationContext());
            String value = SharedDataProvider.getSharedValue(key);
            promise.resolve(value);
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("message\":" + e.getMessage());
        }
    }


    @ReactMethod
    public void remove(String key, Promise promise) {
        try {
            SharedHandler.init(getReactApplicationContext());
            SharedDataProvider.deleteSharedValue(key);
            promise.resolve("cleared alias");
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("message\":" + e.getMessage());
        }
    }

}
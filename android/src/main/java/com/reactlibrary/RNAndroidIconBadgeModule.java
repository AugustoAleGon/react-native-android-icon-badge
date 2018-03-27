
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import me.leolin.shortcutbadger.ShortcutBadger;

public class RNAndroidIconBadgeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAndroidIconBadgeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAndroidIconBadge";
  }

  @ReactMethod
  public void setIconBadge(int num) {
      ShortcutBadger.applyCount(getReactApplicationContext(), num);
  }
  
}
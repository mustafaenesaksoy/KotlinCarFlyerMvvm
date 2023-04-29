package com.enesaksoy.kotlincarflyer.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.enesaksoy.kotlincarflyer.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToFeedFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_feedFragment);
  }
}

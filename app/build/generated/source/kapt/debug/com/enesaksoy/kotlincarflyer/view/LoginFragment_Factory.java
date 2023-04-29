// Generated by Dagger (https://dagger.dev).
package com.enesaksoy.kotlincarflyer.view;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginFragment_Factory implements Factory<LoginFragment> {
  private final Provider<FirebaseAuth> authProvider;

  public LoginFragment_Factory(Provider<FirebaseAuth> authProvider) {
    this.authProvider = authProvider;
  }

  @Override
  public LoginFragment get() {
    return newInstance(authProvider.get());
  }

  public static LoginFragment_Factory create(Provider<FirebaseAuth> authProvider) {
    return new LoginFragment_Factory(authProvider);
  }

  public static LoginFragment newInstance(FirebaseAuth auth) {
    return new LoginFragment(auth);
  }
}

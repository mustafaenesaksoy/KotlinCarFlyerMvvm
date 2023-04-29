// Generated by Dagger (https://dagger.dev).
package com.enesaksoy.kotlincarflyer.view;

import com.enesaksoy.kotlincarflyer.adapter.FeedAdapter;
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
public final class FeedFragment_Factory implements Factory<FeedFragment> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FeedAdapter> adapterProvider;

  public FeedFragment_Factory(Provider<FirebaseAuth> authProvider,
      Provider<FeedAdapter> adapterProvider) {
    this.authProvider = authProvider;
    this.adapterProvider = adapterProvider;
  }

  @Override
  public FeedFragment get() {
    return newInstance(authProvider.get(), adapterProvider.get());
  }

  public static FeedFragment_Factory create(Provider<FirebaseAuth> authProvider,
      Provider<FeedAdapter> adapterProvider) {
    return new FeedFragment_Factory(authProvider, adapterProvider);
  }

  public static FeedFragment newInstance(FirebaseAuth auth, FeedAdapter adapter) {
    return new FeedFragment(auth, adapter);
  }
}
// Generated by Dagger (https://dagger.dev).
package com.enesaksoy.kotlincarflyer.view;

import com.bumptech.glide.RequestManager;
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
public final class FragmentFactory_Factory implements Factory<FragmentFactory> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FeedAdapter> adapterProvider;

  private final Provider<RequestManager> glideProvider;

  public FragmentFactory_Factory(Provider<FirebaseAuth> authProvider,
      Provider<FeedAdapter> adapterProvider, Provider<RequestManager> glideProvider) {
    this.authProvider = authProvider;
    this.adapterProvider = adapterProvider;
    this.glideProvider = glideProvider;
  }

  @Override
  public FragmentFactory get() {
    return newInstance(authProvider.get(), adapterProvider.get(), glideProvider.get());
  }

  public static FragmentFactory_Factory create(Provider<FirebaseAuth> authProvider,
      Provider<FeedAdapter> adapterProvider, Provider<RequestManager> glideProvider) {
    return new FragmentFactory_Factory(authProvider, adapterProvider, glideProvider);
  }

  public static FragmentFactory newInstance(FirebaseAuth auth, FeedAdapter adapter,
      RequestManager glide) {
    return new FragmentFactory(auth, adapter, glide);
  }
}

// Generated by Dagger (https://dagger.dev).
package com.enesaksoy.kotlincarflyer.viewmodel;

import com.enesaksoy.kotlincarflyer.repo.CarRepository;
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
public final class UploadViewModel_Factory implements Factory<UploadViewModel> {
  private final Provider<CarRepository> repoProvider;

  public UploadViewModel_Factory(Provider<CarRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public UploadViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static UploadViewModel_Factory create(Provider<CarRepository> repoProvider) {
    return new UploadViewModel_Factory(repoProvider);
  }

  public static UploadViewModel newInstance(CarRepository repo) {
    return new UploadViewModel(repo);
  }
}
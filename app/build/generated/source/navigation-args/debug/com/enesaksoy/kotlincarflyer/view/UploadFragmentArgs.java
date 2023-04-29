package com.enesaksoy.kotlincarflyer.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class UploadFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private UploadFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private UploadFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UploadFragmentArgs fromBundle(@NonNull Bundle bundle) {
    UploadFragmentArgs __result = new UploadFragmentArgs();
    bundle.setClassLoader(UploadFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("info")) {
      String info;
      info = bundle.getString("info");
      if (info == null) {
        throw new IllegalArgumentException("Argument \"info\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("info", info);
    } else {
      __result.arguments.put("info", "new");
    }
    if (bundle.containsKey("email")) {
      String email;
      email = bundle.getString("email");
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("email", email);
    } else {
      __result.arguments.put("email", "old");
    }
    if (bundle.containsKey("url")) {
      String url;
      url = bundle.getString("url");
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("url", url);
    } else {
      __result.arguments.put("url", "old");
    }
    if (bundle.containsKey("brand")) {
      String brand;
      brand = bundle.getString("brand");
      if (brand == null) {
        throw new IllegalArgumentException("Argument \"brand\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("brand", brand);
    } else {
      __result.arguments.put("brand", "old");
    }
    if (bundle.containsKey("phonenumber")) {
      String phonenumber;
      phonenumber = bundle.getString("phonenumber");
      if (phonenumber == null) {
        throw new IllegalArgumentException("Argument \"phonenumber\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("phonenumber", phonenumber);
    } else {
      __result.arguments.put("phonenumber", "old");
    }
    if (bundle.containsKey("address")) {
      String address;
      address = bundle.getString("address");
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("address", address);
    } else {
      __result.arguments.put("address", "old");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UploadFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    UploadFragmentArgs __result = new UploadFragmentArgs();
    if (savedStateHandle.contains("info")) {
      String info;
      info = savedStateHandle.get("info");
      if (info == null) {
        throw new IllegalArgumentException("Argument \"info\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("info", info);
    } else {
      __result.arguments.put("info", "new");
    }
    if (savedStateHandle.contains("email")) {
      String email;
      email = savedStateHandle.get("email");
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("email", email);
    } else {
      __result.arguments.put("email", "old");
    }
    if (savedStateHandle.contains("url")) {
      String url;
      url = savedStateHandle.get("url");
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("url", url);
    } else {
      __result.arguments.put("url", "old");
    }
    if (savedStateHandle.contains("brand")) {
      String brand;
      brand = savedStateHandle.get("brand");
      if (brand == null) {
        throw new IllegalArgumentException("Argument \"brand\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("brand", brand);
    } else {
      __result.arguments.put("brand", "old");
    }
    if (savedStateHandle.contains("phonenumber")) {
      String phonenumber;
      phonenumber = savedStateHandle.get("phonenumber");
      if (phonenumber == null) {
        throw new IllegalArgumentException("Argument \"phonenumber\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("phonenumber", phonenumber);
    } else {
      __result.arguments.put("phonenumber", "old");
    }
    if (savedStateHandle.contains("address")) {
      String address;
      address = savedStateHandle.get("address");
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("address", address);
    } else {
      __result.arguments.put("address", "old");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getInfo() {
    return (String) arguments.get("info");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getEmail() {
    return (String) arguments.get("email");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getUrl() {
    return (String) arguments.get("url");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getBrand() {
    return (String) arguments.get("brand");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getPhonenumber() {
    return (String) arguments.get("phonenumber");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getAddress() {
    return (String) arguments.get("address");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("info")) {
      String info = (String) arguments.get("info");
      __result.putString("info", info);
    } else {
      __result.putString("info", "new");
    }
    if (arguments.containsKey("email")) {
      String email = (String) arguments.get("email");
      __result.putString("email", email);
    } else {
      __result.putString("email", "old");
    }
    if (arguments.containsKey("url")) {
      String url = (String) arguments.get("url");
      __result.putString("url", url);
    } else {
      __result.putString("url", "old");
    }
    if (arguments.containsKey("brand")) {
      String brand = (String) arguments.get("brand");
      __result.putString("brand", brand);
    } else {
      __result.putString("brand", "old");
    }
    if (arguments.containsKey("phonenumber")) {
      String phonenumber = (String) arguments.get("phonenumber");
      __result.putString("phonenumber", phonenumber);
    } else {
      __result.putString("phonenumber", "old");
    }
    if (arguments.containsKey("address")) {
      String address = (String) arguments.get("address");
      __result.putString("address", address);
    } else {
      __result.putString("address", "old");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("info")) {
      String info = (String) arguments.get("info");
      __result.set("info", info);
    } else {
      __result.set("info", "new");
    }
    if (arguments.containsKey("email")) {
      String email = (String) arguments.get("email");
      __result.set("email", email);
    } else {
      __result.set("email", "old");
    }
    if (arguments.containsKey("url")) {
      String url = (String) arguments.get("url");
      __result.set("url", url);
    } else {
      __result.set("url", "old");
    }
    if (arguments.containsKey("brand")) {
      String brand = (String) arguments.get("brand");
      __result.set("brand", brand);
    } else {
      __result.set("brand", "old");
    }
    if (arguments.containsKey("phonenumber")) {
      String phonenumber = (String) arguments.get("phonenumber");
      __result.set("phonenumber", phonenumber);
    } else {
      __result.set("phonenumber", "old");
    }
    if (arguments.containsKey("address")) {
      String address = (String) arguments.get("address");
      __result.set("address", address);
    } else {
      __result.set("address", "old");
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    UploadFragmentArgs that = (UploadFragmentArgs) object;
    if (arguments.containsKey("info") != that.arguments.containsKey("info")) {
      return false;
    }
    if (getInfo() != null ? !getInfo().equals(that.getInfo()) : that.getInfo() != null) {
      return false;
    }
    if (arguments.containsKey("email") != that.arguments.containsKey("email")) {
      return false;
    }
    if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) {
      return false;
    }
    if (arguments.containsKey("url") != that.arguments.containsKey("url")) {
      return false;
    }
    if (getUrl() != null ? !getUrl().equals(that.getUrl()) : that.getUrl() != null) {
      return false;
    }
    if (arguments.containsKey("brand") != that.arguments.containsKey("brand")) {
      return false;
    }
    if (getBrand() != null ? !getBrand().equals(that.getBrand()) : that.getBrand() != null) {
      return false;
    }
    if (arguments.containsKey("phonenumber") != that.arguments.containsKey("phonenumber")) {
      return false;
    }
    if (getPhonenumber() != null ? !getPhonenumber().equals(that.getPhonenumber()) : that.getPhonenumber() != null) {
      return false;
    }
    if (arguments.containsKey("address") != that.arguments.containsKey("address")) {
      return false;
    }
    if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getInfo() != null ? getInfo().hashCode() : 0);
    result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
    result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
    result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
    result = 31 * result + (getPhonenumber() != null ? getPhonenumber().hashCode() : 0);
    result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "UploadFragmentArgs{"
        + "info=" + getInfo()
        + ", email=" + getEmail()
        + ", url=" + getUrl()
        + ", brand=" + getBrand()
        + ", phonenumber=" + getPhonenumber()
        + ", address=" + getAddress()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull UploadFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public UploadFragmentArgs build() {
      UploadFragmentArgs result = new UploadFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setInfo(@NonNull String info) {
      if (info == null) {
        throw new IllegalArgumentException("Argument \"info\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("info", info);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setEmail(@NonNull String email) {
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUrl(@NonNull String url) {
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("url", url);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBrand(@NonNull String brand) {
      if (brand == null) {
        throw new IllegalArgumentException("Argument \"brand\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("brand", brand);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPhonenumber(@NonNull String phonenumber) {
      if (phonenumber == null) {
        throw new IllegalArgumentException("Argument \"phonenumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phonenumber", phonenumber);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getInfo() {
      return (String) arguments.get("info");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getEmail() {
      return (String) arguments.get("email");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getUrl() {
      return (String) arguments.get("url");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getBrand() {
      return (String) arguments.get("brand");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getPhonenumber() {
      return (String) arguments.get("phonenumber");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getAddress() {
      return (String) arguments.get("address");
    }
  }
}

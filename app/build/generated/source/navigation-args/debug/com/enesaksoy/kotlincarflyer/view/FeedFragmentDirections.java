package com.enesaksoy.kotlincarflyer.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.enesaksoy.kotlincarflyer.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FeedFragmentDirections {
  private FeedFragmentDirections() {
  }

  @NonNull
  public static ActionFeedFragmentToUploadFragment actionFeedFragmentToUploadFragment() {
    return new ActionFeedFragmentToUploadFragment();
  }

  public static class ActionFeedFragmentToUploadFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFeedFragmentToUploadFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFeedFragmentToUploadFragment setInfo(@NonNull String info) {
      if (info == null) {
        throw new IllegalArgumentException("Argument \"info\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("info", info);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFeedFragmentToUploadFragment setEmail(@NonNull String email) {
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFeedFragmentToUploadFragment setUrl(@NonNull String url) {
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("url", url);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFeedFragmentToUploadFragment setBrand(@NonNull String brand) {
      if (brand == null) {
        throw new IllegalArgumentException("Argument \"brand\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("brand", brand);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFeedFragmentToUploadFragment setPhonenumber(@NonNull String phonenumber) {
      if (phonenumber == null) {
        throw new IllegalArgumentException("Argument \"phonenumber\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phonenumber", phonenumber);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFeedFragmentToUploadFragment setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_feedFragment_to_uploadFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFeedFragmentToUploadFragment that = (ActionFeedFragmentToUploadFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFeedFragmentToUploadFragment(actionId=" + getActionId() + "){"
          + "info=" + getInfo()
          + ", email=" + getEmail()
          + ", url=" + getUrl()
          + ", brand=" + getBrand()
          + ", phonenumber=" + getPhonenumber()
          + ", address=" + getAddress()
          + "}";
    }
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.popfinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.popfinder.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cardEmail;

  @NonNull
  public final CardView cardLogout;

  @NonNull
  public final CardView cardPassword;

  @NonNull
  public final ImageView imgCamera;

  @NonNull
  public final CircleImageView imgProfile;

  @NonNull
  public final TextView phone;

  @NonNull
  public final TextView txtEEmail;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtUsername;

  private FragmentSettingsBinding(@NonNull LinearLayout rootView, @NonNull CardView cardEmail,
      @NonNull CardView cardLogout, @NonNull CardView cardPassword, @NonNull ImageView imgCamera,
      @NonNull CircleImageView imgProfile, @NonNull TextView phone, @NonNull TextView txtEEmail,
      @NonNull TextView txtEmail, @NonNull TextView txtUsername) {
    this.rootView = rootView;
    this.cardEmail = cardEmail;
    this.cardLogout = cardLogout;
    this.cardPassword = cardPassword;
    this.imgCamera = imgCamera;
    this.imgProfile = imgProfile;
    this.phone = phone;
    this.txtEEmail = txtEEmail;
    this.txtEmail = txtEmail;
    this.txtUsername = txtUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardEmail;
      CardView cardEmail = ViewBindings.findChildViewById(rootView, id);
      if (cardEmail == null) {
        break missingId;
      }

      id = R.id.cardLogout;
      CardView cardLogout = ViewBindings.findChildViewById(rootView, id);
      if (cardLogout == null) {
        break missingId;
      }

      id = R.id.cardPassword;
      CardView cardPassword = ViewBindings.findChildViewById(rootView, id);
      if (cardPassword == null) {
        break missingId;
      }

      id = R.id.imgCamera;
      ImageView imgCamera = ViewBindings.findChildViewById(rootView, id);
      if (imgCamera == null) {
        break missingId;
      }

      id = R.id.imgProfile;
      CircleImageView imgProfile = ViewBindings.findChildViewById(rootView, id);
      if (imgProfile == null) {
        break missingId;
      }

      id = R.id.phone;
      TextView phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.txtEEmail;
      TextView txtEEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEEmail == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      TextView txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtUsername;
      TextView txtUsername = ViewBindings.findChildViewById(rootView, id);
      if (txtUsername == null) {
        break missingId;
      }

      return new FragmentSettingsBinding((LinearLayout) rootView, cardEmail, cardLogout,
          cardPassword, imgCamera, imgProfile, phone, txtEEmail, txtEmail, txtUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
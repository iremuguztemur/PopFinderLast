// Generated by view binder compiler. Do not edit!
package com.example.popfinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.popfinder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Items2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView imageview;

  @NonNull
  public final ImageView imgPlace;

  @NonNull
  public final TextView lat2;

  @NonNull
  public final TextView long2;

  @NonNull
  public final TextView txtCity;

  @NonNull
  public final TextView txtinf2;

  private Items2Binding(@NonNull RelativeLayout rootView, @NonNull CardView imageview,
      @NonNull ImageView imgPlace, @NonNull TextView lat2, @NonNull TextView long2,
      @NonNull TextView txtCity, @NonNull TextView txtinf2) {
    this.rootView = rootView;
    this.imageview = imageview;
    this.imgPlace = imgPlace;
    this.lat2 = lat2;
    this.long2 = long2;
    this.txtCity = txtCity;
    this.txtinf2 = txtinf2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Items2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Items2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.items2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Items2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageview;
      CardView imageview = ViewBindings.findChildViewById(rootView, id);
      if (imageview == null) {
        break missingId;
      }

      id = R.id.imgPlace;
      ImageView imgPlace = ViewBindings.findChildViewById(rootView, id);
      if (imgPlace == null) {
        break missingId;
      }

      id = R.id.lat2;
      TextView lat2 = ViewBindings.findChildViewById(rootView, id);
      if (lat2 == null) {
        break missingId;
      }

      id = R.id.long2;
      TextView long2 = ViewBindings.findChildViewById(rootView, id);
      if (long2 == null) {
        break missingId;
      }

      id = R.id.txtCity;
      TextView txtCity = ViewBindings.findChildViewById(rootView, id);
      if (txtCity == null) {
        break missingId;
      }

      id = R.id.txtinf2;
      TextView txtinf2 = ViewBindings.findChildViewById(rootView, id);
      if (txtinf2 == null) {
        break missingId;
      }

      return new Items2Binding((RelativeLayout) rootView, imageview, imgPlace, lat2, long2, txtCity,
          txtinf2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

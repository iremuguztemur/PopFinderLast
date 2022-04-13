// Generated by view binder compiler. Do not edit!
package com.example.popfinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.popfinder.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSaveScreenBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MaterialButton btnSavethisplaces;

  @NonNull
  public final TextView dataform1;

  @NonNull
  public final TextView dataform2;

  @NonNull
  public final EditText edplcinfo;

  @NonNull
  public final EditText edplcname;

  @NonNull
  public final ImageView imgthisplace;

  private FragmentSaveScreenBinding(@NonNull RelativeLayout rootView,
      @NonNull MaterialButton btnSavethisplaces, @NonNull TextView dataform1,
      @NonNull TextView dataform2, @NonNull EditText edplcinfo, @NonNull EditText edplcname,
      @NonNull ImageView imgthisplace) {
    this.rootView = rootView;
    this.btnSavethisplaces = btnSavethisplaces;
    this.dataform1 = dataform1;
    this.dataform2 = dataform2;
    this.edplcinfo = edplcinfo;
    this.edplcname = edplcname;
    this.imgthisplace = imgthisplace;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSaveScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSaveScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_save_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSaveScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSavethisplaces;
      MaterialButton btnSavethisplaces = ViewBindings.findChildViewById(rootView, id);
      if (btnSavethisplaces == null) {
        break missingId;
      }

      id = R.id.dataform1;
      TextView dataform1 = ViewBindings.findChildViewById(rootView, id);
      if (dataform1 == null) {
        break missingId;
      }

      id = R.id.dataform2;
      TextView dataform2 = ViewBindings.findChildViewById(rootView, id);
      if (dataform2 == null) {
        break missingId;
      }

      id = R.id.edplcinfo;
      EditText edplcinfo = ViewBindings.findChildViewById(rootView, id);
      if (edplcinfo == null) {
        break missingId;
      }

      id = R.id.edplcname;
      EditText edplcname = ViewBindings.findChildViewById(rootView, id);
      if (edplcname == null) {
        break missingId;
      }

      id = R.id.imgthisplace;
      ImageView imgthisplace = ViewBindings.findChildViewById(rootView, id);
      if (imgthisplace == null) {
        break missingId;
      }

      return new FragmentSaveScreenBinding((RelativeLayout) rootView, btnSavethisplaces, dataform1,
          dataform2, edplcinfo, edplcname, imgthisplace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.popfinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.popfinder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddGuideBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final EditText location;

  @NonNull
  public final EditText name;

  @NonNull
  public final EditText phone;

  private FragmentAddGuideBinding(@NonNull ScrollView rootView, @NonNull Button btnSave,
      @NonNull EditText location, @NonNull EditText name, @NonNull EditText phone) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.location = location;
    this.name = name;
    this.phone = phone;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddGuideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddGuideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_guide, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddGuideBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.location;
      EditText location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.phone;
      EditText phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      return new FragmentAddGuideBinding((ScrollView) rootView, btnSave, location, name, phone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

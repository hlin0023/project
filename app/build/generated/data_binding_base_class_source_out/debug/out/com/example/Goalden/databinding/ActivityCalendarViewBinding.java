// Generated by view binder compiler. Do not edit!
package com.example.Goalden.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.Goalden.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalendarViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout calendarContent;

  @NonNull
  public final RecyclerView calendarRecyclerView;

  @NonNull
  public final Button calendarViewHomeBtn;

  @NonNull
  public final TextView monthYearTV;

  private ActivityCalendarViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout calendarContent, @NonNull RecyclerView calendarRecyclerView,
      @NonNull Button calendarViewHomeBtn, @NonNull TextView monthYearTV) {
    this.rootView = rootView;
    this.calendarContent = calendarContent;
    this.calendarRecyclerView = calendarRecyclerView;
    this.calendarViewHomeBtn = calendarViewHomeBtn;
    this.monthYearTV = monthYearTV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalendarViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalendarViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calendar_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalendarViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calendar_content;
      LinearLayout calendarContent = ViewBindings.findChildViewById(rootView, id);
      if (calendarContent == null) {
        break missingId;
      }

      id = R.id.calendarRecyclerView;
      RecyclerView calendarRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (calendarRecyclerView == null) {
        break missingId;
      }

      id = R.id.calendar_view_homeBtn;
      Button calendarViewHomeBtn = ViewBindings.findChildViewById(rootView, id);
      if (calendarViewHomeBtn == null) {
        break missingId;
      }

      id = R.id.monthYearTV;
      TextView monthYearTV = ViewBindings.findChildViewById(rootView, id);
      if (monthYearTV == null) {
        break missingId;
      }

      return new ActivityCalendarViewBinding((ConstraintLayout) rootView, calendarContent,
          calendarRecyclerView, calendarViewHomeBtn, monthYearTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

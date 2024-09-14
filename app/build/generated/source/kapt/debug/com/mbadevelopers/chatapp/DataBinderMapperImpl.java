package com.mbadevelopers.chatapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mbadevelopers.chatapp.databinding.ActivityChatDetailBindingImpl;
import com.mbadevelopers.chatapp.databinding.ActivityChatListBindingImpl;
import com.mbadevelopers.chatapp.databinding.ActivitySplashBindingImpl;
import com.mbadevelopers.chatapp.databinding.LayoutProgressBarBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCHATDETAIL = 1;

  private static final int LAYOUT_ACTIVITYCHATLIST = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_LAYOUTPROGRESSBAR = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mbadevelopers.chatapp.R.layout.activity_chat_detail, LAYOUT_ACTIVITYCHATDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mbadevelopers.chatapp.R.layout.activity_chat_list, LAYOUT_ACTIVITYCHATLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mbadevelopers.chatapp.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mbadevelopers.chatapp.R.layout.layout_progress_bar, LAYOUT_LAYOUTPROGRESSBAR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCHATDETAIL: {
          if ("layout/activity_chat_detail_0".equals(tag)) {
            return new ActivityChatDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chat_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHATLIST: {
          if ("layout/activity_chat_list_0".equals(tag)) {
            return new ActivityChatListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chat_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSBAR: {
          if ("layout/layout_progress_bar_0".equals(tag)) {
            return new LayoutProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_bar is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_chat_detail_0", com.mbadevelopers.chatapp.R.layout.activity_chat_detail);
      sKeys.put("layout/activity_chat_list_0", com.mbadevelopers.chatapp.R.layout.activity_chat_list);
      sKeys.put("layout/activity_splash_0", com.mbadevelopers.chatapp.R.layout.activity_splash);
      sKeys.put("layout/layout_progress_bar_0", com.mbadevelopers.chatapp.R.layout.layout_progress_bar);
    }
  }
}

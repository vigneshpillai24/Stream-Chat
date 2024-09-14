package com.mbadevelopers.chatapp.mvvm.chat.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\fH\u0002J\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0016H\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/mbadevelopers/chatapp/mvvm/chat/view/ChannelListActivity;", "Lcom/mbadevelopers/chatapp/helpers/BaseActivity;", "()V", "binding", "Lcom/mbadevelopers/chatapp/databinding/ActivityChatListBinding;", "getBinding", "()Lcom/mbadevelopers/chatapp/databinding/ActivityChatListBinding;", "setBinding", "(Lcom/mbadevelopers/chatapp/databinding/ActivityChatListBinding;)V", "client", "Lio/getstream/chat/android/client/ChatClient;", "connectGuestUser", "", "user", "Lio/getstream/chat/android/models/User;", "token", "", "getBobUserToken", "getGuestUserToken", "userId", "userName", "getSavedGuestUserData", "Lkotlin/Pair;", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveGuestUserData", "setupChannelUI", "app_debug"})
public final class ChannelListActivity extends com.mbadevelopers.chatapp.helpers.BaseActivity {
    public com.mbadevelopers.chatapp.databinding.ActivityChatListBinding binding;
    private io.getstream.chat.android.client.ChatClient client;
    
    public ChannelListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mbadevelopers.chatapp.databinding.ActivityChatListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.mbadevelopers.chatapp.databinding.ActivityChatListBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    public final void getGuestUserToken(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String userName) {
    }
    
    public final void connectGuestUser(@org.jetbrains.annotations.Nullable
    io.getstream.chat.android.models.User user, @org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    io.getstream.chat.android.client.ChatClient client) {
    }
    
    private final void setupChannelUI() {
    }
    
    private final void getBobUserToken() {
    }
    
    private final void saveGuestUserData(java.lang.String userId, java.lang.String token) {
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.String> getSavedGuestUserData() {
        return null;
    }
}
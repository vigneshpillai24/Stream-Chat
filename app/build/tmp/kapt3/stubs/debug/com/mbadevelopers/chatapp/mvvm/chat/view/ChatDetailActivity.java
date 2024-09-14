package com.mbadevelopers.chatapp.mvvm.chat.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/mbadevelopers/chatapp/mvvm/chat/view/ChatDetailActivity;", "Lcom/mbadevelopers/chatapp/helpers/BaseActivity;", "()V", "binding", "Lcom/mbadevelopers/chatapp/databinding/ActivityChatDetailBinding;", "getBinding", "()Lcom/mbadevelopers/chatapp/databinding/ActivityChatDetailBinding;", "setBinding", "(Lcom/mbadevelopers/chatapp/databinding/ActivityChatDetailBinding;)V", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ChatDetailActivity extends com.mbadevelopers.chatapp.helpers.BaseActivity {
    public com.mbadevelopers.chatapp.databinding.ActivityChatDetailBinding binding;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CID_KEY = "key:cid";
    @org.jetbrains.annotations.NotNull
    public static final com.mbadevelopers.chatapp.mvvm.chat.view.ChatDetailActivity.Companion Companion = null;
    
    public ChatDetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mbadevelopers.chatapp.databinding.ActivityChatDetailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.mbadevelopers.chatapp.databinding.ActivityChatDetailBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/mbadevelopers/chatapp/mvvm/chat/view/ChatDetailActivity$Companion;", "", "()V", "CID_KEY", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "channel", "Lio/getstream/chat/android/models/Channel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        io.getstream.chat.android.models.Channel channel) {
            return null;
        }
    }
}
.class public Lcom/roblox/client/app/AppInputFocusLifecycleObserver_LifecycleAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# instance fields
.field final a:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;


# direct methods
.method constructor <init>(Lcom/roblox/client/app/AppInputFocusLifecycleObserver;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/app/AppInputFocusLifecycleObserver_LifecycleAdapter;->a:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l;Landroidx/lifecycle/f$b;ZLandroidx/lifecycle/q;)V
    .locals 1

    const/4 p1, 0x1

    if-eqz p4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p3, :cond_1

    return-void

    .line 1
    :cond_1
    sget-object p3, Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;

    if-ne p2, p3, :cond_4

    if-eqz v0, :cond_2

    const-string p2, "onMenuOptionActivated"

    .line 2
    invoke-virtual {p4, p2, p1}, Landroidx/lifecycle/q;->a(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 3
    :cond_2
    iget-object p1, p0, Lcom/roblox/client/app/AppInputFocusLifecycleObserver_LifecycleAdapter;->a:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-virtual {p1}, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;->onMenuOptionActivated()V

    :cond_3
    return-void

    .line 4
    :cond_4
    sget-object p3, Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;

    if-ne p2, p3, :cond_6

    if-eqz v0, :cond_5

    const-string p2, "onMenuOptionClosed"

    .line 5
    invoke-virtual {p4, p2, p1}, Landroidx/lifecycle/q;->a(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 6
    :cond_5
    iget-object p1, p0, Lcom/roblox/client/app/AppInputFocusLifecycleObserver_LifecycleAdapter;->a:Lcom/roblox/client/app/AppInputFocusLifecycleObserver;

    invoke-virtual {p1}, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;->onMenuOptionClosed()V

    :cond_6
    return-void
.end method

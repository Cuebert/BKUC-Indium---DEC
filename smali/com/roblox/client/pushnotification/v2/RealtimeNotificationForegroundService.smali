.class public Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lba/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService$a;
    }
.end annotation


# instance fields
.field private final n:Landroid/os/IBinder;

.field private o:Landroid/content/ServiceConnection;

.field private p:Ljava/lang/String;

.field private q:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    new-instance v0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService$a;-><init>(Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;)V

    iput-object v0, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->n:Landroid/os/IBinder;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    const-string v0, "ACTION_STOP_SERVICE_AND_FINISH_CALL"

    invoke-static {p0, p1, v0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/high16 v0, 0xc000000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x8000000

    .line 2
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 3
    new-instance v3, Landroidx/core/app/k$e;

    const-string v4, "channel_medium"

    invoke-direct {v3, p0, v4}, Landroidx/core/app/k$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roblox/client/c0;->M3:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/core/app/k$e;->o(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v3

    .line 5
    invoke-virtual {v3, p2}, Landroidx/core/app/k$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v3

    sget v4, Lcom/roblox/client/x;->v:I

    .line 6
    invoke-virtual {v3, v4}, Landroidx/core/app/k$e;->z(I)Landroidx/core/app/k$e;

    move-result-object v3

    .line 7
    invoke-virtual {v3, v1}, Landroidx/core/app/k$e;->m(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    move-result-object v1

    const/4 v3, 0x1

    .line 8
    invoke-virtual {v1, v3}, Landroidx/core/app/k$e;->x(Z)Landroidx/core/app/k$e;

    move-result-object v1

    .line 9
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v4

    invoke-interface {v4}, Lc7/e;->j0()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 10
    invoke-static {p0, p3}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p3

    .line 11
    invoke-static {p0, v2, p3, v0}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p3

    .line 12
    new-instance v0, Landroidx/core/app/o$b;

    invoke-direct {v0}, Landroidx/core/app/o$b;-><init>()V

    .line 13
    invoke-virtual {v0, p2}, Landroidx/core/app/o$b;->f(Ljava/lang/CharSequence;)Landroidx/core/app/o$b;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/core/app/o$b;->a()Landroidx/core/app/o;

    move-result-object p2

    .line 14
    invoke-static {p2, p3}, Landroidx/core/app/k$f;->i(Landroidx/core/app/o;Landroid/app/PendingIntent;)Landroidx/core/app/k$f;

    move-result-object p2

    .line 15
    invoke-virtual {v1, p2}, Landroidx/core/app/k$e;->B(Landroidx/core/app/k$g;)Landroidx/core/app/k$e;

    .line 16
    invoke-virtual {v1, v3}, Landroidx/core/app/k$e;->k(Z)Landroidx/core/app/k$e;

    .line 17
    :cond_1
    invoke-virtual {v1}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p2

    .line 18
    new-instance p3, Landroid/content/Intent;

    const-class v0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;

    invoke-direct {p3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "EXTRA_NOTIFICATION_ID"

    .line 19
    invoke-virtual {p3, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_NOTIFICATION"

    .line 20
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    const-string v0, "ACTION_STOP_SERVICE_AND_REJECT_CALL"

    invoke-static {p0, p1, v0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Landroid/app/Notification;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "EXTRA_NOTIFICATION_ID"

    .line 2
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_NOTIFICATION"

    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    const-string p2, "EXTRA_CALL_ID"

    .line 3
    invoke-virtual {p0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    const-string v0, "ACTION_STOP_SERVICE_AND_SUPPRESS_CALL"

    invoke-static {p0, p1, v0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private g()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Landroidx/core/app/q;->a(Landroid/app/Service;I)V

    .line 2
    iget v0, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->q:I

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopSelf(I)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->g()V

    :cond_0
    return-void
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public g0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->p:Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->g()V

    :cond_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->n:Landroid/os/IBinder;

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lba/g;->g(Lba/g$a;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->o:Landroid/content/ServiceConnection;

    .line 3
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lba/g;->x(Lba/g$a;)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 1
    iput p3, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->q:I

    .line 2
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string p3, "ACTION_STOP_SERVICE_AND_REJECT_CALL"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const-string p3, "EXTRA_CALL_ID"

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lba/g;->w(Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->g()V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ACTION_STOP_SERVICE_AND_SUPPRESS_CALL"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lba/g;->z(Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->g()V

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->j0()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 11
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ACTION_STOP_SERVICE_AND_FINISH_CALL"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 12
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lba/g;->h(Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->g()V

    goto :goto_0

    :cond_2
    const-string p2, "EXTRA_NOTIFICATION_ID"

    .line 15
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->p:Ljava/lang/String;

    const-string p2, "EXTRA_NOTIFICATION"

    .line 16
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/Notification;

    .line 17
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1f

    if-lt p2, p3, :cond_3

    .line 18
    iget-object p2, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->p:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 p3, -0x1

    invoke-virtual {p0, p2, p1, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_0

    .line 19
    :cond_3
    iget-object p2, p0, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->p:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    const/4 p1, 0x2

    return p1
.end method

.method public p(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

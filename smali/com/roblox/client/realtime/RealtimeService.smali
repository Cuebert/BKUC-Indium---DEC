.class public Lcom/roblox/client/realtime/RealtimeService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/realtime/RealtimeService$d;,
        Lcom/roblox/client/realtime/RealtimeService$b;,
        Lcom/roblox/client/realtime/RealtimeService$c;
    }
.end annotation


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private volatile s:Landroid/os/Looper;

.field private volatile t:Lcom/roblox/client/realtime/RealtimeService$d;

.field private final u:Landroid/os/IBinder;

.field private v:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/16 v0, 0xa

    .line 2
    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->n:I

    const/16 v0, 0x14

    .line 3
    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->o:I

    const/16 v0, 0x18

    .line 4
    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->p:I

    const/16 v0, 0x19

    .line 5
    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->q:I

    const/16 v0, 0x1e

    .line 6
    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->r:I

    .line 7
    new-instance v0, Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-direct {v0, p0}, Lcom/roblox/client/realtime/RealtimeService$c;-><init>(Lcom/roblox/client/realtime/RealtimeService;)V

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->u:Landroid/os/IBinder;

    .line 8
    new-instance v0, Lcom/roblox/client/realtime/RealtimeService$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/realtime/RealtimeService$b;-><init>(Lcom/roblox/client/realtime/RealtimeService$a;)V

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->v:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/realtime/RealtimeService;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->k()V

    return-void
.end method

.method static synthetic b(Lcom/roblox/client/realtime/RealtimeService;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->l()V

    return-void
.end method

.method static synthetic c(Lcom/roblox/client/realtime/RealtimeService;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->m()V

    return-void
.end method

.method public static d()J
    .locals 2

    invoke-static {}, Ln8/a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e()Z
    .locals 1

    invoke-static {}, Ln8/a;->b()Z

    move-result v0

    return v0
.end method

.method private f(J)V
    .locals 5

    .line 1
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->g()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0xa

    .line 3
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 4
    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x14

    .line 2
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 3
    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x18

    .line 2
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 3
    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x19

    .line 2
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 3
    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x1e

    .line 2
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 3
    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private k()V
    .locals 0

    return-void
.end method

.method private l()V
    .locals 0

    return-void
.end method

.method private m()V
    .locals 0

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService;->v:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/roblox/client/realtime/RealtimeService;->f(J)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService;->u:Landroid/os/IBinder;

    return-object p1
.end method

.method public onConnectivityChangeEvent(La7/e;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->POSTING:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RealtimeService.onConnectivityChangeEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, La7/e;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RealtimeService"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, La7/e;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/roblox/client/realtime/RealtimeService;->f(J)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->g()V

    :goto_0
    return-void
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    invoke-static {p0}, Lka/a;->c(Landroid/content/Context;)V

    .line 3
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "RealtimeService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 5
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->s:Landroid/os/Looper;

    .line 6
    new-instance v0, Lcom/roblox/client/realtime/RealtimeService$d;

    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->s:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/realtime/RealtimeService$d;-><init>(Lcom/roblox/client/realtime/RealtimeService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->t:Lcom/roblox/client/realtime/RealtimeService$d;

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onLoginEvent(La7/f;)V
    .locals 1
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->POSTING:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string p1, "RealtimeService"

    const-string v0, "RealtimeService.onLoginEvent()"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->h()V

    return-void
.end method

.method public onLogoutEvent(La7/g;)V
    .locals 1
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->POSTING:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string p1, "RealtimeService"

    const-string v0, "RealtimeService.onLogoutEvent()"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->i()V

    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->v:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService;->j()V

    .line 4
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

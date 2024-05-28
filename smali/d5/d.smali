.class public final Ld5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final o:Ljava/util/Map;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ld5/x;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;

.field private final e:Ljava/util/Set;

.field private final f:Ljava/lang/Object;

.field private g:Z

.field private final h:Landroid/content/Intent;

.field private final i:Ld5/e0;

.field private final j:Ljava/lang/ref/WeakReference;

.field private final k:Landroid/os/IBinder$DeathRecipient;

.field private final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field private m:Landroid/content/ServiceConnection;

.field private n:Landroid/os/IInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ld5/d;->o:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld5/x;Ljava/lang/String;Landroid/content/Intent;Ld5/e0;Ld5/d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    iput-object p6, p0, Ld5/d;->d:Ljava/util/List;

    new-instance p6, Ljava/util/HashSet;

    .line 2
    invoke-direct {p6}, Ljava/util/HashSet;-><init>()V

    iput-object p6, p0, Ld5/d;->e:Ljava/util/Set;

    new-instance p6, Ljava/lang/Object;

    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Ld5/d;->f:Ljava/lang/Object;

    new-instance p6, Ld5/a0;

    invoke-direct {p6, p0}, Ld5/a0;-><init>(Ld5/d;)V

    iput-object p6, p0, Ld5/d;->k:Landroid/os/IBinder$DeathRecipient;

    new-instance p6, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p6, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p6, p0, Ld5/d;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Ld5/d;->a:Landroid/content/Context;

    iput-object p2, p0, Ld5/d;->b:Ld5/x;

    iput-object p3, p0, Ld5/d;->c:Ljava/lang/String;

    iput-object p4, p0, Ld5/d;->h:Landroid/content/Intent;

    iput-object p5, p0, Ld5/d;->i:Ld5/e0;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    .line 4
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ld5/d;->j:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static bridge synthetic a(Ld5/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ld5/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic b(Ld5/d;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, Ld5/d;->m:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method static bridge synthetic d(Ld5/d;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Ld5/d;->n:Landroid/os/IInterface;

    return-object p0
.end method

.method static bridge synthetic f(Ld5/d;)Ld5/x;
    .locals 0

    iget-object p0, p0, Ld5/d;->b:Ld5/x;

    return-object p0
.end method

.method static bridge synthetic g(Ld5/d;)Ld5/e0;
    .locals 0

    iget-object p0, p0, Ld5/d;->i:Ld5/e0;

    return-object p0
.end method

.method static bridge synthetic h(Ld5/d;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ld5/d;->f:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic i(Ld5/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ld5/d;->d:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic j(Ld5/d;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Ld5/d;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static synthetic k(Ld5/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5/d;->b:Ld5/x;

    const-string v1, "reportBinderDeath"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ld5/d;->j:Ljava/lang/ref/WeakReference;

    .line 2
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld5/d0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ld5/d;->b:Ld5/x;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "calling onBinderDied"

    .line 3
    invoke-virtual {v1, v3, v2}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 4
    invoke-interface {v0}, Ld5/d0;->a()V

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Ld5/d;->b:Ld5/x;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Ld5/d;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v2, "%s : Binder has died."

    .line 6
    invoke-virtual {v0, v2, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ld5/d;->d:Ljava/util/List;

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/y;

    .line 8
    invoke-direct {p0}, Ld5/d;->w()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Ld5/y;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld5/d;->d:Ljava/util/List;

    .line 9
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 10
    :goto_1
    iget-object v0, p0, Ld5/d;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    invoke-direct {p0}, Ld5/d;->x()V

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic l(Ld5/d;Landroid/content/ServiceConnection;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Ld5/d;->m:Landroid/content/ServiceConnection;

    return-void
.end method

.method static bridge synthetic m(Ld5/d;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld5/d;->g:Z

    return-void
.end method

.method static bridge synthetic n(Ld5/d;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, Ld5/d;->n:Landroid/os/IInterface;

    return-void
.end method

.method static bridge synthetic o(Ld5/d;Lg4/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld5/d;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p1}, Lg4/m;->a()Lg4/l;

    move-result-object v0

    new-instance v1, Ld5/z;

    invoke-direct {v1, p0, p1}, Ld5/z;-><init>(Ld5/d;Lg4/m;)V

    .line 3
    invoke-virtual {v0, v1}, Lg4/l;->b(Lg4/f;)Lg4/l;

    return-void
.end method

.method static bridge synthetic p(Ld5/d;)V
    .locals 0

    invoke-direct {p0}, Ld5/d;->x()V

    return-void
.end method

.method static bridge synthetic q(Ld5/d;Ld5/y;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5/d;->n:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ld5/d;->g:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ld5/d;->b:Ld5/x;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Initiate binding to the service."

    invoke-virtual {v0, v3, v2}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ld5/d;->d:Ljava/util/List;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Ld5/c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ld5/c;-><init>(Ld5/d;Ld5/b;)V

    iput-object p1, p0, Ld5/d;->m:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld5/d;->g:Z

    iget-object v2, p0, Ld5/d;->a:Landroid/content/Context;

    iget-object v3, p0, Ld5/d;->h:Landroid/content/Intent;

    .line 3
    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ld5/d;->b:Ld5/x;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Failed to bind to the service."

    .line 4
    invoke-virtual {p1, v2, v0}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iput-boolean v1, p0, Ld5/d;->g:Z

    iget-object p1, p0, Ld5/d;->d:Ljava/util/List;

    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld5/y;

    new-instance v1, Ld5/e;

    .line 6
    invoke-direct {v1}, Ld5/e;-><init>()V

    invoke-virtual {v0, v1}, Ld5/y;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld5/d;->d:Ljava/util/List;

    .line 7
    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_1
    return-void

    :cond_2
    iget-boolean v0, p0, Ld5/d;->g:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ld5/d;->b:Ld5/x;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Waiting to bind to the service."

    .line 8
    invoke-virtual {v0, v2, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p0, p0, Ld5/d;->d:Ljava/util/List;

    .line 9
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 10
    :cond_3
    invoke-virtual {p1}, Ld5/y;->run()V

    return-void
.end method

.method static bridge synthetic r(Ld5/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5/d;->b:Ld5/x;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    :try_start_0
    iget-object v0, p0, Ld5/d;->n:Landroid/os/IInterface;

    .line 2
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Ld5/d;->k:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Ld5/d;->b:Ld5/x;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "linkToDeath failed"

    .line 3
    invoke-virtual {p0, v0, v2, v1}, Ld5/x;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method static bridge synthetic s(Ld5/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5/d;->b:Ld5/x;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ld5/d;->n:Landroid/os/IInterface;

    .line 2
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object p0, p0, Ld5/d;->k:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method

.method private final w()Landroid/os/RemoteException;
    .locals 3

    new-instance v0, Landroid/os/RemoteException;

    iget-object v1, p0, Ld5/d;->c:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " : Binder has died."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld5/d;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg4/m;

    .line 2
    invoke-direct {p0}, Ld5/d;->w()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg4/m;->d(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld5/d;->e:Ljava/util/Set;

    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method


# virtual methods
.method public final c()Landroid/os/Handler;
    .locals 4

    .line 1
    sget-object v0, Ld5/d;->o:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld5/d;->c:Ljava/lang/String;

    .line 2
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, Ld5/d;->c:Ljava/lang/String;

    const/16 v3, 0xa

    .line 3
    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 4
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    iget-object v2, p0, Ld5/d;->c:Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    .line 5
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Ld5/d;->c:Ljava/lang/String;

    .line 6
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Landroid/os/IInterface;
    .locals 1

    iget-object v0, p0, Ld5/d;->n:Landroid/os/IInterface;

    return-object v0
.end method

.method public final t(Ld5/y;Lg4/m;)V
    .locals 2

    new-instance v0, Ld5/b0;

    invoke-virtual {p1}, Ld5/y;->c()Lg4/m;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2, p1}, Ld5/b0;-><init>(Ld5/d;Lg4/m;Lg4/m;Ld5/y;)V

    invoke-virtual {p0}, Ld5/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method final synthetic u(Lg4/m;Lg4/l;)V
    .locals 1

    .line 1
    iget-object p2, p0, Ld5/d;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Ld5/d;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final v(Lg4/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld5/d;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld5/d;->e:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p1, Ld5/c0;

    invoke-direct {p1, p0}, Ld5/c0;-><init>(Ld5/d;)V

    .line 3
    invoke-virtual {p0}, Ld5/d;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

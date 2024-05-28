.class public Lba/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba/g$a;
    }
.end annotation


# static fields
.field private static final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static k:Lba/g;


# instance fields
.field private final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private b:Lcom/roblox/universalapp/messagebus/Connection;

.field private c:Lcom/roblox/universalapp/messagebus/Connection;

.field private d:Lcom/roblox/universalapp/messagebus/Connection;

.field private e:Lcom/roblox/universalapp/messagebus/Connection;

.field private f:Lcom/roblox/universalapp/messagebus/Connection;

.field private g:Lcom/roblox/universalapp/messagebus/Connection;

.field private h:Z

.field private i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lba/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lba/g;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lba/g;->i:Ljava/util/Set;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lba/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleConnectingCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lba/c;

    invoke-direct {v1, p0}, Lba/c;-><init>(Lba/g;)V

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lba/g;->g:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleReceiveCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lba/d;

    invoke-direct {v1, p0}, Lba/d;-><init>(Lba/g;)V

    .line 7
    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lba/g;->b:Lcom/roblox/universalapp/messagebus/Connection;

    .line 8
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleAnswerCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lba/b;

    invoke-direct {v1, p0}, Lba/b;-><init>(Lba/g;)V

    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lba/g;->c:Lcom/roblox/universalapp/messagebus/Connection;

    .line 10
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleEndCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lba/f;

    invoke-direct {v1, p0}, Lba/f;-><init>(Lba/g;)V

    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lba/g;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 12
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleActiveCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lba/a;

    invoke-direct {v1, p0}, Lba/a;-><init>(Lba/g;)V

    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lba/g;->e:Lcom/roblox/universalapp/messagebus/Connection;

    .line 14
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleRemovePendingReceivedCall()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lba/e;

    invoke-direct {v1, p0}, Lba/e;-><init>(Lba/g;)V

    .line 15
    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lba/g;->f:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static synthetic a(Lba/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->n(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Lba/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->l(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Lba/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->j(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic d(Lba/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->k(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic e(Lba/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->o(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic f(Lba/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->m(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic j(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->r(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic k(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->t(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic l(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic m(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->s(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic n(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->p(Lorg/json/JSONObject;)V

    return-void
.end method

.method private synthetic o(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/g;->u(Lorg/json/JSONObject;)V

    return-void
.end method

.method private p(Lorg/json/JSONObject;)V
    .locals 13

    .line 1
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerUserIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 4
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerCombinedNameKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 5
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeUserIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 6
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeCombinedNameKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lba/g;->i:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lba/g$a;

    move-object v2, v0

    move-object v3, v8

    move-object v4, v9

    move-object v5, v11

    move-object v6, v10

    move-object v7, p1

    .line 9
    invoke-interface/range {v1 .. v7}, Lba/g$a;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private q(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lba/g;->i:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lba/g$a;

    .line 4
    invoke-interface {v1, p1}, Lba/g$a;->K(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private r(Lorg/json/JSONObject;)V
    .locals 13

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lba/g;->h:Z

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 4
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerUserIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 5
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerCombinedNameKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 6
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeUserIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 7
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeCombinedNameKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lba/g;->i:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lba/g$a;

    move-object v2, v0

    move-object v3, v8

    move-object v4, v9

    move-object v5, v11

    move-object v6, v10

    move-object v7, p1

    .line 10
    invoke-interface/range {v1 .. v7}, Lba/g$a;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private s(Lorg/json/JSONObject;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lba/g;->h:Z

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallActionKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lba/g;->i:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lba/g$a;

    .line 6
    invoke-interface {v2, p1, v0}, Lba/g$a;->g0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private t(Lorg/json/JSONObject;)V
    .locals 6

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lba/g;->h:Z

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getIsDuplicateKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 4
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getIsExpiredKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    new-instance v3, Ljava/util/HashSet;

    iget-object v4, p0, Lba/g;->i:Ljava/util/Set;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lba/g$a;

    if-nez v2, :cond_0

    if-nez p1, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 7
    :goto_1
    invoke-interface {v4, v1, v5}, Lba/g$a;->p(Ljava/lang/String;Z)V

    goto :goto_0

    .line 8
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private u(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lba/g;->i:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lba/g$a;

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-interface {v1, v2}, Lba/g$a;->a0(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static y()Lba/g;
    .locals 2

    .line 1
    sget-object v0, Lba/g;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lba/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lba/g;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lba/g;->k:Lba/g;

    .line 3
    :cond_0
    sget-object v0, Lba/g;->k:Lba/g;

    return-object v0
.end method


# virtual methods
.method public g(Lba/g$a;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lba/g;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    iget-object p1, p0, Lba/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getFinishCallId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for finish call failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CallProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lba/g;->h:Z

    return v0
.end method

.method public v(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerUserIdKey()Ljava/lang/String;

    move-result-object v1

    move-wide v2, p2

    invoke-virtual {v0, v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 4
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerCombinedNameKey()Ljava/lang/String;

    move-result-object v1

    move-object v2, p4

    invoke-virtual {v0, v1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 5
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeUserIdKey()Ljava/lang/String;

    move-result-object v1

    move-wide v2, p5

    invoke-virtual {v0, v1, p5, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 6
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeCombinedNameKey()Ljava/lang/String;

    move-result-object v1

    move-object v2, p7

    invoke-virtual {v0, v1, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getPlaceIdKey()Ljava/lang/String;

    move-result-object v1

    move-wide v2, p8

    invoke-virtual {v0, v1, p8, p9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 8
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getGameInstanceIdKey()Ljava/lang/String;

    move-result-object v1

    move-object v2, p10

    invoke-virtual {v0, v1, p10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getReservedServerAccessCodeKey()Ljava/lang/String;

    move-result-object v1

    move-object v2, p11

    invoke-virtual {v0, v1, p11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCreatedUtcKey()Ljava/lang/String;

    move-result-object v1

    move-wide/from16 v2, p12

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 11
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getIsCalleeMicEnabledKey()Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p14

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 12
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p15

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/universalapp/call/JNICallProtocol;->receiveCall(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "CallProtocol"

    const-string v2, "Constructing JSON params for receive call failed with error."

    .line 14
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    iget-object p1, p0, Lba/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getRejectCallId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for reject call failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CallProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public x(Lba/g$a;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lba/g;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    iget-object p1, p0, Lba/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getSuppressCallId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for suppress call failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CallProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

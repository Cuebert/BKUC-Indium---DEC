.class public Lh8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lh8/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lh8/o;
    .locals 2

    .line 1
    sget-object v0, Lh8/o;->a:Lh8/o;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lh8/n;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lh8/o;->a:Lh8/o;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lh8/o;

    invoke-direct {v1}, Lh8/o;-><init>()V

    sput-object v1, Lh8/o;->a:Lh8/o;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lh8/o;->a:Lh8/o;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)Lh8/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lh8/o;->c(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/n;->n()Lh8/n;

    move-result-object p1

    if-nez p1, :cond_2

    .line 3
    invoke-static {}, Lc9/l;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    new-instance p1, Lm6/a;

    invoke-direct {p1}, Lm6/a;-><init>()V

    goto :goto_0

    .line 5
    :cond_1
    new-instance p1, Lcom/roblox/client/fcm/a;

    invoke-direct {p1}, Lcom/roblox/client/fcm/a;-><init>()V

    :cond_2
    :goto_0
    return-object p1
.end method

.method public c(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/p0;->t(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

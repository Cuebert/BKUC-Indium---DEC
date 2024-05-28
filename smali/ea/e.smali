.class public Lea/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea/e$c;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String; = "e"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ls0/k;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lea/e;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lea/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method private h(Landroid/app/Activity;)Ls0/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/e;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Ls0/j;->a(Landroid/content/Context;)Ls0/k;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lea/e;->a:Ljava/lang/ref/WeakReference;

    .line 3
    :cond_1
    iget-object p1, p0, Lea/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls0/k;

    return-object p1
.end method


# virtual methods
.method b(Landroid/app/Activity;Lorg/json/JSONObject;Ljava/lang/String;Lea/e$c;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lea/e;->d(Lorg/json/JSONObject;Ljava/lang/String;)Ls0/b;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lea/e;->h(Landroid/app/Activity;)Ls0/k;

    move-result-object p3

    .line 3
    invoke-virtual {p0, p1, p2, p4, p3}, Lea/e;->c(Landroid/app/Activity;Ls0/b;Lea/e$c;Ls0/k;)V

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    const-string p2, ""

    .line 4
    invoke-interface {p4, p1, p2}, Lea/e$c;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const/4 p2, 0x3

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p2, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method c(Landroid/app/Activity;Ls0/b;Lea/e$c;Ls0/k;)V
    .locals 6

    new-instance v3, Landroid/os/CancellationSignal;

    invoke-direct {v3}, Landroid/os/CancellationSignal;-><init>()V

    iget-object v4, p0, Lea/e;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lea/e$b;

    invoke-direct {v5, p0, p3}, Lea/e$b;-><init>(Lea/e;Lea/e$c;)V

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, Ls0/k;->a(Landroid/content/Context;Ls0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V

    return-void
.end method

.method d(Lorg/json/JSONObject;Ljava/lang/String;)Ls0/b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->a1()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_2

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "parameters"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "FIDO2"

    .line 4
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lea/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, "publicKey"

    .line 6
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 7
    new-instance p2, Ls0/g;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ls0/g;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "password"

    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "username"

    .line 9
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance v0, Ls0/e;

    invoke-direct {v0, p2, p1}, Ls0/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object p2, v0

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_0

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "CredentialType not set!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_3
    invoke-virtual {p0}, Lea/e;->j()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 14
    new-instance p2, Ls0/g;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ls0/g;-><init>(Ljava/lang/String;)V

    :goto_0
    if-eqz p2, :cond_4

    return-object p2

    .line 15
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid create credential request!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Public Key Credential not supported!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method e(Landroid/app/Activity;Lorg/json/JSONObject;Lea/e$c;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, Lea/e;->i(Lorg/json/JSONObject;)Ls0/t;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lea/e;->g(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-direct {p0, p1}, Lea/e;->h(Landroid/app/Activity;)Ls0/k;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    .line 4
    invoke-virtual/range {v0 .. v5}, Lea/e;->f(Landroid/app/Activity;Ls0/t;Ljava/lang/String;Lea/e$c;Ls0/k;)V

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    const-string p2, ""

    .line 5
    invoke-interface {p3, p1, p2}, Lea/e$c;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const/4 p2, 0x3

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p2, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method f(Landroid/app/Activity;Ls0/t;Ljava/lang/String;Lea/e$c;Ls0/k;)V
    .locals 6

    new-instance v3, Landroid/os/CancellationSignal;

    invoke-direct {v3}, Landroid/os/CancellationSignal;-><init>()V

    iget-object v4, p0, Lea/e;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lea/e$a;

    invoke-direct {v5, p0, p4, p3}, Lea/e$a;-><init>(Lea/e;Lea/e$c;Ljava/lang/String;)V

    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, Ls0/k;->b(Landroid/content/Context;Ls0/t;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V

    return-void
.end method

.method g(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->a1()Z

    move-result v0

    const-string v1, "FIDO2"

    if-eqz v0, :cond_1

    const-string v0, "credentialType"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "password"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const-string p1, "all"

    return-object p1

    :cond_1
    return-object v1
.end method

.method i(Lorg/json/JSONObject;)Ls0/t;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lea/e;->g(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "FIDO2"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "publicKey"

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lea/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "parameters"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 5
    new-instance v0, Ls0/x;

    .line 6
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ls0/x;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance p1, Ls0/t$a;

    invoke-direct {p1}, Ls0/t$a;-><init>()V

    .line 8
    invoke-virtual {p1, v0}, Ls0/t$a;->a(Ls0/n;)Ls0/t$a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ls0/t$a;->b()Ls0/t;

    move-result-object p1

    return-object p1

    .line 10
    :cond_0
    new-instance v0, Ls0/t$a;

    invoke-direct {v0}, Ls0/t$a;-><init>()V

    .line 11
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {p0}, Lea/e;->j()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 13
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 14
    new-instance v2, Ls0/x;

    .line 15
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ls0/x;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0, v2}, Ls0/t$a;->a(Ls0/n;)Ls0/t$a;

    :cond_1
    const-string v1, "password"

    .line 17
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 18
    new-instance p1, Ls0/w;

    invoke-direct {p1}, Ls0/w;-><init>()V

    .line 19
    invoke-virtual {v0, p1}, Ls0/t$a;->a(Ls0/n;)Ls0/t$a;

    .line 20
    :cond_2
    invoke-virtual {v0}, Ls0/t$a;->b()Ls0/t;

    move-result-object p1

    return-object p1
.end method

.method public j()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

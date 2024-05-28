.class public Lh8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d(Ljava/lang/String;)Lh8/i;
    .locals 1

    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh8/p;->d(Ljava/lang/String;)Lh8/i;

    move-result-object p1

    return-object p1
.end method

.method private e(Lj8/h;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj8/h;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private f(Lj8/h;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj8/h;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method a(Landroid/content/Context;Lh8/i;Ljava/lang/String;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p2, p1, p3}, Lh8/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Lj8/i;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lh8/d;->c(Lj8/i;)Lj8/h;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lh8/d;->f(Lj8/h;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-direct {p0, p1}, Lh8/d;->e(Lj8/h;)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 4
    invoke-direct {p0, v0}, Lh8/d;->d(Ljava/lang/String;)Lh8/i;

    move-result-object v0

    .line 5
    invoke-virtual {p0, p2, v0, p1}, Lh8/d;->a(Landroid/content/Context;Lh8/i;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method c(Lj8/i;)Lj8/h;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lj8/h;

    invoke-direct {v0, p1}, Lj8/h;-><init>(Lj8/i;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

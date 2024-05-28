.class public Lx6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private c:Lu6/d;

.field private d:Lorg/json/JSONObject;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "configure_dev_settings"

    .line 2
    iput-object v0, p0, Lx6/a;->a:Ljava/lang/String;

    const-string v0, "config_json"

    .line 3
    iput-object v0, p0, Lx6/a;->b:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lx6/a;->e:Landroid/content/Context;

    .line 5
    new-instance v0, Lu6/d;

    invoke-direct {v0, p1}, Lu6/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lx6/a;->c:Lu6/d;

    .line 6
    invoke-virtual {v0, p1}, Lu6/d;->a(Landroid/content/Context;)Lu6/c;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p1}, Lu6/c;->g()Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    iput-object p1, p0, Lx6/a;->d:Lorg/json/JSONObject;

    return-void
.end method

.method public static b(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    new-instance v0, Lx6/a;

    invoke-direct {v0, p0}, Lx6/a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0}, Lx6/a;->a()Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lx6/a;->d:Lorg/json/JSONObject;

    return-object v0
.end method

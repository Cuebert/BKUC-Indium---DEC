.class public abstract Ll9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lorg/json/JSONObject;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(ZLorg/json/JSONObject;)V
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll9/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public abstract c()Landroid/content/Context;
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll9/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll9/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Ll9/a;->c:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Ll9/a;->c:Lorg/json/JSONObject;

    .line 3
    :cond_0
    iget-object v0, p0, Ll9/a;->c:Lorg/json/JSONObject;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ll9/a;->d:Ljava/lang/String;

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ll9/a;->b:Ljava/lang/String;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ll9/a;->a:Ljava/lang/String;

    return-void
.end method

.method public j(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Ll9/a;->c:Lorg/json/JSONObject;

    return-void
.end method

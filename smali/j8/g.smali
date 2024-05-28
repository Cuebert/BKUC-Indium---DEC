.class public Lj8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/m;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj8/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lj8/i;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/g;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lj8/i;->b()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "category"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/g;->d:Ljava/lang/String;

    const-string v0, "revokedNotificationType"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/g;->b:Ljava/lang/String;

    const-string v0, "revokeUpToDate"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj8/g;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lj8/g;->c:Ljava/lang/String;

    invoke-static {v0}, Lc9/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Lj8/m;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lj8/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lj8/m;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/g;->a:Ljava/lang/String;

    .line 3
    check-cast p1, Lj8/g;

    invoke-virtual {p1}, Lj8/g;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/g;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lj8/g;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj8/g;->c:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lj8/g;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj8/g;->d:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj8/g;->c:Ljava/lang/String;

    return-object v0
.end method

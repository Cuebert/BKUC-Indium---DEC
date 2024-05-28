.class public Lz8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Ly8/a;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ly8/a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method b(Ly8/a;)V
    .locals 2

    const-string v0, "rbx.accountsettings"

    const-string v1, " api failure"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lz8/a;->a(Ly8/a;Ljava/lang/String;)V

    return-void
.end method

.method c(Ljava/lang/String;ILy8/a;)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0xc8

    if-ne p2, v1, :cond_0

    .line 1
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p1, Lz8/b;

    invoke-direct {p1, p2}, Lz8/b;-><init>(Lorg/json/JSONObject;)V

    .line 3
    invoke-virtual {p1}, Lz8/b;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JSONException thrown while parsing response to fetch user theme from server. Exception message: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "response code != 200, response code = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.accountsettings"

    invoke-static {p2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :goto_0
    invoke-virtual {p0, p3, v0}, Lz8/a;->a(Ly8/a;Ljava/lang/String;)V

    return-void
.end method

.method public d(JLy8/a;)V
    .locals 1

    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->f()Lr9/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lr9/b;->a(J)Lgc/b;

    move-result-object p1

    new-instance p2, Lz8/a$a;

    invoke-direct {p2, p0, p3}, Lz8/a$a;-><init>(Lz8/a;Ly8/a;)V

    invoke-interface {p1, p2}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method

.class Lea/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/e;->f(Landroid/app/Activity;Ls0/t;Ljava/lang/String;Lea/e$c;Ls0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls0/l<",
        "Ls0/u;",
        "Lt0/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lea/e$c;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lea/e;


# direct methods
.method constructor <init>(Lea/e;Lea/e$c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lea/e$a;->c:Lea/e;

    iput-object p2, p0, Lea/e$a;->a:Lea/e$c;

    iput-object p3, p0, Lea/e$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lt0/m;

    invoke-virtual {p0, p1}, Lea/e$a;->b(Lt0/m;)V

    return-void
.end method

.method public b(Lt0/m;)V
    .locals 2

    .line 1
    invoke-static {}, Lea/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error getting credentials: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2
    instance-of v0, p1, Lt0/n;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v1, 0x2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lt0/k;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    instance-of v0, p1, Lt0/r;

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v1, 0x6

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    instance-of v0, p1, Lt0/q;

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v1, 0x7

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c(Ls0/u;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ls0/u;->a()Ls0/i;

    move-result-object p1

    .line 2
    instance-of v0, p1, Ls0/a0;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Ls0/a0;

    .line 4
    invoke-virtual {p1}, Ls0/a0;->a()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    iget-object v1, p0, Lea/e$a;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lea/e$c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Ls0/y;

    if-eqz v0, :cond_1

    .line 7
    check-cast p1, Ls0/y;

    invoke-virtual {p1}, Ls0/y;->a()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Ls0/y;->b()Ljava/lang/String;

    move-result-object p1

    .line 9
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "username"

    .line 10
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "password"

    .line 11
    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    iget-object p1, p0, Lea/e$a;->a:Lea/e$c;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lea/e$a;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lea/e$c;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    iget-object v0, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v1, 0x4

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object p1, p0, Lea/e$a;->a:Lea/e$c;

    const/4 v0, 0x0

    const-string v1, "Unexpected GetCredentialResponse"

    invoke-interface {p1, v0, v1}, Lea/e$c;->b(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ls0/u;

    invoke-virtual {p0, p1}, Lea/e$a;->c(Ls0/u;)V

    return-void
.end method

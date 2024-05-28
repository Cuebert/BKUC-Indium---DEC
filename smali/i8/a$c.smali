.class Li8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/d<",
        "Lob/j0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lh8/s$b;

.field final synthetic e:Li8/a;


# direct methods
.method constructor <init>(Li8/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;)V
    .locals 0

    iput-object p1, p0, Li8/a$c;->e:Li8/a;

    iput-object p2, p0, Li8/a$c;->a:Landroid/content/Context;

    iput-object p3, p0, Li8/a$c;->b:Ljava/lang/String;

    iput-object p4, p0, Li8/a$c;->c:Ljava/lang/String;

    iput-object p5, p0, Li8/a$c;->d:Lh8/s$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgc/b;Lgc/t;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Lob/j0;",
            ">;",
            "Lgc/t<",
            "Lob/j0;",
            ">;)V"
        }
    .end annotation

    const-string p1, "rbx.push"

    .line 1
    invoke-virtual {p2}, Lgc/t;->b()I

    move-result v0

    const-string v1, "metadataInaccessible"

    const/16 v2, 0xc8

    if-ne v0, v2, :cond_0

    .line 2
    :try_start_0
    invoke-static {p2}, Lc9/o;->a(Lgc/t;)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v2, p0, Li8/a$c;->e:Li8/a;

    iget-object v3, p0, Li8/a$c;->a:Landroid/content/Context;

    iget-object v4, p0, Li8/a$c;->b:Ljava/lang/String;

    iget-object v5, p0, Li8/a$c;->c:Ljava/lang/String;

    iget-object v6, p0, Li8/a$c;->d:Lh8/s$b;

    new-instance v7, Lj8/j;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v7, v0}, Lj8/j;-><init>(Lorg/json/JSONObject;)V

    new-instance v8, Lh8/j;

    invoke-direct {v8}, Lh8/j;-><init>()V

    invoke-virtual/range {v2 .. v8}, Li8/a;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lh8/s$b;Lj8/j;Lh8/j;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 5
    invoke-virtual {p2}, Lorg/json/JSONException;->printStackTrace()V

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RGLS.onMessageReceived() JSONException msg:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iget-object p1, p0, Li8/a$c;->b:Ljava/lang/String;

    iget-object p2, p0, Li8/a$c;->c:Ljava/lang/String;

    invoke-static {v1, p1, p2}, Lcom/roblox/client/f0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2}, Lgc/t;->b()I

    move-result p1

    const/16 p2, 0x191

    if-ne p1, p2, :cond_1

    .line 9
    iget-object p1, p0, Li8/a$c;->b:Ljava/lang/String;

    iget-object p2, p0, Li8/a$c;->c:Ljava/lang/String;

    const-string v0, "unauthenticated"

    invoke-static {v0, p1, p2}, Lcom/roblox/client/f0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Li8/a$c;->b:Ljava/lang/String;

    iget-object p2, p0, Li8/a$c;->c:Ljava/lang/String;

    invoke-static {v1, p1, p2}, Lcom/roblox/client/f0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public b(Lgc/b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Lob/j0;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Li8/a$c;->b:Ljava/lang/String;

    iget-object p2, p0, Li8/a$c;->c:Ljava/lang/String;

    const-string v0, "metadataInaccessible"

    invoke-static {v0, p1, p2}, Lcom/roblox/client/f0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

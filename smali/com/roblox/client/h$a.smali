.class Lcom/roblox/client/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/h;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/h;


# direct methods
.method constructor <init>(Lcom/roblox/client/h;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/h$a;->a:Lcom/roblox/client/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLq7/d$c;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAssetRetrieved() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.catalog"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/h$a;->a:Lcom/roblox/client/h;

    invoke-static {p1, p2}, Lcom/roblox/client/h;->a(Lcom/roblox/client/h;Lq7/d$c;)Lq7/d$c;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/roblox/client/h$a;->a:Lcom/roblox/client/h;

    invoke-virtual {p1}, Lq7/d$c;->a()J

    move-result-wide v1

    .line 4
    invoke-virtual {p1}, Lq7/d$c;->c()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {p1}, Lq7/d$c;->b()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {p1}, Lq7/d$c;->d()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/h;->d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

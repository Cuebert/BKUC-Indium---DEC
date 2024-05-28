.class Lcom/roblox/client/c1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/c1;->b(Lcom/roblox/client/c1$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/c1$c;

.field final synthetic b:Lcom/roblox/client/c1;


# direct methods
.method constructor <init>(Lcom/roblox/client/c1;Lcom/roblox/client/c1$c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c1$a;->b:Lcom/roblox/client/c1;

    iput-object p2, p0, Lcom/roblox/client/c1$a;->a:Lcom/roblox/client/c1$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh7/j;)V
    .locals 0

    return-void
.end method

.method public b(Lh7/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/c1$a;->b:Lcom/roblox/client/c1;

    invoke-static {v0, p1}, Lcom/roblox/client/c1;->a(Lcom/roblox/client/c1;Lh7/j;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/c1$a;->a:Lcom/roblox/client/c1$c;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/c1$a;->b:Lcom/roblox/client/c1;

    iget-object v0, v0, Lcom/roblox/client/c1;->a:Lcom/roblox/client/c1$d;

    invoke-interface {p1, v0}, Lcom/roblox/client/c1$c;->a(Lcom/roblox/client/c1$d;)V

    :cond_0
    return-void
.end method

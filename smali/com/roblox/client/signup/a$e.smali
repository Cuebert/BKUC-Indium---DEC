.class Lcom/roblox/client/signup/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a;->I3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$e;->n:Lcom/roblox/client/signup/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$e;->n:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->m3(Lcom/roblox/client/signup/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a$e;->n:Lcom/roblox/client/signup/a;

    sget-object v1, Lcom/roblox/client/signup/a$c0;->n:Lcom/roblox/client/signup/a$c0;

    invoke-static {v0, v1}, Lcom/roblox/client/signup/a;->B2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$c0;)V

    :cond_0
    return-void
.end method

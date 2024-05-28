.class Lcom/roblox/client/startup/ActivitySplash$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/ActivitySplash;->L1(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/startup/ActivitySplash;


# direct methods
.method constructor <init>(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash$a;->n:Lcom/roblox/client/startup/ActivitySplash;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash$a;->n:Lcom/roblox/client/startup/ActivitySplash;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roblox/client/startup/ActivitySplash;->A1(Lcom/roblox/client/startup/ActivitySplash;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 2
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash$a;->n:Lcom/roblox/client/startup/ActivitySplash;

    invoke-static {v0}, Lcom/roblox/client/startup/ActivitySplash;->B1(Lcom/roblox/client/startup/ActivitySplash;)Lcom/roblox/client/components/LoadingBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    return-void
.end method

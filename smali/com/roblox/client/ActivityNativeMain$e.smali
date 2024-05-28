.class Lcom/roblox/client/ActivityNativeMain$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->n:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "[GrantPendingPurchase] Executor::run: "

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$e;->n:Lcom/roblox/client/ActivityNativeMain;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roblox/client/ActivityNativeMain;->F1(Lcom/roblox/client/ActivityNativeMain;Z)V

    return-void
.end method

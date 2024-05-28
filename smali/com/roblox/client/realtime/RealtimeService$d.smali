.class final Lcom/roblox/client/realtime/RealtimeService$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/realtime/RealtimeService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/realtime/RealtimeService;


# direct methods
.method public constructor <init>(Lcom/roblox/client/realtime/RealtimeService;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$d;->a:Lcom/roblox/client/realtime/RealtimeService;

    .line 2
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->arg1:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$d;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->a(Lcom/roblox/client/realtime/RealtimeService;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$d;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->b(Lcom/roblox/client/realtime/RealtimeService;)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x18

    if-ne p1, v0, :cond_2

    .line 4
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$d;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->a(Lcom/roblox/client/realtime/RealtimeService;)V

    goto :goto_0

    :cond_2
    const/16 v0, 0x19

    if-ne p1, v0, :cond_3

    .line 5
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$d;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->c(Lcom/roblox/client/realtime/RealtimeService;)V

    goto :goto_0

    :cond_3
    const/16 v0, 0x1e

    if-ne p1, v0, :cond_4

    .line 6
    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$d;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->b(Lcom/roblox/client/realtime/RealtimeService;)V

    .line 7
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    :cond_4
    :goto_0
    return-void
.end method

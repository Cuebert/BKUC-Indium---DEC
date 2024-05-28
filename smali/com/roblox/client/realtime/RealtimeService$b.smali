.class Lcom/roblox/client/realtime/RealtimeService$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/realtime/RealtimeService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/realtime/RealtimeService$b;->a:Z

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/realtime/RealtimeService$b;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/client/realtime/RealtimeService$a;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService$b;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/roblox/client/d1;->l(Landroid/content/Context;)Z

    move-result p1

    .line 2
    iget-boolean p2, p0, Lcom/roblox/client/realtime/RealtimeService$b;->b:Z

    if-eqz p2, :cond_0

    .line 3
    iput-boolean p1, p0, Lcom/roblox/client/realtime/RealtimeService$b;->a:Z

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/roblox/client/realtime/RealtimeService$b;->b:Z

    goto :goto_0

    .line 5
    :cond_0
    iget-boolean p2, p0, Lcom/roblox/client/realtime/RealtimeService$b;->a:Z

    if-eq p1, p2, :cond_1

    .line 6
    iput-boolean p1, p0, Lcom/roblox/client/realtime/RealtimeService$b;->a:Z

    .line 7
    new-instance p2, La7/e;

    invoke-direct {p2, p1}, La7/e;-><init>(Z)V

    .line 8
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    invoke-virtual {p1, p2}, Lbc/c;->j(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

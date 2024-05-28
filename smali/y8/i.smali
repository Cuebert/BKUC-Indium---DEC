.class public Ly8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lcom/roblox/engine/jni/memstorage/Connection;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "UserThemeListener"

    .line 2
    iput-object v0, p0, Ly8/i;->a:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Ly8/i;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ly8/h;

    invoke-direct {v0, p0}, Ly8/h;-><init>(Ly8/i;)V

    const-string v1, "ThemeUpdate"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Ly8/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Ly8/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method

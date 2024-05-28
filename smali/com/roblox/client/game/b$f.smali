.class public Lcom/roblox/client/game/b$f;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/roblox/client/game/b$h;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b$h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string v0, "rbx.appshell"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/game/b$f;->b:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lcom/roblox/client/game/b$f;->a:Lcom/roblox/client/game/b$h;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 3

    .line 1
    invoke-static {}, Lw8/d;->n()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-static {}, Lx6/b;->a()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    new-instance v0, Lr8/a;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lr8/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lr8/a;->e()Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "overridePayload = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    move-object v1, v0

    goto :goto_0

    :cond_2
    const-string v1, "no overrides"

    :goto_0
    const-string v2, "rbx.appshell"

    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    :goto_1
    invoke-static {}, Lcom/roblox/client/p0;->I()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInitClientSettings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_2
    const/4 p1, 0x1

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/RobloxApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object v0

    invoke-virtual {v0}, Lw8/k;->r()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePostClientSettingsLoadedInitialization3(Ljava/util/List;)V

    const-string v0, "rbx.appshell"

    const-string v1, "GetClientSettingsTask onPostExecute initialized TaskScheduler"

    .line 4
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/b$f;->a:Lcom/roblox/client/game/b$h;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/roblox/client/game/b$h;->a(I)V

    :cond_1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b$f;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b$f;->b(Ljava/lang/Integer;)V

    return-void
.end method

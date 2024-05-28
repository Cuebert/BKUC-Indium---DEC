.class Lcom/roblox/client/ActivityNativeMain$n;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/ActivityNativeMain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/client/ActivityNativeMain;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string v0, "rbx.main"

    const-string v1, "Reloading lua app."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain$n;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$n;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ActivityNativeMain;

    if-eqz p1, :cond_1

    .line 2
    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->H1(Lcom/roblox/client/ActivityNativeMain;)Lb7/a;

    move-result-object v0

    invoke-virtual {v0}, Lb7/a;->d()Lcom/roblox/client/game/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/roblox/client/game/a;->I2()Landroid/view/Surface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lx7/b;->d()Z

    .line 5
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p1}, Lcom/roblox/client/game/b;->y(Landroid/content/Context;Landroid/view/Surface;Landroid/app/Activity;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/roblox/client/game/b;->x(Landroid/content/Context;Landroid/view/Surface;)V

    .line 8
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 9
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$n;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ActivityNativeMain;

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->G1(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->G1(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain$n;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain$n;->b(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$n;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/ActivityNativeMain;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->G1(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->G1(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

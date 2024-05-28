.class Lcom/roblox/client/l$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/l;->d(Lcom/roblox/client/l$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
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
.field final synthetic a:Lcom/roblox/client/l$c;

.field final synthetic b:Lcom/roblox/client/l;


# direct methods
.method constructor <init>(Lcom/roblox/client/l;Lcom/roblox/client/l$c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/l$a;->b:Lcom/roblox/client/l;

    iput-object p2, p0, Lcom/roblox/client/l$a;->a:Lcom/roblox/client/l$c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 0

    iget-object p1, p0, Lcom/roblox/client/l$a;->b:Lcom/roblox/client/l;

    invoke-static {p1}, Lcom/roblox/client/l;->a(Lcom/roblox/client/l;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/l$a;->b:Lcom/roblox/client/l;

    invoke-static {p1}, Lcom/roblox/client/l;->b(Lcom/roblox/client/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/l$a;->b:Lcom/roblox/client/l;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/roblox/client/l;->c(Lcom/roblox/client/l;Z)Z

    .line 2
    iget-object v0, p0, Lcom/roblox/client/l$a;->a:Lcom/roblox/client/l$c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/roblox/client/l$c;->a(Z)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/l$a;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/roblox/client/l$a;->b(Ljava/lang/Boolean;)V

    return-void
.end method

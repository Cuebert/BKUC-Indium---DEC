.class Lcom/roblox/client/app/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/engine/jni/memstorage/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/app/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/app/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/app/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/app/a$a;->a:Lcom/roblox/client/app/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrowserService.OpenBrowserWindow : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.browserservice"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lcom/roblox/client/app/d;

    invoke-direct {v0, p1}, Lcom/roblox/client/app/d;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/app/a$a;->a:Lcom/roblox/client/app/a;

    new-instance v1, Lcom/roblox/client/app/a$a$a;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/app/a$a$a;-><init>(Lcom/roblox/client/app/a$a;Lcom/roblox/client/app/d;)V

    invoke-static {p1, v1}, Lcom/roblox/client/app/a;->b(Lcom/roblox/client/app/a;Ljava/lang/Runnable;)V

    return-void
.end method

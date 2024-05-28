.class Lcom/roblox/client/app/a$b;
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

    iput-object p1, p0, Lcom/roblox/client/app/a$b;->a:Lcom/roblox/client/app/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 1

    const-string p1, "rbx.browserservice"

    const-string v0, "BrowserService.CloseBrowserWindow"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/roblox/client/app/a$b;->a:Lcom/roblox/client/app/a;

    new-instance v0, Lcom/roblox/client/app/a$b$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/app/a$b$a;-><init>(Lcom/roblox/client/app/a$b;)V

    invoke-static {p1, v0}, Lcom/roblox/client/app/a;->b(Lcom/roblox/client/app/a;Ljava/lang/Runnable;)V

    return-void
.end method

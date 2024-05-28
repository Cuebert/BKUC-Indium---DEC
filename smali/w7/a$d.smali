.class Lw7/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lw7/a;


# direct methods
.method private constructor <init>(Lw7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw7/a$d;->a:Lw7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lw7/a;Lw7/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lw7/a$d;-><init>(Lw7/a;)V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw7/a$d;->a:Lw7/a;

    invoke-static {v0}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "PushNotificationRegistration"

    if-eqz v0, :cond_2

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw7/a$d;->a:Lw7/a;

    .line 3
    invoke-static {v0}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/n;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_0

    .line 4
    iget-object v0, p0, Lw7/a$d;->a:Lw7/a;

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/c;->d(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->S()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v0

    iget-object v2, p0, Lw7/a$d;->a:Lw7/a;

    invoke-static {v2}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lh8/m;->m(Landroid/content/Context;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lw7/a$d;->a:Lw7/a;

    invoke-static {v0}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/n;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v0

    iget-object v2, p0, Lw7/a$d;->a:Lw7/a;

    invoke-static {v2}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lh8/m;->n(Landroid/content/Context;Z)V

    .line 9
    :cond_2
    :goto_0
    iget-object v0, p0, Lw7/a$d;->a:Lw7/a;

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/c;->d(Ljava/lang/String;)V

    return-void
.end method

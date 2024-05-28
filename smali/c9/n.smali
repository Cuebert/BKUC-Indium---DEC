.class public Lc9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;I)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/app/k$e;

    const-string v1, "channel_urgent"

    invoke-direct {v0, p0, v1}, Landroidx/core/app/k$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget v1, Lcom/roblox/client/x;->v:I

    .line 2
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->z(I)Landroidx/core/app/k$e;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->g3:I

    .line 3
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->o(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v0

    new-instance v1, Landroidx/core/app/k$c;

    invoke-direct {v1}, Landroidx/core/app/k$c;-><init>()V

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/core/app/k$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Landroidx/core/app/k$e;->B(Landroidx/core/app/k$g;)Landroidx/core/app/k$e;

    move-result-object p1

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Landroidx/core/app/k$e;->y(I)Landroidx/core/app/k$e;

    move-result-object p1

    .line 7
    invoke-static {p0}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroidx/core/app/n;->d(ILandroid/app/Notification;)V

    return-void
.end method

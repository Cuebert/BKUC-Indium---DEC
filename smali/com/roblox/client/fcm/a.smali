.class public Lcom/roblox/client/fcm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lj8/k;
    .locals 1

    sget-object v0, Lj8/k;->o:Lj8/k;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "GcmPlatform"

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "GcmToken"

    return-object v0
.end method

.method public d(Landroid/content/Context;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/roblox/client/fcm/a;->e(Landroid/content/Context;)Z

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/fcm/a;->f(Landroid/content/Context;ZZ)V

    return-void
.end method

.method public e(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lc9/l;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method f(Landroid/content/Context;ZZ)V
    .locals 1

    if-eqz p3, :cond_0

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p3

    invoke-interface {p3}, Lc7/e;->r()Z

    move-result p3

    if-eqz p3, :cond_0

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p3, v0, :cond_0

    .line 2
    invoke-static {p1}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/core/app/n;->a()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p1, "rbx.push"

    const-string p2, "New token but notifications disabled. Not registering."

    .line 3
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_0
    new-instance p3, Landroid/content/Intent;

    const-class v0, Lcom/roblox/client/fcm/RegistrationIntentService;

    invoke-direct {p3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "AuthorizePushNotificationsForUser"

    .line 5
    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 6
    invoke-static {p1, p3}, Lcom/roblox/client/fcm/RegistrationIntentService;->i(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

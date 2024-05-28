.class public Lcom/roblox/client/ShareAppChosenReceiver;
.super Lcom/roblox/client/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/roblox/client/l0;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "android.intent.extra.CHOSEN_COMPONENT"

    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    instance-of p2, p1, Landroid/content/ComponentName;

    if-eqz p2, :cond_0

    .line 5
    check-cast p1, Landroid/content/ComponentName;

    .line 6
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {p1}, Lv8/b;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

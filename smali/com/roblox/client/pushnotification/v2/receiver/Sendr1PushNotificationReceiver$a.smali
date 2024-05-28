.class Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->j(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/content/Context;

.field final synthetic o:Landroid/content/Intent;

.field final synthetic p:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;


# direct methods
.method constructor <init>(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->p:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iput-object p2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->n:Landroid/content/Context;

    iput-object p3, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->o:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->n:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/roblox/client/n;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->p:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->o:Landroid/content/Intent;

    invoke-static {v1, v0, v2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->a(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 4
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v2

    invoke-virtual {v2, v1}, Lh8/m;->r(Landroid/os/Bundle;)V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->p:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->o:Landroid/content/Intent;

    invoke-static {v1, v2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->b(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->n:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 8
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lla/c;->e(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->p:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->o:Landroid/content/Intent;

    invoke-static {v0, v2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->c(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.class Lcom/roblox/client/fcm/RegistrationIntentService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/fcm/RegistrationIntentService;->f(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg4/h<",
        "Lr5/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/roblox/client/fcm/RegistrationIntentService;


# direct methods
.method constructor <init>(Lcom/roblox/client/fcm/RegistrationIntentService;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/fcm/RegistrationIntentService$a;->b:Lcom/roblox/client/fcm/RegistrationIntentService;

    iput-object p2, p0, Lcom/roblox/client/fcm/RegistrationIntentService$a;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr5/a;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lr5/a;->a()Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RegistrationIntentService.onHandleIntent() Token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lcom/roblox/client/fcm/RegistrationIntentService$a;->a:Landroid/content/Intent;

    const-string v1, "AuthorizePushNotificationsForUser"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 4
    invoke-static {}, Lh8/m;->c()Lh8/m;

    move-result-object v1

    new-instance v2, Lj8/l;

    iget-object v3, p0, Lcom/roblox/client/fcm/RegistrationIntentService$a;->b:Lcom/roblox/client/fcm/RegistrationIntentService;

    invoke-direct {v2, p1, v3, v0}, Lj8/l;-><init>(Ljava/lang/String;Landroid/content/Context;Z)V

    invoke-virtual {v1, v2}, Lh8/m;->l(Lj8/l;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lr5/a;

    invoke-virtual {p0, p1}, Lcom/roblox/client/fcm/RegistrationIntentService$a;->a(Lr5/a;)V

    return-void
.end method

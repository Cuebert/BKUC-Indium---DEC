.class Lcom/roblox/client/fcm/RegistrationIntentService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/fcm/RegistrationIntentService;->f(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/fcm/RegistrationIntentService;


# direct methods
.method constructor <init>(Lcom/roblox/client/fcm/RegistrationIntentService;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/fcm/RegistrationIntentService$b;->a:Lcom/roblox/client/fcm/RegistrationIntentService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    new-instance v0, La7/k;

    const-string v1, "PushNotificationRegistrationFailed"

    invoke-direct {v0, v1}, La7/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lbc/c;->j(Ljava/lang/Object;)V

    return-void
.end method

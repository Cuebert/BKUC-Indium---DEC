.class public Lcom/roblox/client/fcm/RegistrationIntentService;
.super Landroidx/core/app/h;
.source "SourceFile"


# static fields
.field private static final w:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "friends"

    const-string v1, "chat"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/fcm/RegistrationIntentService;->w:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/core/app/h;-><init>()V

    return-void
.end method

.method static i(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    const/16 v1, 0x44c

    invoke-static {p0, v0, v1, p1}, Landroidx/core/app/h;->c(Landroid/content/Context;Landroid/content/ComponentName;ILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected f(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object v0

    sget-object v1, Lx7/b$d;->o:Lx7/b$d;

    invoke-virtual {v0, p0, v1}, Lx7/b;->k(Landroid/content/Context;Lx7/b$d;)V

    .line 2
    invoke-static {p0}, Lh7/b;->e(Landroid/content/Context;)V

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/google/firebase/iid/FirebaseInstanceId;->a()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Lg4/l;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/roblox/client/fcm/RegistrationIntentService$a;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/fcm/RegistrationIntentService$a;-><init>(Lcom/roblox/client/fcm/RegistrationIntentService;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lg4/l;->f(Lg4/h;)Lg4/l;

    .line 5
    new-instance p1, Lcom/roblox/client/fcm/RegistrationIntentService$b;

    invoke-direct {p1, p0}, Lcom/roblox/client/fcm/RegistrationIntentService$b;-><init>(Lcom/roblox/client/fcm/RegistrationIntentService;)V

    invoke-virtual {v0, p1}, Lg4/l;->d(Lg4/g;)Lg4/l;

    return-void
.end method

.method public onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/core/app/h;->onCreate()V

    .line 2
    invoke-static {p0}, Lka/a;->c(Landroid/content/Context;)V

    return-void
.end method

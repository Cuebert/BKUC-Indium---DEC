.class public Lcom/roblox/client/implementation/AppImplementations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/a;
.implements Lw8/n;
.implements Lb8/a;
.implements Lm7/a;
.implements La8/a;
.implements Lq6/b;
.implements Lc4/a$a;


# static fields
.field private static final TAG:Ljava/lang/String; = "AppImplementations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppsFlyerManager()Lx7/c;
    .locals 1

    invoke-static {}, Lp6/a;->p()Lp6/a;

    move-result-object v0

    return-object v0
.end method

.method public getIdentityProtocol()Lja/e;
    .locals 1

    invoke-static {}, Lja/e;->w()Lja/e;

    move-result-object v0

    return-object v0
.end method

.method public getNativeUtilProtocol()Ly9/i;
    .locals 1

    invoke-static {}, Ly9/i;->O()Ly9/i;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionsProtocol()Lna/d;
    .locals 1

    invoke-static {}, Lna/g;->C()Lna/g;

    move-result-object v0

    return-object v0
.end method

.method public getRtcAudioManager(Landroid/content/Context;)Lq6/a;
    .locals 1

    new-instance v0, Lq6/c;

    invoke-direct {v0, p1}, Lq6/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public installSecurityProviderIfNeeded(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1, p0}, Lc4/a;->b(Landroid/content/Context;Lc4/a$a;)V

    return-void
.end method

.method public onProviderInstallFailed(ILandroid/content/Intent;)V
    .locals 0

    const-string p1, "AppImplementations"

    const-string p2, "Android Security Provider could not be updated or installed. Please install or update Google Play Services."

    invoke-static {p1, p2}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onProviderInstalled()V
    .locals 0

    return-void
.end method
